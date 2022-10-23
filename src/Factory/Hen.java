package Factory;

public abstract class Hen {
   static public String description = "Я курица.";
    public static int allChicken;
    public static int allCountOfEggPerMonth;

    public Hen() {
        allChicken++;

        Hen.allCountOfEggPerMonth += getCountOfEggsPerMonth() * 12;
    }

    public abstract int getCountOfEggsPerMonth();

    public String getDescription() {
        System.out.println(description);
        return description;

    }
}
