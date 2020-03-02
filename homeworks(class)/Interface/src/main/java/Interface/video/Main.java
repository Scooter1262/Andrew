package Interface.video;

public class Main implements Info {
    public  int Id;// дали айди животному

    public Main(int id) {
        this.Id = id;
    }

    public  void  Sleps(){
        System.out.println("Я сплю");
    }

    @Override
    public void ShowInfo() {
        System.out.println("Id " + this.Id );
    }
}
