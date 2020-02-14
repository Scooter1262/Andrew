package main;

public class CreditCard extends Card {
    public CreditCard(String name, double balance) {
        super(name, balance);
    }

    @Override
    public String toString() {
        return "Credit Card - " +super.toString();
    }
}
