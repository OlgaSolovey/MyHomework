import java.util.Scanner;

public class MySecondhomework {
    public static void main(String[] args) {
         /* 1. Написать программу для вывода названия поры года по номеру
месяца. При решении используйте оператор switch-case.*/
        int numberOfMonth = 9;
        switch (numberOfMonth) {
            case (1):
                System.out.println("winter");
                break;
            case (2):
                System.out.println("winter");
                break;
            case (3):
                System.out.println("spring");
                break;
            case (4):
                System.out.println("spring");
                break;
            case (5):
                System.out.println("spring");
                break;
            case (6):
                System.out.println("summer");
                break;
            case (7):
                System.out.println("summer");
                break;
            case (8):
                System.out.println("summer");
                break;
            case (9):
                System.out.println("autumn");
                break;
            case (10):
                System.out.println("autumn");
                break;
            case (11):
                System.out.println("autumn");
                break;
            case (12):
                System.out.println("winter");
                break;
        }
         /* 2. Написать программу для вывода названия поры года по номеру
    месяца. При решении используйте оператор if-else-if.*/
        int numberOfMonth2 = 12;
        if (numberOfMonth2 >= 3 && numberOfMonth2 <= 5) {
            System.out.println("spring");
        } else if (numberOfMonth2 >= 6 && numberOfMonth2 <= 8) {
            System.out.println("summer");
        } else if (numberOfMonth2 >= 9 && numberOfMonth2 <= 11) {
            System.out.println("autumn");
        } else if (numberOfMonth2 >= 1 || numberOfMonth2 <= 2 || numberOfMonth2 == 12) {
            System.out.println("winter");
        }
          /*  3. Напишите программу, которая будет принимать на вход число и
          на выход будет выводить сообщение четное число или нет. Для определения
          четности числа используйте операцию получения остатка от деления (операция выглядит так: '% 2').
           */
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("четное");
        } else {
            System.out.println("нечетное");
        }
         /* 4. Для введенного числа t (температура на улице) вывести:
    Если t>–5, то вывести «Тепло». Если –5>= t > –20, то вывести «Нормально». Если –20>= t,
    то вывести «Холодно».
            */
        Scanner scannerT = new Scanner(System.in);
        int t = scannerT.nextInt();
        if (t > -5) {
            System.out.println("Тепло");
        } else if (-5 >= t && t > -20) {
            System.out.println("Нормально");
        } else if (-20 >= t) {
            System.out.println("Холодно");
        }
        /* 1. При помощи цикла for вывести на экран нечетные числа от 1 до 99.*/
        for (int i = 1; i <= 99; i++) {
            System.out.println(i);
        }
        /* 2. Необходимо вывести на экран числа от 5 до 1.*/
        for (int j = 5; j >=1; j--) {
            System.out.println(j);
        }

    }

}
