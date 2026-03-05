package com.uws.designpatterns.creational.abstractPizza;


/*
 * Dependency Inversion Principle (DIP)
 *
 * The high-level module in this design is PizzaOrder, which defines the
 * process for ordering a pizza (prepare → bake → cut → box). Rather than
 * working with specific pizza classes directly, it works with the base
 * type 'Pizza'. This allows different pizza types (MargaritaPizza,
 * HawaianPizza, PepperoniPizza) to be used interchangeably through
 * polymorphism.
 *
 * However, the factory method in this class still creates concrete pizza
 * objects using 'new MargaritaPizza()', 'new HawaianPizza()', etc. This
 * means PizzaOrder still depends on low-level implementations. A stronger
 * application of the Dependency Inversion Principle would move this
 * creation logic behind an abstraction such as a PizzaFactory interface,
 * allowing PizzaOrder to depend only on abstractions rather than concrete
 * classes.
 */



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
