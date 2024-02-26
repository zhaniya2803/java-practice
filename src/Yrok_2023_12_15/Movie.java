package Yrok_2023_12_15;

public class Movie extends Media{
    int rating;
    int duration;

    public Movie(String title, int releaseYear, int rating, int duration) {
        super(title, releaseYear);
        this.rating = rating;
        this.duration = duration;
    }
}
