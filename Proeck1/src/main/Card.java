package main;

public class Card {
     private static final double DEFAULT_BALANCE=0;
     private String name;
     private double balance;

     public Card(String name, double balance){
          this.name = name;
          this.balance = balance;
     }
     public Card(String name){
          this.name = name;
          this.balance = DEFAULT_BALANCE;
     }

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public double getBalance() {
          return balance;
     }

     public void setBalance(double balance) {
          this.balance = balance;
     }
     public void increaseBalance(double amount){
          if(amount<0){
               System.out.println("Сумма не может быть отрицательной");
          }else{
               this.balance += amount;
          }
     }
     public void decreaseBalance(double amount){
          this.balance -= amount;
     }

     @Override
     public String toString() {
          return "Name:" + name + ", balance: " + balance;
     }
}

