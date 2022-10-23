package Animals;

public class Tiger extends Animal implements AnimalDo {
    @Override
    public void eat() {
        System.out.println("Eat cow");
    }
}
