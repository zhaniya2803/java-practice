package D_Z_exception;

public abstract class Event {
    String title;
    int releaseYear;
    int age;

    public Event(String title, int releaseYear, int age) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.age = age;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void getName(Event event) {
        System.out.println("Название: " + event.getTitle());
        System.out.println("Год выпуска: " + event.getReleaseYear());
        System.out.println("Возрастное ограничение" + event.getAge());
    }
}

