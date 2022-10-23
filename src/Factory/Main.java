package Factory;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            BelarusianHen belarusianHen = new BelarusianHen();
            belarusianHen.getDescription();
            RussianHen russianHen = new RussianHen();
            russianHen.getDescription();
            UkrainianHen ukrainianHen = new UkrainianHen();
            ukrainianHen.getDescription();
            MoldovanHen moldovanHen = new MoldovanHen();
            moldovanHen.getDescription();

        }
        // BelarusianHen [] belarusianHens = new BelarusianHen[5];

        //BelarusianHen belarusianHen = new BelarusianHen();
        // belarusianHen.getDescription();
        // BelarusianHen belarusianHen1 = new BelarusianHen();
        // belarusianHen1.getDescription();
        System.out.println("Всего яиц за год " + Hen.allCountOfEggPerMonth);
    }
}
