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
public class Movie {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String img;
    @Column(nullable = false)
    private String moviename;
    @Column(nullable = false)
    private String category;
    @Column(nullable = false)
    private int price;
}
