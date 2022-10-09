import java.util.Arrays;
import java.util.Scanner;

public class FourthHMArrays {
    public static void main(String[] args) {


    /* Для всех задач исходные условия следующие: пользователь с клавиатуры вводит размер
массива (просто целое число). После того, как размер массива задан, заполнить его одним
 из двух способов: используя Math.random(), или каждый элемент массива вводится
 пользователем вручную. Попробовать оба варианта.
 После заполнения массива данными, решить для него следующие задачи:)*/
    /* 1. пройти по массиву, вывести все элементы в прямом и в обратном порядке.*/
    Scanner all_elements1 = new Scanner(System.in);
    int arraySize1 = all_elements1.nextInt();
    int array1[] = new int[arraySize1];
        System.out.println("Элементы массива в прямом порядке:");
        for (int i = 0; i < array1.length; i++) {
        array1[i] = (int) (Math.random() * 10);
        System.out.println(array1[i]);
    }
        System.out.println("Элементы массива в обратном порядке:");
        for (int i = array1.length - 1; i >= 0; i--) {

        System.out.println(array1[i]);
    }

    /*2. найти минимальный-максимальный элементы и вывести*/
        System.out.println();
    int max = array1[0];
        for (int i = 0; i < array1.length; i++) {
        if (array1[i] > max) {
            max = array1[i];
        }
    }
        System.out.println("Максимальный элемент (первый вариант):" + max);
        System.out.println("Максимальный элемент (второй вариант):" + Arrays.stream(array1).max());
    int min = array1[0];
        for (int i = 0; i < array1.length; i++) {
        if (array1[i] < min) {
            min = array1[i];
        }
    }
        System.out.println("Минимальный элемент (первый вариант):" + min);
        System.out.println("Минимальный элемент (второй вариант):" + Arrays.stream(array1).min());

    /*3. найти индекс минимального-максимального элементов и вывести*/
    int maxElement = array1[0];
    int maxIndex = 0;
    int minIndex = 0;
        for (int i = 0; i < array1.length; i++) {
        if (array1[i] > maxElement) {
            maxElement = array1[i];
            maxIndex = i;
        }
        if (array1[i] < maxElement) {
            maxElement = array1[i];
            minIndex = i;
        }
    }
        System.out.println("Индекс максимального элемента:" + maxIndex);
        System.out.println("Индекс минимального элемента:" + minIndex);

        /*4. найти и вывести количество нулевых элементов.
        Если нулевых элементов нет - вывести сообщение, что их нет*/
        System.out.println("Введи колличество яцеек массива:");
    Scanner all_elements2 = new Scanner(System.in);
    int arraySize2 = all_elements2.nextInt();
    int array2[] = new int[arraySize2];
    int zeroElement = 0;
        for (int i = array2[0]; i < array2.length; i++) {

        System.out.println("Введи число");
        Scanner elements = new Scanner(System.in);
        int elementsNumber = elements.nextInt();
        array2[i] = elementsNumber;

    }
        for (int j = 0; j < array2.length; j++) {
        if (array2[j] == 0) {
            zeroElement = zeroElement + 1;
            System.out.println("количество нулей:" + zeroElement);
        } else {
            System.out.println("нулей нет"); // дублирует строку после каждого прохода цикла (НАЙТИ ВАРИАНТ ВЫВОДА ОДИН РАЗ)
        }
    }
    /*5. пройти по массиву и поменять местами первый и последний, второй и предпоследний и т.д.*/
        System.out.println();
    Scanner all_elements3 = new Scanner(System.in);
    int arraySize3 = all_elements3.nextInt();
    int array3[] = new int[arraySize3];
        for (int i = 0; i < array3.length; i++) {
        array3[i] = (int) (Math.random() * 10);
        System.out.print(array3[i]);
    }
        System.out.println();
    int s;
        for (int j = 0; j < array3.length / 2; j++) {
        s = array3[j];
        array3[j] = array3[array3.length - j - 1];
        array3[array3.length - j - 1] = s;
        System.out.print(array3[j]);
    }
    /*6. проверить, является ли массив возрастающей последовательностью (каждое следующее число больше предыдущего)*/
    Scanner all_elements4 = new Scanner(System.in);
    int arraySize4 = all_elements4.nextInt();
    int array4[] = new int[arraySize4];
        for (int i = 0; i < array4.length; i++) {
        array4[i] = (int) (Math.random() * 10);
        System.out.print(array4[i]);
    }
    boolean bolshe = true;
        for (int i = 1; i < array4.length; i++) {
        if(array4[i]<=array4[i-1]){
            bolshe = false;
        }
    }
        if(bolshe){
        System.out.println("Массив возрастающий");
    } else {
        System.out.println("Массив не возрастающий");
    }
    /*Основное:

    Создать двумерный массив, заполнить его числами. Добавить к каждому значению число, которое
    пользователь будет вводить с консоли. Найти сумму всех получившихся элементов.*/
    int[][] mass = {{7, 3, 2}, {6, 3,9}};

    Scanner numbers = new Scanner(System.in);
    int num = numbers.nextInt();
    int summ = 0;
        for(int i=0; i<mass.length; i++ ){
        for (int j = 0; j < mass[i].length; j++){
            mass[i][j] = mass[i][j] + num;
            System.out.print (mass[i][j]+ " ");

            summ = summ + mass[i][j];
        }
        System.out.println("summ" + summ );
    }
    /*Дополнительно:
    Шахматная доска
    Создать программу для раскраски шахматной доски с помощью цикла. Создать двумерный массив
     String'ов 8х8. С помощью циклов задать элементам циклам значения B(Black) или W(White).
     Результат работы программы:
     0 1 2 3 4 5 6 7
    0W B W B W B W B
    1B W B W B W B W
    2W B W B W B W B
    3B W B W B W B W
    4W B W B W B W B
    5B W B W B W B W
    6W B W B W B W B
    7B W B W B W B W
    */
    String[][] chess = new String[8][8];

        for (int i = 0; i < chess.length; i++) {
        for (int j = 0; j < chess[0].length; j++) {

            if ((i + j) % 2 == 0) {
                chess[i][j] = "W";
            } else {
                chess[i][j] = "B";
            }
            System.out.print(chess[i][j] + "\t");
        }
        System.out.println();


    }
}
}
