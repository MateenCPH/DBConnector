package org.example;

public class Movie {
    private int movieID;
    private String name;
    private String genre;
    private int year;
    private double rating;

    public Movie(int movieID, String name, String genre, int year, double rating) {
        this.movieID = movieID;
        this.name = name;
        this.genre = genre;
        this.year = year;
        this.rating = rating;
    }

    public int getMovieID() {
        return movieID;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public int getYear() {
        return year;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "movieID=" + movieID + ", name='" + name + '\'' + ", genre='" + genre + '\'' + ", year=" + year + ", rating=" + rating + '}';
    }
}
