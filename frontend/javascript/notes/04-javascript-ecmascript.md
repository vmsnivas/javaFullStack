# ECMAScript (ES) Overview

## What is ECMAScript?
ECMAScript (often abbreviated as **ES**) is the standard specification for JavaScript. It defines the language syntax, types, statements, keywords, and APIs. JavaScript engines (browsers, Node.js) implement this specification.

- **ECMA-262** is the official spec name.
- The term "JavaScript" is the implementation; "ECMAScript" is the standard.

## Versions / Editions
ECMAScript is updated regularly. Some major editions:

- **ES3 (1999)** – widely supported legacy baseline.
- **ES5 (2009)** – strict mode, `Object.create`, `JSON`, `Array.isArray`, `forEach`, `map`, `filter`.
- **ES6 / ES2015** – biggest update: `let`, `const`, arrow functions, classes, modules, template literals, destructuring, promises.
- **ES2016+** – yearly releases; each adds small features.
  - **ES2016**: `Array.prototype.includes`, exponentiation operator (`**`)
  - **ES2017**: `async`/`await`, `Object.entries`, `Object.values`
  - **ES2018**: rest/spread for objects, `Promise.finally`
  - **ES2019**: `Array.prototype.flat`, `Object.fromEntries`
  - **ES2020**: optional chaining (`?.`), nullish coalescing (`??`), BigInt
  - **ES2021**: `String.prototype.replaceAll`, `Promise.any`
  - **ES2022+`**: `class fields`, `top-level await`, `private class methods`

> 🔍 Each engine (Chrome V8, Firefox SpiderMonkey, Safari JavaScriptCore, Node.js) implements ECMAScript features at its own pace.

## Why it matters
- When writing modern JavaScript, you often rely on ES features (e.g., `let`, `modules`, async/await).
- Older browsers or environments may not support the newest features.
- Tools like Babel/TypeScript can transpile modern ES into older ES for compatibility.

## Key ES6 / Modern Features (Commonly Used)
### Block-scoped variables
- `let`, `const` (vs `var`)

### Arrow functions
```js
const add = (a, b) => a + b;
```

### Template literals
```js
const name = 'Arjun';
console.log(`Hello, ${name}!`);
```

### Destructuring
```js
const [x, y] = [1, 2];
const { name, age } = { name: 'A', age: 30 };
```

### Default parameters
```js
function greet(name = 'Guest') {
  console.log('Hello', name);
}
```

### Spread / Rest
```js
const a = [1, 2];
const b = [...a, 3];
function sum(...nums) { return nums.reduce((s, n) => s + n, 0); }
```

### Classes
```js
class Person {
  constructor(name) {
    this.name = name;
  }
  greet() { console.log('Hi', this.name); }
}
```

### Modules (ES Modules)
- `export` / `import` syntax (supported in modern browsers and Node.js with `type: "module"`).

```js
// math.js
export function add(a, b) { return a + b; }

// main.js
import { add } from './math.js';
```

### Promises + async/await
```js
function wait(ms) {
  return new Promise(resolve => setTimeout(resolve, ms));
}

async function run() {
  await wait(100);
  console.log('done');
}
```

## Using modern ES safely
- **Check browser support:** caniuse.com / mdn.
- **Transpile:** use Babel or TypeScript when targeting older environments.
- **Polyfills:** add missing APIs (e.g., `Promise`, `fetch`) for older browsers.

## References
- [ECMA-262 specification](https://tc39.es/ecma262/)
- [MDN ECMAScript guide](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Guide/Grammar_and_types)
