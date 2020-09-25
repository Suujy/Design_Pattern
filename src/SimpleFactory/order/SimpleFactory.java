package SimpleFactory.order;

import SimpleFactory.pizza.CheesePizza;
import SimpleFactory.pizza.GreekPizza;
import SimpleFactory.pizza.Pizza;

public class SimpleFactory {

    public Pizza createPizza(String orderType) {
        Pizza pizza = null;

        System.out.println("using simple factory method");
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName("greek pizza");
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName("cheese pizza");
        }
        return pizza;
    }
}
