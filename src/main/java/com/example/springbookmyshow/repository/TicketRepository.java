package com.example.springbookmyshow.repository;

import com.example.springbookmyshow.model.TicketBooking;
import com.example.springbookmyshow.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends JpaRepository<TicketBooking, Long> {
}
