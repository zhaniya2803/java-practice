package Yrok_08_12_2023;

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
