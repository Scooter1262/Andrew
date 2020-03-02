package home5.zad2;



import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) {
        System.out.println("Введите предложение:");
        Scanner a = new Scanner(System.in);
        String string = a.nextLine();
        System.out.println("Введите слово которое надо найти:");
        String say = a.nextLine();
       int indexJava = string.indexOf(say);
       if(indexJava == - 1) {
            System.out.println("Слово " + say +" не найдено.");
        } else {
               System.out.println("Слово " + say +" найдено в предложении:");
       }
       }
    }

