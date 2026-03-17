# 06 - Bitwise Arithmetic (Two's Complement)

## Overview
Bitwise operators work directly on the binary representation of integers. They are commonly used in low-level algorithms, performance-sensitive code, and bitwise puzzles.

## Key Concepts
- Bitwise NOT (`~`): flips all bits (0↔1). In two's complement, `~x` equals `-(x + 1)`.
- Two's complement is the standard way Java represents negative integers.
- Subtraction can be performed using two's complement: `a - b` == `a + (~b + 1)`.

## Common Pitfalls
- Bitwise operations only make sense for integer types (`byte`, `short`, `int`, `long`), not floating-point values.
- Be careful with operator precedence: `~b + 1` is interpreted as `(~b) + 1`.
- Negative numbers printed in binary will show the two's complement representation.

## Example snippet
```java
int a = 8;
int b = 3;
int result = a + (~b + 1); // equivalent to a - b
tSystem.out.println(result);
```

## Example files
- `code/C21/Subtraction.java` (subtract two numbers without the `-` sign)
