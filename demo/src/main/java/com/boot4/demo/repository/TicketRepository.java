package com.boot4.demo.repository;


import com.boot4.demo.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

// Step 3: Repository to Fetch Min/Max Datetime (adjust table/column names)
@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {  // Assuming Ticket entity exists

    @Query(value = "SELECT MIN(TicketTime) AS MinTime, MAX(TicketTime) AS MaxTime FROM Tickets", nativeQuery = true)
    Object[] getFullTimeRange();  // Returns Object[0] = min (Timestamp), Object[1] = max
}