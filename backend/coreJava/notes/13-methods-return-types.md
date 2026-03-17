# 13 - Methods & Return Types

## Overview
Methods are the building blocks of Java programs. They allow you to encapsulate behavior, avoid duplication, and create reusable abstractions.

## Key Concepts
- Method signature: `access modifiers` + `return type` + `name` + `(parameters)`.
- `void` methods perform actions and do not return a value.
- Non-void methods must return a value matching the declared type.
- Methods can be `static` (class-level) or instance methods (require an object instance).

## Common Pitfalls
- Forgetting to return a value from a non-void method leads to a compile-time error.
- Not using parameters can reduce method reusability.

## Example snippet (returning a value)
```java
int add(int a, int b) {
    return a + b;
}

// usage
int sum = add(2, 3);
```

## Example files
- `code/C32/MethodVoid.java` (void methods, no return)
- `code/C32/MethodReturnType.java` (methods returning values)
- `code/C32/SBI.java` (simple class with methods for bank-like operations)
