package class2;

public class Main {
    public static void main(String[] args) {
        System.out.print("Введите 3 числа:");
        int num1 = User.userGet();
        int num2 = User.userGet();
        int num3 = User.userGet();
        System.out.println("Максимальное значение " + findMax(num1, num2, num3));
        System.out.println("Минимальное значение " + findMin(num1, num2, num3));
        System.out.println("Среднее значение " + findAvg(num1, num2, num3));

    }


    public static int findMax(int num1, int num2, int num3) {
        int[] array = {num1, num2, num3};
        int max = 0;
        for (int i = 0; i < 3; i++) {
            if (array[i] > max) max = array[i];
        }
        return max;
    }

    public static int findMin(int num1, int num2, int num3) {
        int[] array = {num1, num2, num3};
        int min = array[0];
        for (int i = 0; i < 3; i++) {
            if (array[i] < min) min = array[i];
        }
        return min;
    }

    public static int findAvg(int num1, int num2, int num3) {
        int avg;
        avg = (num1 + num2 + num3) / 3;
        return avg;
    }
}

