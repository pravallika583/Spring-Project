package com.example.springbookmyshow.controller;

import com.example.springbookmyshow.dto.MovieDto;
import com.example.springbookmyshow.model.Movie;
import com.example.springbookmyshow.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/post")
@CrossOrigin("http://localhost:4200/")
public class MovieContoller {
    @Autowired
    private MovieService movieService;

    @PostMapping("/add")
    public ResponseEntity addMovie(@RequestBody MovieDto movieDto){
        movieService.addMovie(movieDto);
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/get/all")
    public ResponseEntity<List<Movie>> gelAllMovies() {
        return new ResponseEntity<>(movieService.getAllMovies(),HttpStatus.OK);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Movie> getMovieById(@PathVariable Long id) {
        return new ResponseEntity<>(movieService.getMovieById(id),HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity update(@RequestBody MovieDto moviedto) {
        movieService.update(moviedto);
        return new ResponseEntity(HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity delete(@PathVariable Long id) {
        movieService.delete(id);
        return new ResponseEntity(HttpStatus.OK);
    }
}
