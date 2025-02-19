package app;

import util.ApiReader;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {
    public static void main(String[] args) {
        String key = System.getenv("api_key");

        String response = ApiReader.getDataFromURL("https://api.themoviedb.org/3/find/tt0903747?external_source=imdb_id&api_key=" + key);

        System.out.println(response);
    }

}