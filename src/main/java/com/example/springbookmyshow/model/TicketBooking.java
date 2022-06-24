package com.example.springbookmyshow.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TicketBooking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String moviename;
    @Column(nullable = false)
    private int noOfTickets;
    @Column(nullable = false)
    private int price;
    @Column(nullable = false)
    private String timings;
}
