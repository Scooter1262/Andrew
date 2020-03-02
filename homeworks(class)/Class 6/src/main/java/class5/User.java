package class5;

import java.util.Scanner;

public class User {
    static int UserGet() {
        Scanner scanner = new Scanner(System.in);
        try {
            return scanner.nextInt();
        } catch (Exception a) {
            System.out.println("ERROR");
            return 0;
        }
    }
}
