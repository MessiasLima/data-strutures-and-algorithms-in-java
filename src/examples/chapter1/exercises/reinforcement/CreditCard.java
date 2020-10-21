package examples.chapter1.exercises.reinforcement;

public class CreditCard {

    private final String customer;
    private final String bank;
    private final String account;
    private int limit;
    protected double balance;

    public CreditCard(String cust, String bk, String acnt, int lim, double initialBal) {
        customer = cust;
        bank = bk;
        account = acnt;
        limit = lim;
        balance = initialBal;
    }

    public CreditCard(String cust, String bk, String acnt, int lim) {
        this(cust, bk, acnt, lim, 0.0);
    }

    public String getCustomer() {
        return customer;
    }

    public String getBank() {
        return bank;
    }

    public String getAccount() {
        return account;
    }

    public int getLimit() {
        return limit;
    }

    public double getBalance() {
        return balance;
    }


    public boolean charge(double price) {
        if (price + balance > limit){
            return false;
        }
        balance += price;
        return true;
    }

    /**
     * Modify the CreditCard class from Code Fragment 1.5 so that it ignores any re-
     * quest to process a negative payment amount.
     */
    public void makePayment(double amount) {
        if (amount > 0) {
            balance -= amount;
        }
    }

    public static void printSummary(CreditCard card) {
        System.out.println(card);
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
            "customer='" + customer + '\'' +
            ", bank='" + bank + '\'' +
            ", account='" + account + '\'' +
            ", limit=" + limit +
            ", balance=" + balance +
            '}';
    }
}