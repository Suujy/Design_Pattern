package FactoryMethod.pizza;

public class BJPepperPizza extends Pizza{

    @Override
    public void prepare() {
        setName("Beijing Pepper pizza");
        System.out.println(" Beijing pepper pizza preparing");
    }
}
