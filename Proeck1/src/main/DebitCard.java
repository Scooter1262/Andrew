package main;

public class DebitCard extends Card {
    public DebitCard(String name, double balance) {
        super(name, balance);
    }

    @Override
    public void decreaseBalance(double amount) {
        if(getBalance() >= amount) {
            super.decreaseBalance(amount);
        }else{
            System.out.println("Нема денег");
        }

    }
    @Override
    public String toString() {
        return "Debit Card  -" + super.toString();
    }
}

