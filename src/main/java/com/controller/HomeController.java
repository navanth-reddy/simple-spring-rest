package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/movies")
public class HomeController {
	
	
	@GetMapping("/hello")
	public String greet() {
		return "Hello, Welcome";
	}
 
//	@Autowired
//    private MovieService movieService;
// 
//    // Get all movies
//    @GetMapping
//    public List<Movie> getAllMovies() {
//        return movieService.getAllMovies();
//    }
//    
//    // Get a single movie by ID
//    @GetMapping("/{id}")
//    public Movie getMovieById(@PathVariable String id) {
//        return movieService.getMovieById(id);
//    }

}
