package AbstractFactory.pizza;

public class BJCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("Beijing Cheese pizza");
        System.out.println(" Beijing Cheese pizza preparing");
    }
}
