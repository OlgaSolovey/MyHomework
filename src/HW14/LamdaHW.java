package HW14;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class LamdaHW {
    public static void main(String[] args) {

        /* 1. Написать программу, которая проверяет, что строка начинается буквой “J”или “N” и заканчивается “A”.*/
        Predicate<String> word1 = w -> w.startsWith("J");
        Predicate<String> word2 = w -> w.startsWith("N");
        Predicate<String> word3 = w -> w.endsWith("A");
        Predicate<String> predicate = word1.or(word2).and(word3);
        System.out.println(predicate.test("Nara"));
        System.out.println(predicate.test("NarA"));
        System.out.println(predicate.test("KarA"));
         /* 2. Написать лямбда выражение, которое принимает на вход объект типа Box и выводит на консоль сообщение
         “Отгрузили ящик с весом n” где n – поле в классе которое содержит вес ящика.*/
        Consumer<Box> consumer = box -> System.out.println("Отгрузили ящик с весом:" + box);
        consumer.accept(new Box(9));

    /* 3. Написать лямбда выражение, которое принимает на вход число и возвращает значение “Положительное число”,
     “Отрицательное число” или  “Ноль”.*/
        Function<Integer, String> number = i -> {
            String value = null;
            if (i > 0) {
                value = "Положительное число";
            } else if (i < 0) {
                value = "Отрицательное число";
            } else if (i == 0) {
                value = "Ноль";
            }
            return value;
        };
        System.out.println(number.apply(0));
        System.out.println(number.apply(10));
        System.out.println(number.apply(-3));

        /*4. Написать лямбда выражение, которое возвращает случайное число от 0 до 10.*/
        Supplier<Integer> randomNumber = () -> (int) (Math.random() * 10);
        System.out.println("4 задание:" + randomNumber.get());
    }
}