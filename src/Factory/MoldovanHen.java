package Factory;

public class MoldovanHen extends Hen {

    String country = "Moldova. ";
    static int countOfEggsPerMonth = 20;


    public MoldovanHen() {

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
