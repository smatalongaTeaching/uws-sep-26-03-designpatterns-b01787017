# Exercise 3C – Singleton Pattern Analysis

## How many Singleton classes are there?

There are **three Singleton classes** in the package:

1. **ShoppingApp**
2. **NetworkManager**
3. **DatabaseManager**

These classes can be identified as Singletons because they contain:

- A **private static instance variable**
- A **private constructor**
- A **public static getInstance() method**

Example pattern used in the classes:

```java
private static ClassName obj;

private ClassName(){}

public static ClassName getInstance() {
    if (obj == null)
        obj = new ClassName();

    return obj;
}