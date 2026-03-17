# 04 - Conditionals (if / else)

## Overview
Conditionals let your program make decisions. Depending on boolean expressions, you can execute different paths of code.

## Why it matters
Decision-making is fundamental to almost every program—conditionals let code respond differently based on user input, computation results, or state.

## Key Concepts
- `if (condition) { ... }` executes the block only when `condition` is true.
- `else if (condition) { ... }` provides additional branches when prior conditions are false.
- `else { ... }` is the fallback when no prior conditions are true.
- Boolean operators:
  - `==`, `!=` (equality / inequality)
  - `<`, `>`, `<=`, `>=` (comparisons)
  - `&&` (logical AND), `||` (logical OR), `!` (logical NOT)

## Common Pitfalls
- Use `==` for primitive comparisons; use `.equals(...)` when comparing strings.
- Be careful with operator precedence: `&&` has higher precedence than `||`.
- Avoid deeply nested `if` blocks; consider breaking logic into methods or using `switch` when appropriate.
- Comparing floating point values with `==` can be unreliable due to precision issues; use a tolerance.

## How it works
The condition inside `if (...)` must evaluate to a boolean (`true` or `false`). Java automatically converts boolean expressions (like `x > 5`) to `true/false`.

## Example snippet
```java
int x = 7;
if (x % 2 == 0) {
    System.out.println("even");
} else {
    System.out.println("odd");
}
```

## Example files
- [code/C19-Conditions/EvenOddIf.java](../code/C19-Conditions/EvenOddIf.java) (check even/odd using `if`)
- [code/C19-Conditions/EvenOddIfElse.java](../code/C19-Conditions/EvenOddIfElse.java) (same with `else` branch)
- [code/C19-Conditions/Largest.java](../code/C19-Conditions/Largest.java) (find largest of three numbers)
