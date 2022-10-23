package Factory;

public class UkrainianHen extends Hen {
    String country = "Ukraine. ";
    static int countOfEggsPerMonth = 40;


    public UkrainianHen() {

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
