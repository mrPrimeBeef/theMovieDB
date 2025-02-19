package app.services;

import app.dto.MovieDto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MovieServiceTest {

    @Test
    void getMovieDtoById() {
        MovieDto movieDto = MovieService.getMovieDtoById("tt0120685");
        MovieDto movieDto1 = MovieService.getMovieDtoById("dontExsists");

        assertNotNull(movieDto);
        assertNull(movieDto1);

        assertEquals("en" ,movieDto.getOriginalLanguage());
        assertEquals("Godzilla", movieDto.getOriginalTitle());
    }

    @Test
    void getMoviesByRating() {
    }

    @Test
    void getMoviesByReleaseYear() {
    }
}