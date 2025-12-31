package com.boot4.demo.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Tickets")  // Change if your table name is different
@Getter @Setter @NoArgsConstructor
public class Ticket {

    @Id
    private Long ticketID;   // This matches your column name: TicketID (case-insensitive in SQL Server)

    // You can add the datetime column only if you need it for queries
    // (not needed if you're only using native queries)
    // @Column(name = "TicketTime")
    // private LocalDateTime ticketTime;
}