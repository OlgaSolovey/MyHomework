package HW10;

import java.util.Scanner;

public class MiddleString {
    /*3. Ввести 3 строки с консоли. Вывести на консоль те строки, длина которых меньше средней,
     а также их длину.
     */
    public void middleString() {
        String str1[] = new String[3];
        double middleLends = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Введи строку.");
            Scanner scanner = new Scanner(System.in);
            String firstString = scanner.nextLine();
            str1[i] = firstString.trim();
        }
        for (int i = 0; i < str1.length; i++) {
            middleLends += str1[i].length();
            middleLends /= str1.length;
            for (String a : str1) {
                if (a.length() < middleLends) {
                    System.out.println("Длина строки меньше средней: " + a + " Длина строки: " + a.length());
                }
            }
        }
    }
}
