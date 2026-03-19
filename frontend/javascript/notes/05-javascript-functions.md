# JavaScript Functions

Functions are reusable blocks of code that can accept inputs, execute logic, and optionally return a value. In JavaScript, functions are *first-class citizens*: they can be stored in variables, passed as arguments to other functions, and returned from functions.

---

## Function fundamentals
- A function is invoked (called) by using `()` after its name or reference.
- JavaScript functions have a `[[Call]]` internal method that handles invocation.
- Functions can be used as constructors with `new` (except arrow functions).
- Every function invocation creates a new execution context with its own scope and `this` value.

---

## 1) Function declarations vs expressions

### Function declaration
A named function that is hoisted: the entire function definition is available before it appears.

```js
function greet(name) {
  return `Hello, ${name}!`;
}

console.log(greet('Arjun')); // works even if called above the declaration
```

### Function expression
The function is defined as an expression and stored in a variable. Only the variable name is hoisted; the assignment happens at runtime.

```js
const greet = function(name) {
  return `Hello, ${name}!`;
};

console.log(greet('Arjun'));
```

### Named function expression
Allows the function to have an internal name (useful for recursion or debugging).

```js
const fact = function factorial(n) {
  return n <= 1 ? 1 : n * factorial(n - 1);
};
```

### Anonymous function expression
Commonly used for callbacks.

```js
setTimeout(function() {
  console.log('Delayed');
}, 1000);
```

---

## 2) Arrow functions (ES6)
Arrow functions provide a concise syntax and lexical `this` binding (they inherit `this` from the surrounding scope). They cannot be used as constructors (`new`) and have no `arguments` object.

```js
const add = (a, b) => a + b;
const square = x => x * x;
```

If you need a block body, use curly braces and `return` explicitly:

```js
const multiply = (a, b) => {
  const result = a * b;
  return result;
};
```

### Implicit return vs explicit return
- In a single-expression arrow function, the result is returned implicitly.
- In a block body, you must use `return`.

---

## 3) Parameters & arguments

### Default parameters
You can provide defaults that apply when the caller omits an argument.

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

### Destructured parameters
You can destructure objects or arrays directly in the parameter list.

```js
function printUser({ name, age }) {
  console.log(name, age);
}

printUser({ name: 'A', age: 30 });
```

### `arguments` object (non-arrow functions)
A built-in array-like object containing all passed arguments. Not available in arrow functions.

```js
function logArgs() {
  console.log(arguments);
}

logArgs(1, 2, 3); // Arguments(3) [1, 2, 3, callee: (...), ...]
```

---

## 4) Return values
Functions can return any value (primitive, object, function, etc.). If no `return` statement is executed, the function returns `undefined`.

```js
function noReturn() {
  const x = 1;
}
console.log(noReturn()); // undefined

function buildUser(name) {
  return { name, createdAt: Date.now() };
}
```

Early returns are common for input validation:

```js
function divide(a, b) {
  if (b === 0) return null;
  return a / b;
}
```

---

## 5) Scope, `this`, and closures

### Scope types
- **Global scope**: variables declared outside any function.
- **Function scope**: variables declared inside a regular function (`var`, `let`, `const`).
- **Block scope**: `let` and `const` are block-scoped (inside `{}` blocks).

### `this` binding
`this` is set based on how a function is called:
- Called as a method: `this` is the object (receiver).
- Called as a plain function: `this` is `undefined` in strict mode (global object otherwise).
- Called with `new`: `this` is the newly created object.
- Called with `call`/`apply`/`bind`: `this` can be explicitly set.

```js
const obj = { value: 10, getValue() { return this.value; } };
obj.getValue(); // 10

const unbound = obj.getValue;
unbound(); // undefined (strict mode)
```

#### Arrow function `this`
Arrow functions don’t create their own `this`. They inherit `this` from the surrounding lexical scope.

```js
const obj = {
  value: 10,
  getValue: () => this.value, // `this` is not obj
};
```

### Closures
A closure occurs when a function “remembers” the environment where it was created.

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

Closures are used for private state, factories, and callbacks.

---

## 6) `call`, `apply`, and `bind`
These methods let you control the value of `this` when calling a function.

```js
function greet() {
  return `Hello, ${this.name}`;
}

const person = { name: 'Alice' };

console.log(greet.call(person));
console.log(greet.apply(person));

const boundGreet = greet.bind(person);
console.log(boundGreet());
```

---

## 7) Higher-order functions
A higher-order function accepts functions as arguments or returns a function.

### Example: map/filter/reduce
```js
const nums = [1, 2, 3];
const doubled = nums.map(x => x * 2);
const evens = nums.filter(x => x % 2 === 0);
const sum = nums.reduce((acc, x) => acc + x, 0);
```

### Example: function factories
```js
function multiplier(factor) {
  return x => x * factor;
}

const twice = multiplier(2);
console.log(twice(5)); // 10
```

---

## 8) Async functions
Async functions make working with promises easier.

```js
function wait(ms) {
  return new Promise(resolve => setTimeout(resolve, ms));
}

async function run() {
  await wait(100);
  console.log('done');
}
```

Async functions always return a promise.

---

## 9) Generators (optional)
Generators can pause and resume execution using `yield`.

```js
function* counter() {
  let i = 0;
  while (true) {
    yield i++;
  }
}

const gen = counter();
console.log(gen.next().value); // 0
console.log(gen.next().value); // 1
```

---

## 10) Immediately Invoked Function Expression (IIFE)
An IIFE runs immediately and can be used to create a local scope.

```js
(function () {
  const privateVar = 'hidden';
  console.log('IIFE ran');
})();
```

---

## 11) Common gotchas
- Arrow functions do not have their own `this`, `arguments`, or `new.target`.
- Function declarations inside blocks can behave inconsistently across environments; prefer function expressions for block scope.
- Reassigning function parameters is allowed but can be confusing.
- Using `eval()` or `new Function()` is usually unsafe and slow (avoid in production).

---

## Example file
- [code/C03/01function.js](../code/C03/01function.js) (function definition + invocation)
