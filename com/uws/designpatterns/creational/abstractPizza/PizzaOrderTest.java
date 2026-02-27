package com.uws.designpatterns.creational.abstractPizza;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.lang.reflect.Method;

class PizzaOrderTest {

    

    @Test
    void testPizzaFactoryReturnsMargaritaPizza() throws Exception {
        Pizza pizza = PizzaOrder.orderPizza("Margarita");
        assertNotNull(pizza);
        assertEquals(MargaritaPizza.class, pizza.getClass());
    }

    @Test
    void testPizzaFactoryReturnsHawaianPizza() throws Exception {
        Pizza pizza = PizzaOrder.orderPizza("Hawaian");
        assertNotNull(pizza);
        assertEquals(HawaianPizza.class, pizza.getClass());
    }

    @Test
    void testPizzaFactoryReturnsPepperoniPizza() throws Exception {
        Pizza pizza = PizzaOrder.orderPizza("Pepperoni");
        assertNotNull(pizza);
        assertEquals(PepperoniPizza.class, pizza.getClass());
    }

    @Test
    void testPizzaFactoryReturnsNullForUnknownType() throws Exception {
        Pizza pizza = PizzaOrder.orderPizza("Unknown");
        assertNull(pizza);
    }

    
}