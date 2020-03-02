package itclass.homework2;

import java.util.Scanner;

public class MyClas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        try{
            Integer.valueOf(str);
        }catch (Exception ex){
            System.out.println("Поймал");
        }
    }

}
