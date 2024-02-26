package Yrok_2024_02_26;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws UserNotFoundException, AccessDeniedException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите логин");
        String login = scanner.nextLine();
        System.out.println("Введите пароль");
        String password = scanner.nextLine();

        //Проверить логин и пароль

        User user = getUserByLoginAndPassword(login, password);
        validateUser(user);
        //Вызвать методы валидации пользователя

        System.out.println("Доступ предоставлен");
    }
    public static User[] getUsers() {
        User user1 = new User("jhon", "pass", "jhon@gmail.com", 24);
        User user2 = new User("almat", "AlMat98", "almat_98@mail.ru", 27);
        User user3 = new User("myrat", "15154VJ", "MT@mail.ru", 5);

        return new User[]{user1, user2, user3};
    }


    public static User getUserByLoginAndPassword(String login, String password) throws UserNotFoundException {
        User[] users = getUsers();
        for (User user : users) {
            if (user.getLogin().equals(login) && user.getPasword().equals(password)) {
                return user;
            }
        }
        throw new UserNotFoundException("User not found");
    }

    public static void validateUser(User user) throws AccessDeniedException{
        if (user.getAge() <= 18) {
            throw new AccessDeniedException("Пользователю меньше 18 лет");
        }
        System.out.println("Пользователю больше 18 лет");
    }


}
