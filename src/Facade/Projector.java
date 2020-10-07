package Facade;

public class Projector {
    private static Projector instance = new Projector();

    public static Projector getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("Projector machine on");
    }

    public void off() {
        System.out.println("Projector machine off");
    }

    public void focus() {
        System.out.println("Projector is focusing");
    }
}
