# 09 - `switch` Statements & Basic Loops

## Overview
This note covers two related topics: using `switch` for multi-way branching and using `while` loops for repeated execution.

## Why it matters
Multi-way branching and loops are among the most common control flow structures. `switch` statements can make complex selections easier to read, and loops are essential for repetition.

## `switch` / `case`
- Ideal when you need to select behavior based on a single value (e.g., integers, enums, strings).
- Each `case` should end with `break` to prevent fall-through.
- `default` provides a fallback for unexpected values.

## `while` Loops
- Repeats a block of code as long as the condition remains true.
- Check the condition before each iteration (pre-test loop).

## Common Pitfalls
- Forgetting `break` in a `switch` causes fall-through to subsequent cases.
- `while(true)` creates an infinite loop unless you `break` or change the condition inside the loop.

## How it works
A `switch` compares a single value against multiple `case` labels. Execution begins at the matching case and continues until a `break` is reached or the switch ends.

A `while` loop evaluates its condition before each iteration. The loop body runs only when the condition is true.

## Example snippet (`switch` usage)
```java
switch(day) {
    case 1: System.out.println("Monday"); break;
    case 2: System.out.println("Tuesday"); break;
    // ...
    default: System.out.println("Wrong Input!");
}
```

## Example snippet (`while` usage)
```java
int num = 1;
while (num <= 5) {
    System.out.println("Hello Arjun!");
    num++;
}
```

## Example files
- [code/C27-Switch/Day.java](../code/C27-Switch/Day.java) (select day of week via `switch`)
- [code/C27-Switch/EvenOdd.java](../code/C27-Switch/EvenOdd.java) (determine even/odd using `switch`)
- [code/C27-Switch/WhileLoop.java](../code/C27-Switch/WhileLoop.java) (basic `while` loop printing text)
