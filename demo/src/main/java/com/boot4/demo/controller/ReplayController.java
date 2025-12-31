/*
package com.boot4.demo.controller;


import com.boot4.demo.service.EagleReplayService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/replay")
@RequiredArgsConstructor
public class ReplayController {

    private final EagleReplayService replayService;

    @PostMapping("/tickets")
    public ResponseEntity<String> replay(
            @RequestParam String targetBusinessDate,        // e.g. "2025-11-15"
            @RequestParam(required = false) LocalDate newSellingDate,  // optional, defaults to today
            @RequestParam(required = false) Long targetPoolId         // optional, null = all
    ) {
        LocalDateTime sellingDate = (newSellingDate != null)
                ? newSellingDate.atStartOfDay()
                : LocalDateTime.now();

        int rowsAffected = replayService.replayTickets(targetBusinessDate, sellingDate, targetPoolId);

        return ResponseEntity.ok("Procedure executed successfully. Rows affected / tickets replayed: " + rowsAffected);
    }
}*/
