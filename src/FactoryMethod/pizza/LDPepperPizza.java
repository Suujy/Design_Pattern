package FactoryMethod.pizza;

public class LDPepperPizza extends Pizza{
    @Override
    public void prepare() {
        setName("London Pepper pizza");
        System.out.println(" London pepper pizza preparing");
    }
}
