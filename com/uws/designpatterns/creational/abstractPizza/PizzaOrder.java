package com.uws.designpatterns.creational.abstractPizza;

public class PizzaOrder {
    public static Pizza orderPizza(String type) {
            Pizza newPizza = pizzaFactory(type);

            newPizza.prepare();
            newPizza.bake();
            newPizza.cut();
            newPizza.box();

            return newPizza;
        }

        private static Pizza pizzaFactory(String type) {
            Pizza pizza;
            if (type.equals("Margarita"))
            {
                pizza = new MargaritaPizza();
            }
            else if (type.equals("Hawaian"))
            {
                pizza = new HawaianPizza();
            }
            else if (type.equals("Pepperoni"))
            {
                pizza = new PepperoniPizza();
            }
            else {
                pizza = null;
            }
            return pizza;

        }
}
