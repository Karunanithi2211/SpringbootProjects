package dev.nivak.movies;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
    @Autowired
    private MovieRepositroy movieRepositroy;
    public List<Movie> allMovies(){
        return movieRepositroy.findAll();
    }

    public Optional<Movie> singleMovie(String imdbId){
        return movieRepositroy.findMovieByImdbId(imdbId);
    }
}
