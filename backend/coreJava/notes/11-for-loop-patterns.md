# 11 - `for` Loops & Common Numeric Patterns

## Overview
`for` loops are used when the number of iterations is known or can be derived. This section covers using `for` loops for number sequences, checking mathematical properties (prime, palindrome, etc.), and generating simple text patterns.

## Key Concepts
- `for (init; condition; update)` is the standard loop structure in Java.
- Use modulo `%` to test divisibility (e.g., `num % 2 == 0` for even numbers).
- Nested `for` loops are useful for 2D patterns and multi-level iteration.

## Common Pitfalls
- Off-by-one errors are common (e.g., iterating `i <= n` vs `i < n`).
- Avoid recalculating expensive operations inside the loop if not needed.
- Break out of the loop early with `break` when a result is found (e.g., early prime detection).

## Example snippet (prime check)
```java
boolean isPrime = true;
for (int i = 2; i <= num / 2; i++) {
    if (num % i == 0) {
        isPrime = false;
        break;
    }
}
```

## Example files
- `code/C29-For/For.java` (basic `for` loop usage)
- `code/C29-For/Prime.java` (prime number check)
- `code/C29-For/Palindrome.java` (reverse and compare numbers)
- `code/C29-For/Armstrong.java` (Armstrong number check)
- `code/C29-For/NumberReverse.java` (reverse digits)
- `code/C29-For/Square.java` (printing square patterns)
- `code/C29-For/SumOfDigits.java` (sum digits of a number)
- `code/C29-For/Perfect.java` (perfect number check)
- `code/C29-For/HCF.java` and `code/C29-For/LCM.java` (gcd/lcm calculations)
