# Singleton Object

---

## Task 1.3.3

Why Can't a Singleton Object Be Created from Outside the Singleton Class?

---

## What is Singleton?

The **Singleton** pattern guarantees that:
1. **Only one instance** of the class can exist.
2. **A global access point** is provided through which the single instance can be retrieved.

This pattern is especially useful when a single, shared instance is required to coordinate actions across a system.

---

## Why Can't We Use `new` to Create a Singleton?

In Java, creating a Singleton instance using `new` from outside the class is impossible because:

1. **Private Constructor**: The Singleton class has a private constructor, which restricts instantiation from outside the class itself. By marking the constructor as `private`, the class prevents other parts of the code from creating a new instance using `new`. Only the Singleton class can call this constructor internally.

2. **Controlled Access through `getInstance()` Method**: Instead of using `new`, the Singleton provides a method to retrieve the single instance:
    - The `getInstance()` method checks if an instance already exists.
    - If not, it creates a new instance and stores it.
    - Subsequent calls to `getInstance()` return the existing instance rather than creating a new one, ensuring only one instance exists.

---

## Singleton Class Example

Here’s a Java example of a Singleton class:

```java
public class Singleton {
    // Static variable to hold the single instance of Singleton
    private static Singleton instance;

    // Private constructor to restrict instantiation
    private Singleton() {
        // Optional: initialization logic
    }

    // Static method to return the single instance of the class
    public static Singleton getInstance() {
        if (instance == null) { // Check if an instance is already created
            instance = new Singleton(); // Create the instance
        }
        return instance;
    }

    // Method to demonstrate functionality
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}
```
## Explanation

- **Private Constructor:** By marking the constructor as `private`, no other part of the code can instantiate Singleton using `new`. Only the Singleton class itself can access this constructor.

- **Method:** `getInstance()` checks if `instance` is `null`. If it is, it creates the Singleton instance. Otherwise, it simply returns the existing instance. This ensures only one instance of Singleton is ever created.

## Example of Using the Singleton

```java
public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance(); // Retrieve the single instance
        singleton.showMessage(); // Demonstrate Singleton functionality
    }
}

```