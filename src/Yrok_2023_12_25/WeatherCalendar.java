package Yrok_2023_12_25;

public class WeatherCalendar {
    String month;
    int numberOfDays;
    int rainyDays;
    int year;
    boolean isRainyMonth;

    // Увеличить переменную rainyDays на единицу
    public void addRainyDay() {
        rainyDays += 1;
    }

    public WeatherCalendar(String month, int numberOfDays) {
        this.month = month;
        this.numberOfDays = numberOfDays;
        this.year = 2022;
    }
}
