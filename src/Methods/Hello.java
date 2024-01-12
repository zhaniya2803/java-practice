package Methods;
public class Hello {
   public void greeting (int hours) {
        if (hours >= 4 && hours <= 10) {
            System.out.println("Доброе утро!");
        } else if (hours >= 11 && hours <= 17) {
            System.out.println("Доброй день!");
        }else if (hours >= 18 && hours <= 22) {
            System.out.println("Доброй вечер!");
        }else {
            System.out.println("Доброй ночи!");
        }
    }
}

