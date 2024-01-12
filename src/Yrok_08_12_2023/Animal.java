package Yrok_08_12_2023;

public class Animal {
    String name;
    String voice;
    int pawsCount;

    public Animal(String name, String voice, int pawsCount) {
        this.name = name;
        this.voice = voice;
        this.pawsCount = pawsCount;

    }

    public void getSound(){
        System.out.println("Звук: " + voice);
    }

    void display () {
        System.out.println("Name " + name);
        System.out.println("Song " + voice);
        System.out.println("Paws count " + pawsCount);
    }
}
