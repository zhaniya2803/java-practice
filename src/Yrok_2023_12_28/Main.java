package Yrok_2023_12_28;

import java.util.Scanner;

public class Main {
    static User[] users = {
            new User("John", "Doe"),
            new User("Will", "Smith"),
            new User("Dylan", "Johns"),
            new User("Matt", "Damon"),
    };

    static Product[] products = {
            new Product("Marshall IV Major", 179),
            new Product("Iphone XR", 269),
            new Product("MacBook Pro", 1219),
            new Product("Nike Air Mag", 199990),
    };
    static  Order[] orders = new Order[10];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("""
                    1. Совершить заказ
                    2. Просмотреть заказы
                    3. Изменить статус заказа
                    0. Завершить
                    """
            );
            int command1 = scanner.nextInt();
            if (command1 == 1) {
                showUser();
                System.out.println("Введите номер пользователя:");
                int userIndex = scanner.nextInt();
                User user = users[userIndex - 1];
                System.out.println();

                showProduct();
                System.out.println("Введите номер товара: ");
                int productIndex = scanner.nextInt();
                Product product = products[productIndex - 1];
                System.out.println();

                Order order = new Order(user, product);
                addOrder(order);
            } else if (command1 == 2) {
                for (Order order : orders) {
                    if (order != null) {
                        System.out.println("Имя пользователя: " + order.getUser().getName());
                        System.out.println("Название товара:" + order.getProduct().getName());
                        System.out.println("Статус заказа: " + order.getStatus());
                        System.out.println();
                    } else break;
                }
            } else if (command1 == 3) {
                for (int i = 0; i < orders.length; i++) {
                    if (orders[i] != null) {
                        System.out.println((i+1) + " " + orders[i].getUser().getName() + " " + orders[i].getProduct().getName() + " " + orders[i].getStatus());
                        System.out.println();
                    }
                }
                System.out.println("Введите номер заказа: ");
                int command3 = scanner.nextInt();


                System.out.println("""
                                1. NEW
                                2. IN_PROGRESS
                                3. DONE"""
                );
                System.out.println("Введите номер статуса: ");
                int numberstatus = scanner.nextInt();

                if (numberstatus == 2) {
                    orders[command3 - 1].setStatus(Status.IN_PROGRESS);
                } else if (numberstatus == 3) {
                    orders[command3 - 1].setStatus(Status.DONE);
                } else if (numberstatus == 1) {
                    orders[command3 - 1].setStatus(Status.NEW);
                } else {
                    System.out.println("Статус не найден");
                };

            } else if (command1 == 0){
                break;
            }

        }
    }

    static void showUser() {
        for (int i = 0; i < users.length; i++) {
            System.out.println(i + 1 +". " + users[i].getName() + " " + users[i].getLastname());
        }
    }

    static void showProduct() {
        for (int i = 0; i < products.length; i++) {
            System.out.println(i + 1 + ". " + products[i].getName() + " " + products[i].getPrice());
        }
    }

    static  void addOrder(Order order) {
        for (int i = 0; i < orders.length; i++) {
            if (orders[i] == null) {
                orders[i] = order;
                System.out.println("Заказ принят");
                return;
            }
        }
        System.out.println("Заказ не был совершен");
    }
}
