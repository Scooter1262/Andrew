package class5;

public class Main {
    public static void main(String[] args) {
        System.out.print("Введите 2 числа: ");
        int num1 = User.UserGet();
        int num2 = User.UserGet();
        enterNumber(num1, num2);

    }

    public static void enterNumber(int num1, int num2) {
        int[] array = new int[]{num1, num2};
        for (int i = num1; i < num2 + 1; i++) {
            if (isEven(i)) {
                System.out.println("Чётные числа: " + i);
            }
        }
    }

    public static boolean isEven(int i) {
        return i % 2 == 0;
    }
}