# 08 - Nested Conditionals (Leap Year, Day Mapping, Largest Number)

## Overview
Nested conditionals allow you to make decisions based on multiple layers of logic. They are useful when later checks depend on earlier outcomes.

## Key Concepts
- A leap year is:
  - divisible by 4 AND (not divisible by 100 OR divisible by 400).
- Use nested `if` blocks when a decision depends on a previous one.
- For mapping values (like days of the week), `else if` chains let you select one of many cases.

## Common Pitfalls
- Too much nesting makes code hard to read; consider extracting logic into well-named methods.
- Forgetting to handle invalid input (e.g., day numbers outside 1-7).

## Example snippet (leap year check)
```java
if (year % 100 == 0) {
    if (year % 400 == 0) System.out.println("Leap year");
    else System.out.println("Not a leap year");
} else {
    if (year % 4 == 0) System.out.println("Leap year");
    else System.out.println("Not a leap year");
}
```

## Example files
- `code/C26/LeapYear.java` (nested `if` for leap-year rules)
- `code/C26/Day.java` (multiple `else if` branches for day mapping)
- `code/C26/Largest.java` (nested comparisons for finding the largest number)
