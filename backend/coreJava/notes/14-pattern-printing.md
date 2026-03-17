# 14 - Pattern Printing (Nested Loops)

## Overview
Pattern printing is a common exercise for practicing nested loops and understanding how loop variables correspond to rows and columns in output.

## Key Concepts
- Outer loop usually represents rows.
- Inner loop controls columns/characters printed on each row.
- Adjust spacing and characters based on loop indices to shape patterns.

## Common Pitfalls
- Off-by-one errors in loop bounds can shift or truncate the pattern.
- Forgetting to include `System.out.println()` at the end of each row results in a single-line output.

## Example snippet (simple pyramid)
```java
for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print("*");
    }
    System.out.println();
}
```

## Example files
- `code/C33/RightHalfPyramid.java` (right-aligned pyramid)
- `code/C33/RightHalfNumberPyramid.java` (numbers in pyramid)
- `code/C33/ReverseRightHalfPyramid.java` (inverted pyramid)
- `code/C33/SquareFillPattern.java` (filled square)
- `code/C33/TriangularPyramid.java` (triangle of numbers)
