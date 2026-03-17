# 02 - Basic Arithmetic & Console I/O

## Overview
This section demonstrates how to read numeric values from the console, perform arithmetic operations, and print results. It covers operator precedence, integer vs floating-point division, and basic formatting of output.

## Why it matters
Numerical computation is a core part of many programs (finance, physics, data processing). Understanding how Java handles numeric types and operators helps avoid subtle bugs and ensures accurate results.

## Key Concepts
- Arithmetic operators:
  - `+` (addition)
  - `-` (subtraction)
  - `*` (multiplication)
  - `/` (division)
  - `%` (modulo / remainder)
- Java follows standard operator precedence (e.g., `*` and `/` before `+` and `-`). Use parentheses to force evaluation order.
- Integer division truncates toward zero (e.g., `5 / 2 == 2`). Use floating-point types (`double`, `float`) when you need decimals.
- Type promotion: mixing `int` and `double` promotes to `double`.

## Common Pitfalls
- Dividing two `int` values gives an integer result even if you expect a decimal. Cast to `double` or use `nextDouble()` to avoid this.
- String concatenation with `+` is evaluated left-to-right. Use parentheses when combining arithmetic with strings.
- Using `Math.pow()` with integers returns a `double` and may require casting.

## How it works
- Java evaluates expressions using standard operator precedence (multiplication before addition).
- Use parentheses to make order of operations explicit.

## Example (area calculation)
```java
Scanner sc = new Scanner(System.in);
double radius = sc.nextDouble();
double area = 3.14 * radius * radius;
System.out.println("Area of circle is : " + area);
```

## Example files
- [code/C17/AreaOfCircle.java](../code/C17/AreaOfCircle.java) (calculate area of a circle)
- [code/C17/DaysToYear.java](../code/C17/DaysToYear.java) (convert days to years)
- [code/C17/TimeConversion.java](../code/C17/TimeConversion.java) (convert minutes/seconds/timing)
