package com.example.basic.controller;

import org.springframework.web.bind.annotation.RestController;
import com.example.basic.service.MovieService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.CrossOrigin;
import java.util.List;
import com.example.basic.model.Movie;

@RestController
@CrossOrigin(origins = "*")
public class MovieController {
    @Autowired
    private MovieService service;

    @GetMapping("/movies")
    public List<Movie> getMovies(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size) {
        return service.getMovies(page, size);
    }
}

