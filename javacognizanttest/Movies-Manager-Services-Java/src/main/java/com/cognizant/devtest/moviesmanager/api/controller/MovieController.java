package com.cognizant.devtest.moviesmanager.api.controller;
//import com.cognizant.devtest.moviesmanager.domain.entity.Movie;
//import com.cognizant.devtest.moviesmanager.domain.repository.MovieRepository;
import com.cognizant.devtest.moviesmanager.domain.entity.Movie;
import com.cognizant.devtest.moviesmanager.domain.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/movie")
@CrossOrigin(origins = "http://localhost:3000")
public class MovieController {
/*
    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Void> deleteMovieById() throws Exception {
        //movieRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
*/
@Autowired
private MovieRepository movieRepository;
	//curl -d '{"id":"1", "title":"title", "year":"1982", "rating":"rating", "review":"10", "genre":"genre","country":"country","copies":"1" }' -H "Content-Type: application/json" -X POST http://localhost:8888/movie
	//http://localhost:8888/movie
    @RequestMapping(method = RequestMethod.POST, produces = "application/json")
    public Movie addMovie(@RequestBody Movie movie) throws Exception {
        Movie newMovie = movieRepository.save(movie);
        return movieRepository.findById(newMovie.getId()).orElseThrow(() -> new Exception("movie not found"));
    }
	//http://localhost:8888/movie    
    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }
}
