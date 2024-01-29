import java.util.Arrays;

public class New_Test {
    public static void main(String[] args) {
//        String months = "ЯНВАРЬ-ФЕВРАЛЬ-МАРТ-АПРЕЛЬ-МАЙ-ИЮНЬ-ИЮЛЬ-АВГУСТ-СЕНТЯБРЬ-ОКТЯБРЬ-НОЯБРЬ-ДЕКАБРЬ";
//        String [] months_list = months.split("-");
//        System.out.println(Arrays.toString(months_list));
//        int counter = 1;
//        for (String s: months_list) {
//            System.out.println(counter + ". "+capitalize(s));
//            counter++;
//        }

        String text = "Hello word";
        System.out.println(countVowels(text));

    }

    static  int countVowels(String text) {
        char[] letters = {'a', 'e', 'i', 'o', 'u'};
        int counter = 0;
        for (int i = 0; i < text.length(); i++) {
            if (isPresent(text.charAt(i))) {
                counter++;
            }
        }
        return counter;
    }

    static boolean isPresent(char currentChar){
        char[] letters = {'a', 'e', 'i', 'o', 'u'};
        for (char letter : letters){
            if (letter == currentChar) {
                return  true;
            }
        }
        return  false;
    }

    static String capitalize(String word) {
        return word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
    }
}
