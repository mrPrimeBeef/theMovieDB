package dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Moviedto {
    @JsonProperty("original_title")
    private String originalTitle;
    @JsonProperty("release_date")
    private int releaseYear;
    @JsonProperty("original_language")
    private String originalLanguage;

//    public Moviedto(String originalTitle, int releaseYear, String originalLanguage) {
//        this.originalTitle = originalTitle;
//        this.releaseYear = releaseYear;
//        this.originalLanguage = originalLanguage;
//    }
//
//    public String getOriginalTitle() {
//        return originalTitle;
//    }
//
//    public int getReleaseYear() {
//        return releaseYear;
//    }
//
//    public String getOriginalLanguage() {
//        return originalLanguage;
//    }
}