package Yrok_2023_12_08;

public class Cat extends Animal{
    public Cat (String name) {
        super(name, "meo", 4);
    }

    public void metod () {
        System.out.println("Ловить мышей");
    }

    void display (){
        super.display();
        metod();
    }

}
