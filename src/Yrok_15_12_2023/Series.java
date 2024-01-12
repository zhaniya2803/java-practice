package Yrok_15_12_2023;

public class Series extends Movie{
    int seriesCount;

//    Streaming streaming = new Streaming();

    public Series(String title, int releaseYear, int rating, int duration, int seriesCount) {
        super(title, releaseYear, rating, duration);
        this.seriesCount = seriesCount;
    }
}
