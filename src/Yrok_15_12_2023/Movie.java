package Yrok_15_12_2023;

public class Movie extends Media{
    int rating;
    int duration;

    public Movie(String title, int releaseYear, int rating, int duration) {
        super(title, releaseYear);
        this.rating = rating;
        this.duration = duration;
    }
}
