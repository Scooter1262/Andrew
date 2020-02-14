package home5;

import java.util.Scanner;

public class hello5 {
   public  static String reverse(String str){
       return str.isEmpty() ? "" : reverse(str.substring(1)) + str.charAt(0);// надо пояснения по этому коду(что он возвращает)
   }
    public  static void main(String[] args){
       try(Scanner scan = new Scanner(System.in)){
           System.out.print("Введите число:");
           System.out.println(" Число перевернуто: " + reverse(String.valueOf(scan.nextInt())));
       }
    }
}

