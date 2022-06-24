package com.example.springbookmyshow.service;

import com.example.springbookmyshow.dto.AuthResponse;
import com.example.springbookmyshow.dto.LoginRequest;
import com.example.springbookmyshow.dto.RegisterRequest;
import com.example.springbookmyshow.dto.TicketBookingRequest;
import com.example.springbookmyshow.model.Movie;
import com.example.springbookmyshow.model.TicketBooking;
import com.example.springbookmyshow.model.User;
import com.example.springbookmyshow.repository.TicketRepository;
import com.example.springbookmyshow.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Consumer;

@Service
public class AuthService {
    @Autowired
    private UserRepository userRepository;


    private boolean isSuccess = false;
    private String message = "Invalid login";

    public void register(RegisterRequest registerRequest) {
        User user = new User();
        user.setConfirmpassword(registerRequest.getConfirmpassword());
        user.setEmail(registerRequest.getEmail());
        user.setPassword(registerRequest.getPassword());
        userRepository.save(user);
    }

    public AuthResponse login(LoginRequest loginRequest) {
        List<User> users = userRepository.findAll();
        isSuccess = users.stream().anyMatch(user -> (user.getEmail().equals(loginRequest.getEmail()) &&
                user.getPassword().equals(loginRequest.getPassword())));

        if (isSuccess) {
            message = "Valid Login";
        }
        if (isSuccess) {
            return new AuthResponse(message, isSuccess);
        }
        return null;
    }


}
