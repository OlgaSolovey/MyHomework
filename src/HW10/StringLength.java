package HW10;

import java.util.Scanner;

public class StringLength {
    /*Ввести 3 строки с консоли, найти самую короткую и самую длинную
    строки. Вывести найденные строки и их длину*/
    public void getStringLength() {

        String str[] = new String[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Введи строку.");
            Scanner scanner = new Scanner(System.in);
            String firstString = scanner.nextLine();
            str[i] = firstString.trim();
        }

        int max = str[0].length();
        for (int i = 0; i < str.length; i++) {
            if (str[i].length() > max) {
                max = str[i].length();
                System.out.println("Самая длинная строка:" + str[i] + " " + "Длина строки:" + max);
            }
        }

        int min = str[0].length();
        for (int j = 0; j < str.length; j++) {
            if (str[j].length() < min) {
                min = str[j].length();
                System.out.println("Самая короткая строка:" + str[j] + " " + "Длина строки:" + min);
            }
        }
    }
}











