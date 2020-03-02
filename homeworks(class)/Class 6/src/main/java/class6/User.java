package class6;

import java.util.Scanner;

public class User {
    static int UserGet(){
        Scanner scanner = new Scanner(System.in);
        try {
            return scanner.nextInt();
        } catch (Exception a) {
            System.out.println("ERROR");
            return 0;
        }
    }
    static String UserSimbol(){
        Scanner scanner = new Scanner(System.in);
        try {
            return scanner.nextLine();
        } catch (Exception 1) {
            System.out.println("ERROR");
            return 0;
        }
    }
    /*static int UserDirection(x,y){
        Scanner scanner = new Scanner(System.in);
        try {
            return scanner.nextLine();
        } catch (Exception a) {
            System.out.println("ERROR");
            return 0;
        }
    }*/

    }

