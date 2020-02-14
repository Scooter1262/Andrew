package home2;

import java.util.Scanner;
public class hello2 {
    public  static  void  main(String[] args) {
         int num = enterNum();
         int res = findRes(num);
         print(res);
    }
    public static  int enterNum(){
        System.out.println("Введите четырехзначное число");
        int num;
        while (true) {// проверку спёр  в интернете
            @SuppressWarnings("resource")
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                num = scanner.nextInt();
                if ((num / 1000) >= 1 && (num / 1000) < 10)
                    break;
                else {
                    System.out.println("Число не входит в заданный диапозон!");
                }
            } else {
                System.out.println("Введено некорректное значение, повторите ввод!");
            }

        }
        return num;

    }
    public static int findRes(int num){
        int a1 = num %10;
        int a2 = num %100/10;
        int a3 = num %1000/100;
        int a4 = num/1000;
        return a1 * a2 * a3 * a4;

    }
    public  static void print(int res){
        System.out.println("Произведение :" + res);

    }
    }

