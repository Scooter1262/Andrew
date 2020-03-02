package main;

public class Atm  {
    private Card card;
  public  void setCard(Card card){
      this.card = card;
  }
   public  void  withdraw(double amount){
       card.decreaseBalance(amount);
   }
   public  void showBalance(){
       System.out.println("Текущий баланс" + card.getBalance());
   }
}
