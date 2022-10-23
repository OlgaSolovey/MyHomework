package Factory;

public class RussianHen extends Hen {
    String country = "Russia. ";
    static int countOfEggsPerMonth = 30;

    public RussianHen() {

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
