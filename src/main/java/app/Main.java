package app;

import app.dto.MovieDto;
import app.services.MovieService;
import app.util.ApiReader;

public class Main {
    public static void main(String[] args) {

        MovieDto movieDto = MovieService.getMovieDto("tt0120685");
        System.out.println(movieDto);

    }
}