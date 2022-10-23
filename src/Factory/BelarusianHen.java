package Factory;

public class BelarusianHen extends Hen {
    String country = "Belarus. ";
    static int countOfEggsPerMonth = 50;


    public BelarusianHen() {

    }

    @Override
    public int getCountOfEggsPerMonth() {
       // System.out.println("Я несу " + countOfEggsPerMonth + " яиц в месяц");
        return countOfEggsPerMonth;

    }

    @Override
    public String getDescription() {
        System.out.println("Моя страна " + country + "Я несу " + countOfEggsPerMonth + " яиц в месяц.");
        return super.getDescription();

    }

}
