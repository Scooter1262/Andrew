package home5.zad4;

import java.util.Scanner;

public class zad4 {
    public static void main(String[] args) {
        System.out.println("Введите строку для проверку на полиндром: ");
        Scanner a = new Scanner(System.in);
        String string = a.nextLine();
        StringBuilder b = new StringBuilder(string);
        String c = b.reverse().toString();
        string = string.replace(" ", "");
        c = c.replace(" ", "");
        if (string.equals(c)) {
            System.out.println("Полиндром");
        } else {
            System.out.println("Не полиндром");
        }
    }
}

