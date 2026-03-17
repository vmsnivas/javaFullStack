# 16 - Arrays (Single-dimensional)

## Overview
Arrays let you store multiple values of the same type in a contiguous block of memory. They provide fast indexed access but have a fixed size once created.

## Key Concepts
- Declaration: `int[] nums;`
- Initialization: `int[] nums = new int[5];` or `int[] nums = {1, 2, 3};`
- Access: `nums[i]` (0-based index).
- Length: `nums.length` (not a method).

## Common Pitfalls
- Accessing an index outside the valid range (`0` to `length - 1`) throws `ArrayIndexOutOfBoundsException`.
- Arrays are mutable; modifying one reference modifies the underlying data.

## Example snippet (sum calculation)
```java
int sum = 0;
for (int i = 0; i < nums.length; i++) {
    sum += nums[i];
}
```

## Example files
- `code/C37/Arrays.java` (declare and initialize an array)
- `code/C37/SumOfAllElements.java` (sum array elements)
- `code/C37/LargestNum.java` (find max element)
- `code/C37/SmallestNum.java` (find min element)
- `code/C37/Count.java` (count elements meeting a condition)
