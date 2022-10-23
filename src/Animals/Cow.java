package Animals;

public class Cow extends Animal implements AnimalDo {
    @Override
    public void eat() {
        System.out.println("Eat flowers");
    }
}
