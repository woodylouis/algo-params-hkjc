package com.boot4.demo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.CallableStatement;
import java.sql.Timestamp;
import java.sql.Types;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

@Service
public class ConcurrentInsertTicketStoredProcService {

    private final JdbcTemplate jdbcTemplate;
    private final Object lock = new Object();
    private final String logFilePath = "errors.log";

    @Value("${app.number-of-threads:10}")
    private int numberOfThreads;

    @Value("${app.seconds-for-end-date:60}")
    private int seconds;

    public ConcurrentInsertTicketStoredProcService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void executeConcurrentCalls() {
        System.out.println("Starting " + numberOfThreads + " concurrent calls to stored procedure...");
        String targetBusinessDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"));
        LocalDateTime newSellingDate = LocalDateTime.now();
        Long poolId = null; // NULL bigint
        LocalDateTime baseStart = LocalDateTime.of(2025, 11, 30, 20, 0, 0);

        List<Thread> threads = new ArrayList<>();

        for (int i = 0; i < numberOfThreads; i++) {
            int threadId = i + 1;
            LocalDateTime sourceStartDateTime = baseStart.plusSeconds(5L * i);
            LocalDateTime sourceEndDateTime = sourceStartDateTime.plus(seconds, ChronoUnit.SECONDS);
            Thread thread = new Thread(() -> callStoredProcedure(
                    targetBusinessDate, newSellingDate, poolId,
                    sourceStartDateTime, sourceEndDateTime, threadId
            ), "SP-Thread-" + threadId);
            threads.add(thread);
            thread.start();
        }

        // Wait for all threads to finish
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                logError("Thread interrupted: " + e.getMessage());
            }
        }

        System.out.println("All " + numberOfThreads + " threads completed.");
    }


    private void callStoredProcedure(String targetBusinessDate,
                                     LocalDateTime newSellingDate,
                                     Long targetPoolID,
                                     LocalDateTime sourceStartDateTime,
                                     LocalDateTime sourceEndDateTime,
                                     int threadId) {
        try {

            String STORED_PROC_NAME = "dbo.sp_eaglei_replay_ticket_for_insert";

            String sql = "{call " + STORED_PROC_NAME + "(?, ?, ?, ?, ?)}";

                jdbcTemplate.execute(sql, (CallableStatement cs) -> {
                    // Parameter order MUST match your SP definition exactly!
                    cs.setString(1, targetBusinessDate);                    // @TargetBusinessDate VARCHAR(10)
                    cs.setTimestamp(2, Timestamp.valueOf(newSellingDate));     // @NewSellingDate DATETIME
                    if (targetPoolID == null) {
                        cs.setNull(3, Types.BIGINT);                             // @TargetPoolID BIGINT = NULL
                    } else {
                        cs.setLong(3, targetPoolID);
                    }
                    cs.setTimestamp(4, Timestamp.valueOf(sourceStartDateTime)); // @SourceStartDateTime
                    cs.setTimestamp(5, Timestamp.valueOf(sourceEndDateTime));   // @SourceEndDateTime

                    cs.execute();
                    return null;
                });

                System.out.println("Thread " + threadId + " SUCCESS");

        } catch (Exception ex) {
            String errorMsg = "Thread " + threadId + " failed: " + ex.getMessage();
            logError(errorMsg + "\n" + ex);
            System.err.println(errorMsg + " (see errors.log)");
        }
    }

    private void logError(String message) {
        synchronized (lock) {
            try (PrintWriter pw = new PrintWriter(new FileWriter(logFilePath, true))) {
                pw.println(LocalDateTime.now() + " | " + message);
            } catch (IOException e) {
                System.err.println("Failed to write to log file: " + e.getMessage());
            }
        }
    }
}
