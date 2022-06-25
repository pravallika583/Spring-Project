package com.example.springbookmyshow.service;

import com.example.springbookmyshow.dto.MovieDto;
import com.example.springbookmyshow.model.Movie;
import com.example.springbookmyshow.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    private AuthService authService;

    @Autowired
    private MovieRepository movieRepository;


    public void addMovie(MovieDto movieDto) {
        Movie movie = new Movie();
        movie.setImg(movieDto.getImg());
        movie.setMoviename(movieDto.getMoviename());
        movie.setCategory(movieDto.getCategory());
        movie.setPrice(movieDto.getPrice());
        movieRepository.save(movie);
    }

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }
    public Movie getMovieById(Long id) {
        return movieRepository.findById(id).get();
    }
    //delete

    public void update(MovieDto movieDto) {
        Movie movie = new Movie();
        movie.setId(movieDto.getId());
        movie.setImg(movieDto.getImg());
        movie.setMoviename(movieDto.getMoviename());
        movie.setCategory(movieDto.getCategory());
        movieRepository.save(movie);

    }
    public void delete(Long id) {
        movieRepository.deleteById(id);
    }
}
