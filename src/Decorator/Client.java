package Decorator;

public class Client {

    public static void main(String[] args) {
        Drink order = new LongBlack();
        System.out.println(order.getPrice());

        order = new Milk(order);
        System.out.println(order.cost());

        order = new Chocolate(order);
        System.out.println(order.cost());
    }
}
