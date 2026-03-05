# Abstract Factory Pattern – Notes (Exercise 2C)

## Definition

The **Abstract Factory pattern** is a creational design pattern that provides an interface for creating **families of related or dependent objects** without specifying their concrete classes.

The client interacts only with **abstract interfaces**, while the concrete factories decide which specific objects are created.

Source: Refactoring Guru – https://refactoring.guru/design-patterns/abstract-factory

---

## Purpose of the Pattern

The Abstract Factory pattern is used when a system must create **multiple related objects that belong together**.

Typical examples include:

- User interface components for different operating systems (Windows / Mac / Linux)
- Database connectors for different database systems
- Theming systems where UI components must match the same style

The key goal is to **separate object creation from business logic** and ensure that related objects are used together.

---

## Main Components of the Pattern

### 1. Abstract Factory

Defines the interface for creating related objects.

Example:

```java
interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}


Exercise 2D - Can you identify the implementations of the AbstractFactory design pattern?

The code contains elements similar to a factory pattern, particularly the pizzaFactory() method inside PizzaOrder, which decides which pizza object to instantiate.

However, the code does not fully implement the Abstract Factory pattern because there is no abstract factory interface and it only creates a single type of product (Pizza). Instead, it more closely resembles a Simple Factory implementation where a method selects which concrete class to instantiate based on input.