package AbstractFactory.order;

import AbstractFactory.pizza.Pizza;

public interface AbsFactory {

    public Pizza createPizza(String orderType);
}
