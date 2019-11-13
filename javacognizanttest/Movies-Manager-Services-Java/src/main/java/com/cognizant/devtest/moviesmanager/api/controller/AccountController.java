package com.cognizant.devtest.moviesmanager.api.controller;

import com.cognizant.devtest.moviesmanager.domain.entity.Account;
import com.cognizant.devtest.moviesmanager.domain.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account")
@CrossOrigin(origins = "http://localhost:3000")
public class AccountController {

/*
    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Void> deleteMovieById() throws Exception {

        //movieRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
*/
@Autowired
private AccountRepository accountRepository;
	//curl -d '{"id":"1", "title":"title", "year":"1982", "rating":"rating", "review":"10", "genre":"genre","country":"country","copies":"1" }' -H "Content-Type: application/json" -X POST http://localhost:8888/movie
	//http://localhost:8888/account
    @RequestMapping(method = RequestMethod.POST, produces = "application/json")
    public Account addMovie(@RequestBody Account movie) throws Exception {
        Account newMovie = accountRepository.save(movie);
        return accountRepository.findById(newMovie.getId()).orElseThrow(() -> new Exception("movie not found"));
    }

	//http://localhost:8888/account    
    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public List<Account> getAllMovies() {
        return accountRepository.findAll();
    }
}
