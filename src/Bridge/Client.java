package Bridge;

public class Client {

    public static void main(String[] args) {
        Phone p1 = new FoldedPhone(new Xiaomi());
        p1.open();
        p1.call();
        p1.close();

        Phone p2 = new FoldedPhone(new Vivo());
        p2.open();
        p2.call();
        p2.close();

        UprightPhone p3 = new UprightPhone(new Xiaomi());
        p3.open();
        p3.call();
        p3.close();
    }
}
