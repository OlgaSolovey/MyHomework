package HW13;

import java.util.LinkedList;

public class HW13 {
    LinkedList<String> animals = new LinkedList<>();

    public void addAnimals(String addAnimal) {
        animals.addLast(addAnimal);
        System.out.println(animals);
    }

    public void deleteAnimals() {
        animals.removeFirst();
        System.out.println(animals);
    }
}