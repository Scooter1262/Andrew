package home3;
import java.util.Scanner;
public class hello3 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Введите колличество метров");
        int a = k.nextInt();
        int cm = a *100;
        int dc = a /100;
        int mm = a *1000;
        double mil = a *0.000621371192;
        double morMil = a *0.000539956803;
        System.out.println("Перевели метры в сантиметры: " + cm);
        System.out.println("Перевели метры в дациметры: " + dc);
        System.out.println("Перевели метры в милиметры: " + mm);
        System.out.println("Перевели метры в мили: " + mil);
        System.out.println("Перевели метры в морские мили: " + morMil);//т.к не указаны какие мили добавил и морские

    }

}
