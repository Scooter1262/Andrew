package clas2;


import java.util.Scanner;

public class User {
    static int userGet() {
        Scanner scanner = new Scanner(System.in);
        try {
            return scanner.nextInt();

        } catch (Exception e) {
            System.out.println("Исключение");
            return 0;
        }


    }
}

