import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HW15 {
    public static void main(String[] args) {
        HashMap<Integer, String> person = new HashMap<>();
        person.put(1, "Olga");
        person.put(2, "Katya");
        person.put(3, "Sergey");
        person.put(4, "Tanya");
        person.put(5, "Igor");
        person.put(6, "Sasha");
        person.put(7, "Victor");
        person.put(8, "Evgeniya");
        person.put(9, "Sofiya");
        person.put(10, "Roma");
        person.put(11, "Nikita");
        person.put(12, "Stepan");
        person.put(13, "Alexander");
        person.put(14, "Henna");
        person.put(15, "Victoria");

        person.entrySet().stream().filter(entry -> entry.getKey() == 1 || entry.getKey() == 2 || entry.getKey() == 5 || entry.getKey() == 8 || entry.getKey() == 9 || entry.getKey() == 13).
                filter(entry -> entry.getValue().length() % 2 != 0).collect(Collectors.toList())
                /*forEach(System.out::println)*/;
    }
}