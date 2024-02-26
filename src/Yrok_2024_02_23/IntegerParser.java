package Yrok_2024_02_23;

import java.math.BigInteger;

public class IntegerParser {

    public static int parseInt(String inputValue) {
        checkIsEmpty(inputValue);
        checkIsInteger(inputValue);
        checkIsTooBigNumber(inputValue);
        checkIsTooSmallNumber(inputValue);
        return Integer.parseInt(inputValue);
    }

    private static void checkIsEmpty(String inputValue) {
        if (inputValue.isBlank()) {
            throw new StringEmptyException("Строка пустая");
        }
    }

    private static void checkIsInteger(String inputValue) {
        char[] symbols = inputValue.toCharArray();
//        for (char symbol : symbols) {
//            if (symbol == '.') {
//                throw new StringNotNumberException("Вы ввели не цолое число");
//            }
//        }
        for (int i = 0; i < symbols.length; i++) {
            if (i == 0 && symbols[i] == '-') {
                continue;
            }
            if (!Character.isDigit(symbols[i])) {
                throw new StringNotNumberException("Вы ввели не цолое число");
            }
        }
    }

    private static void checkIsTooBigNumber(String inputValue) {
        BigInteger integer = new BigInteger(inputValue);
        BigInteger bigNumer = new BigInteger(String.valueOf(Integer.MAX_VALUE));
        if (integer.compareTo(bigNumer) == 1) {
            throw new StringIsTooBigNumberException("Введенное число больше " + Integer.MAX_VALUE);
        }
    }

    private static void checkIsTooSmallNumber(String inputValue) {
        BigInteger integer = new BigInteger(inputValue);
        BigInteger smallNumber = new BigInteger(String.valueOf(Integer.MIN_VALUE));
        if (integer.compareTo(smallNumber) == - 1) {
            throw new StringIsTooSmallNumberException("Введенное чилсо меньше " + Integer.MIN_VALUE);
        }
    }
}
