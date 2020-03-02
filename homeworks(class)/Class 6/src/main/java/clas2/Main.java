package clas2;


public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        int num = User.userGet();
        isEvenNumber(num);//вызываем метод
    }

    public static void isEvenNumber(int num) {
        if (isEven(num)) {
            System.out.println("Число чётное");
        } else {
            System.out.println("Не чётное");
        }
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}