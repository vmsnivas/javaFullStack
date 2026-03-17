# 12 - `break` / `continue` / Labels & Basic Methods

## Overview
This note explores controlling loop execution with `break` and `continue`, and demonstrates basic method creation for reusable code.

## Why it matters
Understanding loop control helps you write correct, efficient loops, and methods are essential for organizing code and avoiding duplication.

## Key Concepts
- `break` immediately exits the nearest loop.
- `continue` skips the rest of the current loop iteration and jumps to the next iteration.
- Labels allow `break` and `continue` to target outer loops (rare but useful in nested scenarios).
- Methods encapsulate logic and can accept parameters and return values.

## Common Pitfalls
- Overusing `break`/`continue` can make loops harder to reason about; prefer clear loop conditions when possible.
- Labeled loops can be confusing; use sparingly and consider refactoring into separate methods.

## How it works
`break` exits the nearest loop immediately. `continue` skips to the next iteration of the current loop. With labels, you can target outer loops explicitly, but this is usually a sign that the logic should be refactored.

## Example snippet (continue)
```java
for (int i = 1; i <= 10; i++) {
    if (i % 2 == 0) continue; // skip even numbers
    System.out.println(i);
}
```

## Example snippet (method)
```java
int add(int a, int b) {
    return a + b;
}
```

## Example files
- [code/C31/Break.java](../code/C31/Break.java) (`break` inside loops)
- [code/C31/Continue.java](../code/C31/Continue.java) (`continue` inside loops)
- [code/C31/Label.java](../code/C31/Label.java) (labeled `break` / `continue`)
- [code/C31/MethodAdd.java](../code/C31/MethodAdd.java) (simple method for addition)
