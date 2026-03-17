# 05 - Conditional Practice (Calculator, Eligibility)

## Overview
This section applies conditional logic to common real-world tasks like implementing a simple calculator and checking eligibility rules.

## Key Concepts
- Use chained `if` / `else if` / `else` to evaluate multiple cases.
- Check input validity and handle unexpected values gracefully.
- Compare characters (`char`) and strings to drive logic.

## Common Pitfalls
- When comparing characters, use `'+'` not `"+"` (string). Characters are compared using `==`.
- Always include an `else` branch when user input could be invalid.
- For calculators, avoid dividing by zero; validate the divisor.

## Example snippet (calculator branch)
```java
char op = s.next().charAt(0);
if (op == '+') System.out.println(num1 + num2);
else if (op == '-') System.out.println(num1 - num2);
else System.out.println("Unsupported operation!");
```

## Example files
- [code/C20/SimpleCalculator.java](../code/C20/SimpleCalculator.java) (basic calculator using `if` chains)
- [code/C20/VotingAge.java](../code/C20/VotingAge.java) (check eligibility to vote)
- [code/C20/MarriageAge.java](../code/C20/MarriageAge.java) (check marriage eligibility)
