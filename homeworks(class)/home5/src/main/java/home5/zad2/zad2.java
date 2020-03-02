package home5.zad2;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class zad2 {
    public static void main(String[] args) {
        System.out.println("Введите предложение:");
        Scanner a = new Scanner(System.in);
        String string = a.nextLine();
        System.out.println("Введите слово которое надо найти:");
        String say = a.nextLine();
        Pattern pattern = Pattern.compile(say);
        Matcher matcher = pattern.matcher(string);// классы патерн и матчер проверяют регулярные выражения
        int count = 0;
        while (matcher.find()){
            count++;
        }
            System.out.println(count);
        }
    }


// сделать через регулярку