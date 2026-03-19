# JavaScript Basics

## Overview
JavaScript is the primary programming language of the web. It runs in browsers and in environments like Node.js. JavaScript lets you manipulate page content, respond to user actions, and implement logic.

---

## Variable declarations (var/let/const)
### `var`
- Function-scoped (or global if declared outside any function).
- Hoisted: the declaration is moved to the top of its scope, but the initialization stays in place.
- Can be redeclared and re-assigned.

```js
console.log(a); // undefined (hoisted)
var a = 10;
var a = 20; // allowed
```

> ⚠️ `var` can lead to bugs due to hoisting and scope leakage; prefer `let`/`const`.

### `let`
- Block-scoped (`{ ... }`).
- Cannot be redeclared in the same scope.
- Hoisted but in a *Temporal Dead Zone* (TDZ) until initialized.

```js
// Error if uncommented: ReferenceError: Cannot access 'x' before initialization
// console.log(x);
let x = 5;
x = 6; // ok
```

### `const`
- Block-scoped.
- Must be initialized at declaration.
- Cannot be reassigned, but objects/arrays can still be mutated.

```js
const PI = 3.14;
// PI = 3.1415; // TypeError

const user = { name: 'Alice' };
user.name = 'Bob'; // allowed
```

---

## Data types (values and behavior)
### Primitive types (immutable)
- `number` — all numeric values (integers, floats, `NaN`, `Infinity`).
- `bigint` — integers beyond `Number.MAX_SAFE_INTEGER`.
- `string` — text (`'hi'`, `"hi"`, `` `template ${x}` ``).
- `boolean` — `true` or `false`.
- `null` — intentionally “no value”.
- `undefined` — declared but not assigned (or missing property).
- `symbol` — unique identifiers, often used as object keys.

### Reference types (objects)
- `Object` — plain objects, maps, etc.
- `Array` — ordered lists.
- `Function` — callable objects.
- Built-ins like `Date`, `RegExp`, `Map`, `Set`, etc.

> 🔎 Primitives are copied by value; objects are copied by reference.

### `typeof` operator
Returns a string describing the type of a value.

```js
typeof 10; // "number"
typeof null; // "object" (historical quirk)
typeof []; // "object"
```

### Truthy / Falsy values
Falsy: `false`, `0`, `""`, `null`, `undefined`, `NaN`.
Everything else is truthy (including `[]`, `{}`, and `"0"`).

### Type coercion & equality
- `==` compares with type coercion.
- `===` compares without coercion (recommended).

```js
0 == false; // true
0 === false; // false
null == undefined; // true
null === undefined; // false
```

---

## Debugging
- Use `console.log()` to print values.
- Use `console.table()` for arrays/objects.
- Use browser devtools or Node.js debugger for step-through inspection.

---

## Example snippet
```js
var name = 'Arjun';
console.log('Employee Name:', name);
console.log(typeof name);
```

## Example files
- [code/C01/01sample.js](../code/C01/01sample.js) (basic variables and `console.log` output)
