package HW14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.LocalDate;

public class DateHW {
    /* 1. Написать программу для вывода на консоль названия дня недели по введенной дате.
       2. Написать программу для вывода на экран дату следующего вторника.*/
    public static void main(String[] args) throws ParseException {
        //1.
        System.out.println("Введите дату дд.мм.гггг:");
        Scanner scanner = new Scanner(System.in);
        String dayOfWeekString = scanner.nextLine();
        SimpleDateFormat format = new SimpleDateFormat("yyyy.MM.dd");
        Date dayOfWeek = format.parse(dayOfWeekString);
        String day = new SimpleDateFormat("EEEE").format(dayOfWeek);
        System.out.println(day);

        //2.
        LocalDate nextTuesday = LocalDate.parse(dayOfWeekString, DateTimeFormatter.ofPattern("yyyy.MM.dd"));
        System.out.println(nextTuesday.getDayOfWeek());// 2 вариант 1 задания
        switch (day) {
            case "понедельник":
                System.out.println("Следующий вторник:" + nextTuesday.plusDays(1));
                break;
            case "вторник":
                System.out.println("Следующий вторник:" + nextTuesday.plusDays(7));
                break;
            case "среда":
                System.out.println("Следующий вторник:" + nextTuesday.plusDays(6));
                break;
            case "четверг":
                System.out.println("Следующий вторник:" + nextTuesday.plusDays(5));
                break;
            case "пятница":
                System.out.println("Следующий вторник:" + nextTuesday.plusDays(4));
                break;
            case "суббота":
                System.out.println("Следующий вторник:" + nextTuesday.plusDays(3));
                break;
            case "воскресеьне":
                System.out.println("Следующий вторник:" + nextTuesday.plusDays(2));
                break;
        }
    }
}