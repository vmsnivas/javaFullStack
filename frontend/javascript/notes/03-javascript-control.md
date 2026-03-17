# JavaScript Control Flow & Functions

## Overview
Control flow statements determine which code runs and how many times. Functions allow you to group logic into reusable blocks.

## Conditionals
- `if (condition) { ... }` runs code when the condition is truthy.
- `else if` and `else` provide additional branches.

Example:
```js
if (score > 90) {
  console.log('A');
} else if (score > 80) {
  console.log('B');
} else {
  console.log('C');
}
```

## Switch
`switch` is useful when selecting from multiple values of the same variable.
```js
switch (operator) {
  case 'add':
    console.log(num1 + num2);
    break;
  default:
    console.log('Invalid operation');
}
```

## Loops
- `for`: definite loop with initializer, condition, updater.
- `while`: repeats while a condition is true.
- `do...while`: runs at least once, then checks condition.

## Functions
Define reusable behavior:
```js
function greet(name) {
  console.log('Welcome', name);
}
greet('Arjun');
```

## Common Pitfalls
- Confusing `==` (loose equality) with `===` (strict equality) can cause hard-to-find bugs.
- Forgetting to declare variables (`var`, `let`, `const`) creates implicit globals.
- Arrow functions (`=>`) do not have their own `this` value, which changes behavior in callbacks.

## Example files
- [code/C04/01conditions.js](../code/C04/01conditions.js) (conditional branching)
- [code/C04/02switch.js](../code/C04/02switch.js) (switch statement)
- [code/C04/03for.js](../code/C04/03for.js) (for loop)
- [code/C04/04while.js](../code/C04/04while.js) (while loop)
- [code/C04/05doWhile.js](../code/C04/05doWhile.js) (do..while loop)
- [code/C03/01function.js](../code/C03/01function.js) (function definition and invocation)
