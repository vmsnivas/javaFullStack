# 15 - Object Methods & Menu-driven Programs

## Overview
This section demonstrates using object-oriented structure (classes and methods) and building menu-driven console applications where the user selects options repeatedly.

## Key Concepts
- Create a class with instance methods to encapsulate behavior.
- Instantiate objects and call methods to perform operations.
- Use a loop (e.g., `while`) to keep presenting the menu until the user opts to exit.

## Common Pitfalls
- Not validating user input can lead to exceptions (e.g., entering text where numbers are expected).
- Forgetting to close the `Scanner` at the end of the program.

## Example snippet (menu loop)
```java
while (true) {
    System.out.println("1. Addition\n2. Exit");
    int choice = scanner.nextInt();
    if (choice == 5) break;
    // ... handle options ...
}
```

## Example files
- `code/C34/ParamsCalculator.java` (calculator using instance methods)
- `code/C34/Game.java` (skeleton of a game using methods and loops)
