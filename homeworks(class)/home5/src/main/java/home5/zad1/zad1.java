package home5.zad1;

import java.util.Scanner;

public class zad1 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);//создали обьект( в нашем случае строку символов
        System.out.println("Введите строку");// вводим в консоль
        String Scanner = a.nextLine();
        String b = new StringBuilder(Scanner).reverse().toString();// метод разворота строки в новом обьекте
        System.out.printf(" " + b);// выводим в консоль
    }
}

