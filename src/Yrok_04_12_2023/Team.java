package Yrok_04_12_2023;

import java.util.Arrays;

public class Team {
    String name;
    Player[] players = new Player[11];

    public Team(String name) {
        this.name = name;
    }

    // TODO: реализовать метод для вывода всех игроков команды
    void printPlayers() {
        System.out.println("Игроки команы '" + name + "'");
        for (int i = 0; i < players.length; i++) {
            System.out.println(Arrays.toString(new String[]{" - " + players[i].name + " " + players[i].age + " " +players[i].nationality}));
        }
    }
}
