package generics_task_2;

public class Main {
    public static void main(String[] args) {
        ShoppingCart<Clothing> cart = new ShoppingCart<>();

        cart.addItem(new Shirt("Белая рубашка", 29.99));
        cart.addItem(new Pants("Синие джинсы", 49.99));
        cart.addItem(new Jacket("Кожаная куртка", 199.99));

        cart.printItems();

        System.out.println("Общая стоимость: " + cart.calculateTotal());
    }
}
