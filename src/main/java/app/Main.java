package app;

import app.dto.MovieDto;
import app.services.MovieService;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        MovieDto movieDto = MovieService.getMovieDtoById("tt0120685");
//        System.out.println(movieDto);

        MovieDto[] list = MovieService.getMoviesByRating(7.5,8);

        Arrays.stream(list).forEach(System.out::println);

    }
}