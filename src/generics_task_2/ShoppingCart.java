package generics_task_2;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart<T extends Clothing>{
private  final List<T> carts;
    public ShoppingCart() {
        this.carts = new ArrayList<>();
    }
    public void addItem(T item){
        carts.add(item);
    }
    public void removeItem(T item){
       carts.remove(item);
    }

    public double calculateTotal(){
        double sum = 0;
        for (T cart : carts) {
            sum += cart.price;
        }
        return sum;
    }

    public void printItems(){
        for (T cart : carts) {
            System.out.println(cart.name);
        }
    }
}
