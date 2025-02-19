package app.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import app.dto.MovieDto;
import app.util.ApiReader;

public class MovieService {

    public static MovieDto getMovieDto(String id) {

        String key = System.getenv("api_key");

        String url = "https://api.themoviedb.org/3/find/" + id + "?external_source=imdb_id" + "&api_key=" + key;

        String json = ApiReader.getDataFromUrl(url);

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        try {
            HelperDto helperDto = objectMapper.readValue(json, HelperDto.class);
            return helperDto.movie_results[0];
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return null;
    }


    private static class HelperDto {

        MovieDto[] movie_results;

        public MovieDto[] getMovie_results() {
            return movie_results;
        }

        public void setMovie_results(MovieDto[] movie_results) {
            this.movie_results = movie_results;
        }

    }


}
