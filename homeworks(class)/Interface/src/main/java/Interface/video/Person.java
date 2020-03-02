package Interface.video;

public class Person implements Info {
    public String Name;

    public Person(String name) {
       this.Name = name;
    }


    public void SayHello() {
        System.out.println("Hello");
    }

    @Override
    public void ShowInfo() {
        System.out.println("name is "+ this.Name);
    }
}
