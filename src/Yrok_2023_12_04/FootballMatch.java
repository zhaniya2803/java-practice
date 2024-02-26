package Yrok_2023_12_04;

public class FootballMatch extends SportEvent{
    Team team1;
    Team team2;
    int team1Goals;
    int team2Goals;


    // TODO: реализовать метод для определения победителя по голам (team1Goals, team2Goals)
    void defineWinner() {
        if (team1Goals >= 0 && team2Goals >= 0) {
            if (team1Goals > team2Goals) {
                System.out.println("Победила команда: " + team1.name + " со счетом " + team1Goals + " : " + team2Goals);
            } else if (team2Goals == team1Goals) {
                System.out.println("Ничья между командами: " + team2.name + " " + team1.name + " со счетом: " + team2Goals + " : " + team1Goals);
            }
            else {
                System.out.println("Победила команда: " + team1.name + " со счетом " + team1Goals + " : " + team2Goals);
            }
        }
    }


    // TODO: реализовать метод для вывода информаций о событий
    @Override
    void start() {
        super.start();
        System.out.println(team1.name + " VS " + team2.name);
    }
}
