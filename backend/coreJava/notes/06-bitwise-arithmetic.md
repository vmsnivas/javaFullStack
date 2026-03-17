# 06 - Bitwise Arithmetic (Two's Complement)

## Overview
Bitwise operators work directly on the binary representation of integers. They are commonly used in low-level algorithms, performance-sensitive code, and bitwise puzzles.

## Why it matters
Understanding bitwise arithmetic is useful for optimizing code, working with binary protocols, and understanding how computers represent negative numbers.

## Key Concepts
- Bitwise NOT (`~`): flips all bits (0↔1). In two's complement, `~x` equals `-(x + 1)`.
- Two's complement is the standard way Java represents negative integers.
- Subtraction can be performed using two's complement: `a - b` == `a + (~b + 1)`.

## Common Pitfalls
- Bitwise operations only make sense for integer types (`byte`, `short`, `int`, `long`), not floating-point values.
- Be careful with operator precedence: `~b + 1` is interpreted as `(~b) + 1`.
- Negative numbers printed in binary will show the two's complement representation.

## How it works
Java uses two's complement to represent signed integers. The bitwise NOT (`~`) flips every bit, so `~x` is equivalent to `-(x + 1)` in two's complement arithmetic. This makes it possible to implement subtraction using addition: `a - b == a + (~b + 1)`.

## Example snippet
```java
int a = 8;
int b = 3;
int result = a + (~b + 1); // equivalent to a - b
System.out.println(result);
```

## Example files
- [code/C21/Subtraction.java](../code/C21/Subtraction.java) (subtract two numbers without the `-` sign)
