package com.snail.capter04;

/**
 * 简单工厂
 */
public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        Pizza pizza;
        switch (type) {
            case "cheese":
                pizza = new CheesePizza();
                break;
            case "pepperoni":
                pizza = new PepperoniPizza();
                break;
            case "clam":
                pizza = new CheesePizza();
                break;
            case "veggie":
                pizza = new VeggiePizza();
                break;
            default:
                pizza = new CheesePizza();
        }
        return pizza;
    }
}
