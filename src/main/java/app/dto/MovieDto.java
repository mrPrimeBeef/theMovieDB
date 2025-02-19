package app.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;

public class MovieDto {
    @JsonProperty("original_title")
    private String originalTitle;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate release_date;
    @JsonProperty("original_language")
    private String originalLanguage;

    @Override
    public String toString() {
        return "MovieDto{" +
                "originalTitle='" + originalTitle + '\'' +
                ", release_date=" + release_date +
                ", originalLanguage='" + originalLanguage + '\'' +
                '}';
    }

    public MovieDto() {
    }

    public MovieDto(String originalTitle, LocalDate release_date, String originalLanguage) {
        this.originalTitle = originalTitle;
        this.release_date = release_date;
        this.originalLanguage = originalLanguage;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public LocalDate getRelease_date() {
        return release_date;
    }

    public String getOriginalLanguage() {
        return originalLanguage;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    public void setRelease_date(LocalDate release_date) {
        this.release_date = release_date;
    }
    public void setOriginalLanguage(String originalLanguage) {
        this.originalLanguage = originalLanguage;
    }
}