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
  case 'subtract':
    console.log(num1 - num2);
    break;
  default:
    console.log('Invalid operation');
}
```

## Loops
### `for` (standard loop)
A definite loop with initializer, condition, and updater.

```js
for (let i = 0; i < 5; i++) {
  console.log(i);
}
```

### `while` (conditional loop)
Runs as long as the condition is true.

```js
let i = 0;
while (i < 5) {
  console.log(i);
  i++;
}
```

### `do...while` (run at least once)
Always runs the loop body at least once, then checks the condition.

```js
let i = 0;
do {
  console.log(i);
  i++;
} while (i < 5);
```

### `for...of` (iterate values)
Use for iterables (arrays, strings, sets, maps).

```js
for (const value of ['a', 'b', 'c']) {
  console.log(value);
}
```

### `for...in` (iterate keys/properties)
Iterates enumerable property keys. Commonly used with objects.

```js
const obj = { a: 1, b: 2 };
for (const key in obj) {
  console.log(key, obj[key]);
}
```

> ⚠️ Avoid using `for...in` with arrays; it iterates indices and inherited properties.

### Array iteration methods (functional style)
- `.forEach(fn)` — runs function for each element.
- `.map(fn)` — returns a new array of transformed values.
- `.filter(fn)` — returns a new array of elements that pass the test.
- `.reduce(fn, init)` — reduces values to a single result.

Example:
```js
const nums = [1, 2, 3];
const doubled = nums.map(n => n * 2);
const evens = nums.filter(n => n % 2 === 0);
```

### Control within loops
- `break` exits the loop immediately.
- `continue` skips to the next iteration.

```js
for (let i = 0; i < 10; i++) {
  if (i === 5) break;
  if (i % 2 === 0) continue;
  console.log(i);
}
```

### Infinite loops
A loop with a condition that never becomes false will run forever and can freeze the program.

---

## Functions
Define reusable behavior:

```js
function greet(name) {
  console.log('Welcome', name);
}
greet('Arjun');
```

---

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
