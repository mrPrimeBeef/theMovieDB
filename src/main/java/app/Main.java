package app;

import app.dto.MovieDto;
import app.services.MovieService;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Get movie by id:");
        MovieDto movieDto = MovieService.getMovieDtoById("tt0120685");
        System.out.println(movieDto);

        System.out.println("\nGet movies by rating:");
        List<MovieDto> list = MovieService.getMoviesByRating(7.5, 8);
        list.forEach(System.out::println);

        System.out.println("\nGet movies by release year:");
        list = MovieService.getMoviesByReleaseYear(1984)
                .stream()
                .sorted(Comparator.comparingDouble(MovieDto::getVoteAverage))
                .toList();
        list.forEach(System.out::println);

    }
}