package main.home1;

public class Main {

    public static void main(String[] args) {
        Violin violin = new Violin();
        Trombone trombone = new Trombone();
        Cello cello = new Cello();
        Ukulle ukulle = new Ukulle();
        trombone.InstrumentInfo();
        ukulle.InstrumentInfo();
        violin.InstrumentInfo();
        cello.InstrumentInfo();
    }
}
