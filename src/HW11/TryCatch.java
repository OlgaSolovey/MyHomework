package HW11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
    public void getNumber() {
        System.out.println("Введите число.");
        Scanner scanner = new Scanner(System.in);
        int arraySize = 0;
        try {
            arraySize = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.err.println("Введите число.");
        }
        int array1[] = new int[arraySize];
    }

    public void getArray() {
        try {
            int array1[] = {5, 4, 3, 2, 0};
            System.out.println(array1[5] / array1[6]);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка. ");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Индекс не существует.");
        }
    }

    public void getArrayMultyCatch() {
        try {
            int array1[] = {5, 4, 3, 2, 0};
            System.out.println(array1[5] / array1[6]);
        } catch (ArithmeticException | IndexOutOfBoundsException e) {
            System.out.println("Ошибка. ");
        }
    }

    public void tryCatchFinal() {
        System.out.println("Введите число.");
        Scanner scanner = new Scanner(System.in);
        int arraySize;
        try {
            arraySize = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.err.println("Введите число.");
        } finally {
            System.out.println("Закрытие try");
        }
    }
}