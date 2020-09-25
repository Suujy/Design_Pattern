package AbstractFactory.order;

import AbstractFactory.pizza.BJCheesePizza;
import AbstractFactory.pizza.BJPepperPizza;
import AbstractFactory.pizza.Pizza;

public class BJFactory implements AbsFactory{

    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
