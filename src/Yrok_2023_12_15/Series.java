package Yrok_2023_12_15;

public class Series extends Movie{
    int seriesCount;

//    Streaming streaming = new Streaming();

    public Series(String title, int releaseYear, int rating, int duration, int seriesCount) {
        super(title, releaseYear, rating, duration);
        this.seriesCount = seriesCount;
    }
}
