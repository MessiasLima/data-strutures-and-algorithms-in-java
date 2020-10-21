package examples.chapter1.exercises.reinforcement;

/**
 * Modify the CreditCard class from Code Fragment 1.5 to include a method that
 * updates the credit limit
 */
public class Eleven {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard("Messias Junior", "Citibank", "Checking", 10, 1000);
        creditCard.setLimit(1);
        CreditCard.printSummary(creditCard);
    }
}
