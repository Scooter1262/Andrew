package Interface.video;

public class Test {
    public static void main(String[] args) {
        Main main = new Main(1);
        Person person = new Person("Bob");
        main.Sleps();
        person.SayHello();
        main.ShowInfo();
        person.ShowInfo();
        Info info1 = new Main(1);
        Info info2 = new Person("bob");
        info1.ShowInfo();
        info2.ShowInfo();
        outInfo(main);
        outInfo(person);
    }
    public  static  void  outInfo(Info info){
        info.ShowInfo();
    }
}
