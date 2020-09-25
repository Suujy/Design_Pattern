package Singleton;

enum Singleton{
    INSTANCE;
    public void ok(){
        System.out.println("ok");
    }
}

public class SingletonTest {
    public static void main(String[] args) {
        Singleton singleton = Singleton.INSTANCE;
        singleton.ok();
    }
}