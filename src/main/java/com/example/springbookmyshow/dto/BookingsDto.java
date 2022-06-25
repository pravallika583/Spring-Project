package com.example.springbookmyshow.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BookingsDto {
    private Long bookingsId;
    private String movieName;
    private Integer noOfTickets;
    private Integer price;
    private String timings;

}

