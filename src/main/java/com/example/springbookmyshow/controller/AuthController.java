package com.example.springbookmyshow.controller;

import com.example.springbookmyshow.dto.AuthResponse;
import com.example.springbookmyshow.dto.LoginRequest;
import com.example.springbookmyshow.dto.RegisterRequest;
import com.example.springbookmyshow.dto.TicketBookingRequest;
import com.example.springbookmyshow.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin("http://localhost:4200/")
public class AuthController {
    @Autowired
    private AuthService authService;

    //    /register
    @PostMapping("/register")
    public ResponseEntity register(@RequestBody RegisterRequest registerRequest) {
        authService.register(registerRequest);
        return new ResponseEntity(HttpStatus.OK);
    }

    @PostMapping("/login")
    public AuthResponse login(@RequestBody LoginRequest loginRequest) {
        return authService.login(loginRequest);
    }


}
