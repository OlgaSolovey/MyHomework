package HW14;

public class Box {
    private double weight;

    public Box(double w) {
        weight = w;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Box{" +
                "weight=" + weight +
                '}';
    }
}