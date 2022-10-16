package Card;

public class CardTest {
    public static void main(String[] args) {
        CreditCard creditCard1 = new CreditCard("111", 15);
        CreditCard creditCard2 = new CreditCard("222", 20);
        CreditCard creditCard3 = new CreditCard("333", 30);
        creditCard1.creditingTheAmount(5);
        creditCard1.getInfo();
        creditCard2.creditingTheAmount(10);
        creditCard2.getInfo();
        creditCard3.writeOffs(5);
        creditCard3.getInfo();
    }
}
