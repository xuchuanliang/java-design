package com.snail.capter04.b2;

import com.snail.capter04.b1.Pizza;

public class NYPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        return new NYPizza();
    }
}
