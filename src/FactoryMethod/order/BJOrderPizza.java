package FactoryMethod.order;

import FactoryMethod.pizza.BJCheesePizza;
import FactoryMethod.pizza.BJPepperPizza;
import FactoryMethod.pizza.Pizza;

public class BJOrderPizza extends OrderPizza{
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
