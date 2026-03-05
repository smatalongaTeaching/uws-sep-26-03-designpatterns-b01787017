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




## Exercise 3 – AI Prompt Comparison

Prompt used in AI tool:

"Look at the doShopping methods in the class ShoppingApp. Why is this code using Singleton?"

### AI explanation

The `doShopping()` method uses Singleton objects (`NetworkManager` and `DatabaseManager`) so that only one instance of each manager exists in the application.

Instead of creating new objects each time the method runs, the code calls:



These methods return the same instance every time they are called. This prevents multiple manager objects from being created and ensures that system resources such as database or network access are managed by a single shared object.

### Comparison with my answer

My explanation identified that there are three Singleton classes (`ShoppingApp`, `NetworkManager`, and `DatabaseManager`) and that Singleton is used to ensure only one instance of each manager exists.

The AI explanation focuses specifically on how the `doShopping()` method retrieves those Singleton instances and uses them to select the appropriate strategy based on connectivity.

Both explanations highlight that Singleton prevents unnecessary object creation and provides a central point of access to shared resources.