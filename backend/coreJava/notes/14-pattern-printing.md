# 14 - Pattern Printing (Nested Loops)

## Overview
Pattern printing is a common exercise for practicing nested loops and understanding how loop variables correspond to rows and columns in output.

## Why it matters
Writing pattern output helps you master nested loops and index calculations, which are useful for matrices, grids, and formatted text output.

## Key Concepts
- Outer loop usually represents rows.
- Inner loop controls columns/characters printed on each row.
- Adjust spacing and characters based on loop indices to shape patterns.

## Common Pitfalls
- Off-by-one errors in loop bounds can shift or truncate the pattern.
- Forgetting to include `System.out.println()` at the end of each row results in a single-line output.

## How it works
Each nested loop corresponds to a dimension of the output (rows vs columns). Adjust loop bounds and print logic to shape the pattern. The outer loop controls how many rows are printed; the inner loop controls the content of each row.

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
- [code/C33/RightHalfPyramid.java](../code/C33/RightHalfPyramid.java) (right-aligned pyramid)
- [code/C33/RightHalfNumberPyramid.java](../code/C33/RightHalfNumberPyramid.java) (numbers in pyramid)
- [code/C33/ReverseRightHalfPyramid.java](../code/C33/ReverseRightHalfPyramid.java) (inverted pyramid)
- [code/C33/SquareFillPattern.java](../code/C33/SquareFillPattern.java) (filled square)
- [code/C33/TriangularPyramid.java](../code/C33/TriangularPyramid.java) (triangle of numbers)
