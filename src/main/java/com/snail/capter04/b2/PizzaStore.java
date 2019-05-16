package com.snail.capter04.b2;

import com.snail.capter04.b1.Pizza;

public abstract class PizzaStore {

    public final Pizza orderPizza(String type){
        Pizza pizza = createPizza(type);
        pizza.bake();
        pizza.box();
        pizza.cut();
        return pizza;
    }

    abstract Pizza createPizza(String type);

}
