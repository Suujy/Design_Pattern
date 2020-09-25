package SimpleFactory.pizza;

public class CheesePizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("prepare a CheesePizza");
    }
}
