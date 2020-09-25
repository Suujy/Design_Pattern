package AbstractFactory.pizza;

public class LDCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("London Cheese pizza");
        System.out.println(" London Cheese pizza preparing");
    }
}
