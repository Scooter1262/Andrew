package main;

public class main {
    public  static  void  main(String[] args){
        Card debitCard = new DebitCard("Debit", 100);
        Card creditCard = new CreditCard("Credit",  50);
        System.out.println(debitCard);
        System.out.println(creditCard);
        Atm atm = new Atm();
        atm.setCard(debitCard);
        atm.showBalance();
        atm.withdraw(70);
        atm.setCard(creditCard);
        atm.showBalance();
        atm.withdraw( 100);
    }




}
