import java.util.Scanner;
public class hello {
    public  static  void  main(String[] args){
        Scanner k = new Scanner(System.in);
        System.out.println("Введите 3 числа: ");
        String a = k.nextLine();
        String b = k.nextLine();
        String c = k.nextLine();
        System.out.println(a + "" + b +"" + c);
    }
}
