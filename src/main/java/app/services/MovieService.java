package app.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import app.dto.MovieDto;
import app.util.ApiReader;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.util.List;

public class MovieService {

    public static MovieDto getMovieDtoById(String id) {

        String key = System.getenv("api_key");

        String url = "https://api.themoviedb.org/3/find/" + id + "?external_source=imdb_id" + "&api_key=" + key;

        String json = ApiReader.getDataFromUrl(url);

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.registerModule(new JavaTimeModule());

        try {
            HelperDto helperDto = objectMapper.readValue(json, HelperDto.class);
            return helperDto.movie_results.get(0);

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static List<MovieDto> getMoviesByRating(double lowerRating, double upperRating) {
        String key = System.getenv("api_key");
        String url = "https://api.themoviedb.org/3/discover/movie?include_adult=false&include_video=false&language=en-US&page=1&sort_by=popularity.desc&vote_average.gte=" + lowerRating + "&vote_average.lte=" + upperRating + "&api_key=" + key;

        String json = ApiReader.getDataFromUrl(url);

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.registerModule(new JavaTimeModule());

        try {
            HelperDto helperDto = objectMapper.readValue(json, HelperDto.class);

            return helperDto.results;

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static List<MovieDto> getMoviesByReleaseYear(int year) {

        String key = System.getenv("api_key");
        String url = "https://api.themoviedb.org/3/discover/movie?include_adult=true&include_video=false&language=en-US&page=1&primary_release_year=" + year + "&sort_by=popularity.desc&api_key=" + key;

        String json = ApiReader.getDataFromUrl(url);

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.registerModule(new JavaTimeModule());

        try {
            HelperDto helperDto = objectMapper.readValue(json, HelperDto.class);

            return helperDto.results;

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static List<MovieDto> getAdultMoviesByReleaseYear(int year) {

        String key = System.getenv("api_key");
        String url = "https://api.themoviedb.org/3/discover/movie?include_adult=true&include_video=false&language=en-US&page=1&primary_release_year=" + year + "&sort_by=popularity.desc&api_key=" + key;

        String json = ApiReader.getDataFromUrl(url);

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.registerModule(new JavaTimeModule());

        try {
            HelperDto helperDto = objectMapper.readValue(json, HelperDto.class);

            return helperDto.results;

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return null;
    }


    private static class HelperDto {

        List<MovieDto> movie_results;
        List<MovieDto> results;

        public List<MovieDto> getMovie_results() {
            return movie_results;
        }

        public List<MovieDto> getResults() {
            return results;
        }

        public void setMovie_results(List<MovieDto> movie_results) {
            this.movie_results = movie_results;
        }

        public void setResults(List<MovieDto> results) {
            this.results = results;
        }

    }

}
