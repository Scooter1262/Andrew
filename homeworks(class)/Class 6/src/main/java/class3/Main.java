package class3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите время относящееся от 0 до 24 : ");
        int hour = User.UserGet();
        hourNumber(hour);
    }

    public static void hourNumber(int hour) {

            if (hour >= 0 && hour < 6) {
                System.out.println("Good Night");
            }
            if (hour >= 6 && hour < 13) {
                System.out.println("Good Morning");
            }
            if (hour >= 13 && hour < 17) {
                System.out.println("Good Day");
            }
            if (hour >= 17 && hour < 24) {
                System.out.println("Good Evening");
            }
            if(hour>24){
                System.out.println("Error  ввод от 0 до 24 ");
            }
        /*while ((hour = scanner.nextInt()) > 24) {
            System.out.println("Error введите ещё раз:");

        }*/

        }
    }

