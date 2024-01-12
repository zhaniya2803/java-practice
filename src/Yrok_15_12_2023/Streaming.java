package Yrok_15_12_2023;

import java.util.Scanner;

public class Streaming {

    Media [] media;
    private int seriesCount;
    private int moviesCount;

    public Streaming (int size){
        media = new Media[size];
    }
//    public Media[] getAmountOfSeries (){
//        return media;
//    }
//    public Media[] amountOfMovie(){
//        return media;
//    }

    void  add(Media media){
        if (media instanceof Series) {
            seriesCount++;
        } else if (media instanceof Movie) {
            moviesCount++;
        }
        for (int i = 0; i < this.media.length; i++) {
            if (this.media[i] == null){
                this.media[i] = media;
                return;
            }
        }
    }

    void play (Media media) {
        if (media instanceof Series) {
            System.out.println("");
//            System.out.println(" " + ((Series) media).ge);
        }
    }

    public void getPlay(Media media) {
        if (media instanceof Movie) {
            System.out.println("Проигрываем фильм с названием: " + media.title);
            System.out.println("Рейтинг: " + ((Movie) media).rating);
            System.out.println(" Год выпуска: " + media.releaseYear + " г.");
            System.out.println("Длительность " + ((Movie) media).duration + " минут");
        } else if (media instanceof Series) {
            System.out.println("Проигрываем сериал с названием: " + media.title);
            System.out.println("Рейтинг" + ((Series) media).rating);
            System.out.println(" Год выпуска:" + media.releaseYear);
            System.out.println("Количество серий: " + ((Series) media).seriesCount);
            System.out.println("Общая продолжительность  " + ((Series) media).duration + " минут");
        }
    }
}
