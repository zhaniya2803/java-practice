package Yrok_2024_02_02;

public class Test {
    public static void main(String[] args) {
        // Задача № 1
//        String text = "application hello template";
//        String word = "hello";
//        if (text.contains(word)){
//            System.out.println("Cлово: " + word + " находиться в тексте: " + text);
//        } else {
//            System.out.println("Cлово: " + word + " не находиться в тексте: " + text);
//        }
//        System.out.println();
//
//         int result = text.indexOf(word);
//        if (result != -1) {
//            System.out.println("Cлово: " + word + " находиться в тексте: " + text);
//        } else {
//            System.out.println("Cлово: " + word + " не находиться в тексте: " + text);
//        }

        // Задача №2
//        String[] names = {"Alex", "Drake", "Anya", "Leon", "Adam"};
//        for (String name: names) {
//            if (name.contains("A")) {
//                System.out.println(name);
//            }
//        }
//        System.out.println();
//        for (String namee: names) {
//            if (namee.charAt(0) == 'A') {
//                System.out.println(namee);
//            }
//        }
//        System.out.println();
//        for (String name1: names) {
//            if (name1.startsWith("A")) {
//                System.out.println(name1);
//            }
//        }

        //Задача №3
//        String text = "application hello transaction template";
//        String one = "application";
////        String two = "template";
//////        int lastWord = two.length();
//////        System.out.println(text.substring(0,text.indexOf(" ") ) + " " +text.substring(text.lastIndexOf(" ")));
////
//////        2. Реализация через for и charAt (дополнительная)
//        int number1 = 0;
//        int number2 = 0;
//        for (int i = 0; i < text.length(); i++) {
//            if (text.charAt(i) == ' '){
//                number1 = i;
//                break;
//            }
//        }
//        for (int i = text.length() - 1; i >= 0; i--) {
//            if (text.charAt(i) == ' '){
//                number2 = i;
//                break;
//            }
//        }
//        System.out.println(text.substring(0,number1)  + text.substring(number2));

        // Задача 4
        String text = "application hello template hello ";
        String word = "hello";
        int index = text.indexOf(word);
        int number = 0;
        for (int i = 0; i < text.length(); i++) {
            if (index != -1){
                number ++;
                index = text.indexOf(word, index + 1);
            }
        }
        System.out.println(number);

//         Задача 5
//        Заменить буквы из переменной word в строке text на звёздочки (*)
//        String text = "application hello template hello translate";
//        String word = "hello";
//        System.out.println(text.replace(word, "*"));




    }
}
