package app.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MovieDto {
    @JsonProperty("original_title")
    private String originalTitle;
    @JsonProperty("release_date")
    private String releaseYear;
    @JsonProperty("original_language")
    private String originalLanguage;

    @Override
    public String toString() {
        return "MovieDto{" +
                "originalTitle='" + originalTitle + '\'' +
                ", releaseYear=" + releaseYear +
                ", originalLanguage='" + originalLanguage + '\'' +
                '}';
    }

    public MovieDto() {
    }

    public MovieDto(String originalTitle, String releaseYear, String originalLanguage) {
        this.originalTitle = originalTitle;
        this.releaseYear = releaseYear;
        this.originalLanguage = originalLanguage;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public String getReleaseYear() {
        return releaseYear;
    }

    public String getOriginalLanguage() {
        return originalLanguage;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    public void setReleaseYear(String releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setOriginalLanguage(String originalLanguage) {
        this.originalLanguage = originalLanguage;
    }
}