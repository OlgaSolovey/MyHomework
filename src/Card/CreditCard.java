package Card;

public class CreditCard {
    String accountNumber;
    int currentBalance;

    public CreditCard(String accountNumber, int currentBalance) {
        this.accountNumber = accountNumber;
        this.currentBalance = currentBalance;
    }

    public int creditingTheAmount(int addMoney) {
        return currentBalance = currentBalance + addMoney;
    }

    public int writeOffs(int reduceMoney) {
        return currentBalance = currentBalance - reduceMoney;
    }

    public void getInfo() {
        System.out.println("account number:" + accountNumber + " " + "current balance:" + currentBalance);
    }
}
