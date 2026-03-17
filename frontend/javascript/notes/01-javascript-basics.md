# JavaScript Basics

## Overview
JavaScript is the primary programming language of the web. It runs in browsers and in environments like Node.js. JavaScript lets you manipulate page content, respond to user actions, and implement logic.

## Variables
- `var`: function-scoped, can be redeclared.
- `let`: block-scoped, can't be redeclared in the same scope.
- `const`: block-scoped constant (value cannot be reassigned).

## Data Types
- Primitives: `number`, `string`, `boolean`, `null`, `undefined`, `symbol`, `bigint`.
- Objects: arrays, plain objects, functions, etc.

## Debugging
- Use `console.log()` to print values.
- `typeof` returns a string describing the value type.

## Common Pitfalls
- `var` is function-scoped and can cause unexpected hoisting behavior.
- `==` performs type coercion; prefer `===` for strict equality.
- `null` and `undefined` are different values but both are falsy.

## Example snippet
```js
var name = 'Arjun';
console.log('Employee Name: ' + name);
console.log(typeof name);
```

## Example files
- [code/C01/01sample.js](../code/C01/01sample.js) (basic variables and `console.log` output)
