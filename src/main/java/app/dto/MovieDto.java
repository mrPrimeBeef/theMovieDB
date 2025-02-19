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
    @JsonProperty("vote_average")
    private Double voteAverage;
    @JsonProperty("adult")
    boolean adultStatus;

    @Override
    public String toString() {
        return "MovieDto{" +
                "originalTitle='" + originalTitle + '\'' +
                ", release_date=" + release_date +
                ", originalLanguage='" + originalLanguage + '\'' +
                ", voteAverage=" + voteAverage +
                ", adultStatus=" + adultStatus +
                '}';
    }

    public MovieDto() {
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

    public Double getVoteAverage() {
        return voteAverage;
    }

    public boolean getAdultStatus() {
        return adultStatus;
    }

}