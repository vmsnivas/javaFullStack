# 17 - Advanced Arrays (2D, Jagged, Varargs)

## Overview
This note covers multidimensional arrays (including jagged arrays) and variable-length argument lists (varargs), plus returning arrays from methods.

## Key Concepts
- 2D arrays are arrays of arrays (e.g., `int[][] matrix = new int[3][4];`).
- Iterate using nested loops: outer loop for rows, inner loop for columns.
- Jagged arrays have rows with different lengths (e.g., `new int[][] { {1}, {2,3} }`).
- Varargs (`int... nums`) allows methods to accept zero or more arguments.

## Common Pitfalls
- Assuming all rows in a 2D array have the same length (not true for jagged arrays).
- Returning an array reference allows callers to mutate internal state unless you copy the array.

## Example snippet (2D traversal)
```java
for (int i = 0; i < matrix.length; i++) {
    for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
    }
    System.out.println();
}
```

## Example snippet (varargs)
```java
int sum(int... nums) {
    int total = 0;
    for (int n : nums) total += n;
    return total;
}
```

## Example files
- `code/C38/Arrays2D.java` (2D array traversal)
- `code/C38/JaggedArray.java` (jagged array example)
- `code/C38/ForLoopArrays.java` (for-loop traversal of arrays)
- `code/C38/ReturnArray.java` (method returns an array)
- `code/C38/VarArgs.java` (use of variable arguments in methods)
- `code/C38/Sum.java` (sum values, likely using arrays or varargs)
