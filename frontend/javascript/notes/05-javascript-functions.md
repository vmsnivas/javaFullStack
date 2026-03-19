# JavaScript Functions

Functions are reusable blocks of code that can accept inputs, execute logic, and optionally return a value. In JavaScript, functions are first-class citizens: they can be stored in variables, passed as arguments, and returned from other functions.

---

## 1) Function Declaration
A named function that is hoisted (the entire declaration is hoisted, so it can be called before it appears in code).

```js
function greet(name) {
  return `Hello, ${name}!`;
}

console.log(greet('Arjun'));
```

## 2) Function Expression
A function stored in a variable. Not hoisted (the variable is hoisted, but not the assignment).

```js
const greet = function(name) {
  return `Hello, ${name}!`;
};

console.log(greet('Arjun'));
```

## 3) Arrow Function (ES6)
Shorter syntax; lexical `this` binding (does not create its own `this`).

```js
const add = (a, b) => a + b;
const square = x => x * x;
```

Arrow functions with a block body require an explicit `return`:

```js
const multiply = (a, b) => {
  return a * b;
};
```

## 4) Parameters and Arguments
### Default parameters
```js
function greet(name = 'Guest') {
  console.log(`Hello, ${name}`);
}
```

### Rest parameters
Collects remaining arguments into an array.

```js
function sum(...nums) {
  return nums.reduce((total, n) => total + n, 0);
}
```

### Arguments object (non-arrow functions)
A built-in array-like object containing all passed arguments.

```js
function logArgs() {
  console.log(arguments);
}
```

## 5) Return value
Functions return `undefined` if no `return` is specified.

```js
function noReturn() {
  const x = 1;
}
console.log(noReturn()); // undefined
```

## 6) Scope and Closures
### Function scope
Variables declared inside a function are not accessible outside it.

```js
function localScope() {
  const secret = 'shh';
  return secret;
}
// console.log(secret); // ReferenceError
```

### Closures
A function retains access to the scope in which it was created.

```js
function makeCounter() {
  let count = 0;
  return function () {
    count += 1;
    return count;
  };
}

const counter = makeCounter();
console.log(counter()); // 1
console.log(counter()); // 2
```

## 7) Higher-order Functions
Functions that accept other functions as arguments or return functions.

```js
function applyTwice(fn, value) {
  return fn(fn(value));
}

const increment = x => x + 1;
console.log(applyTwice(increment, 5)); // 7
```

## 8) Immediately Invoked Function Expression (IIFE)
Runs immediately after definition; useful for isolating scope.

```js
(function () {
  const privateVar = 'hidden';
  console.log('IIFE ran');
})();
```

## 9) Common Gotchas
- Arrow functions do not have their own `this`, `arguments`, or `new.target`.
- Function declarations inside blocks have different behavior across environments; prefer function expressions in blocks.
- Reassigning a function parameter is allowed, but can be confusing.

---

## Example file
- [code/C03/01function.js](../code/C03/01function.js) (function definition + invocation)
