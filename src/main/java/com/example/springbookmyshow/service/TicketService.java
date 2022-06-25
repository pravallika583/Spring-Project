package com.example.springbookmyshow.service;

import com.example.springbookmyshow.dto.TicketBookingRequest;
import com.example.springbookmyshow.model.TicketBooking;
import com.example.springbookmyshow.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketService {
    @Autowired
    private TicketRepository ticketRepository;
    public void ticketbooking(TicketBookingRequest ticketBookingRequest) {
        TicketBooking ticketBooking = new TicketBooking();
        ticketBooking.setMoviename(ticketBookingRequest.getMoviename());
        ticketBooking.setNoOfTickets(ticketBookingRequest.getNoOfTickets());
        ticketBooking.setPrice(ticketBookingRequest.getPrice());
        ticketBooking.setTimings(ticketBookingRequest.getTimings());
        ticketRepository.save(ticketBooking);
    }

    public List<TicketBooking> getAllBookings() {
        return ticketRepository.findAll();
    }
}
