package app;

import util.ApiReader;

public class Main {
    public static void main(String[] args) {
        String key = System.getenv("api_key");

        String response = ApiReader.getDataFromURL("https://api.themoviedb.org/3/search/movie?query=godzilla&include_adult=false&language=en-US&api_key=" + key);

        System.out.println(response);
    }
}