package HW10;

import java.util.Scanner;

public class AscendingOrder {
        /* 2. Ввести 3 строки с консоли. Упорядочить и вывести строки в порядке возрастания значений их длины.*/

    public void ascendingOrder() {

        String str1[] = new String[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Введи строку.");
            Scanner scanner = new Scanner(System.in);
            String firstString = scanner.nextLine();
            str1[i] = firstString.trim();
        }
        for (int i = str1.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (str1[j].length() > str1[j + 1].length()) {
                    String order = str1[j];
                    str1[j] = str1[j + 1];
                    str1[j + 1] = order;
                }
            }
        }
        for (int i = 0; i < str1.length; i++) {
            System.out.println(str1[i]);
        }
    }
}

