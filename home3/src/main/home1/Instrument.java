package main.home1;

public class Instrument {
    String name;
    String sound;
    String desc;
    String history;


    public static void main(String[] args) {
        Violin violin = new Violin();
        Trombone trombone = new Trombone();
        Ukulle ukulle = new Ukulle();
        Cello cello = new Cello();
        violin.sound();
        violin.name();
        violin.desc();
        violin.history();
        trombone.sound();
        trombone.name();
        trombone.desc();
        trombone.history();
        ukulle.sound();
        ukulle.name();
        ukulle.desc();
        ukulle.history();
        cello.sound();
        cello.name();
        cello.desc();
        cello.history();
        System.out.println("Инструмент : " + violin.name + " |издаёт звук:" + violin.sound + "| выглядит: " + violin.desc + "| Её история: " + violin.history);
        System.out.println("Инструмент : " + trombone.name + " |издаёт звук:" + trombone.sound + "| выглядит: " + trombone.desc + "| Её история: " + trombone.history);
        System.out.println("Инструмент : " + ukulle.name + " |издаёт звук:" + ukulle.sound + "| выглядит: " + ukulle.desc + "| Её история: " + ukulle.history);
        System.out.println("Инструмент : " + cello.name + " |издаёт звук:" + cello.sound + "| выглядит: " + cello.desc + "| Её история: " + cello.history);

    }

}
