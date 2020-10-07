package Facade;

public class Popcorn {

    private static Popcorn instance = new Popcorn();

    public static Popcorn getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("popcorn machine on");
    }

    public void off() {
        System.out.println("popcorn machine off");
    }

    public void pop() {
        System.out.println("popcorn is popping");
    }
}
