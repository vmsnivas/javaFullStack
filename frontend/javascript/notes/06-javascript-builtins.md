# JavaScript Built-in Functions & Standard Methods

JavaScript provides a set of built-in (predefined) functions and standard library methods that are available without importing anything. These are part of the language runtime (browser or Node.js) and are commonly used in everyday code.

---

## Global Functions
### `parseInt()` / `parseFloat()`
Convert strings to numbers.

```js
parseInt('42', 10); // 42
parseFloat('3.14'); // 3.14
parseInt('101', 2); // 5 (binary)
```

### `Number()` / `String()` / `Boolean()`
Convert values to primitives.

```js
Number('123'); // 123
String(123); // "123"
Boolean(0); // false
```

### `isNaN()` / `Number.isNaN()`
Check for `NaN`. Prefer `Number.isNaN` for reliable behavior.

```js
isNaN('hello'); // true (because 'hello' coerces to NaN)
Number.isNaN('hello'); // false
Number.isNaN(NaN); // true
```

### `isFinite()` / `Number.isFinite()`
Check for finite numbers.

```js
isFinite(1/0); // false
Number.isFinite(1/0); // false
```

### `encodeURI()` / `decodeURI()`
Encode/decode URI components.

```js
encodeURI('https://example.com/?q=a b');
```

### `eval()` (use sparingly)
Evaluates a string as code. Avoid in production due to security and performance risks.

```js
const x = 2;
eval('x + 1'); // 3
```

---

## String Methods
Common string helpers (do not mutate original string).

```js
const s = 'hello';
s.length; // 5
s.toUpperCase(); // 'HELLO'
s.slice(1, 3); // 'el'
s.replace('l', 'L'); // 'heLlo'
s.includes('ll'); // true
s.split(''); // ['h','e','l','l','o']
```

---

## Array Methods
Array methods often return new arrays and do not mutate (unless explicitly documented).

```js
const arr = [1, 2, 3];
arr.push(4); // mutates: [1,2,3,4]
arr.pop(); // mutates: [1,2,3]
arr.slice(0, 2); // [1,2] (non-mutating)
arr.map(x => x * 2); // [2,4,6]
arr.filter(x => x % 2 === 1); // [1,3]
arr.reduce((sum, x) => sum + x, 0); // 6
arr.includes(2); // true
```

---

## Object Methods
Useful for working with plain objects.

```js
const obj = { a: 1, b: 2 };
Object.keys(obj); // ['a','b']
Object.values(obj); // [1,2]
Object.entries(obj); // [['a',1], ['b',2]]
Object.assign({}, obj, { c: 3 }); // merge
Object.freeze(obj); // makes object immutable (shallow)
```

---

## Math
Math utilities and constants.

```js
Math.abs(-5); // 5
Math.max(1, 5, 2); // 5
Math.min(1, 5, 2); // 1
Math.round(3.2); // 3
Math.random(); // random between 0 and 1
Math.PI; // 3.1415...
```

---

## Date
Working with dates and times.

```js
const now = new Date();
now.getFullYear();
now.toISOString();
const birthday = new Date('1990-01-01');
```

---

## JSON
Parse and stringify JSON.

```js
const obj = JSON.parse('{"a":1}');
const str = JSON.stringify(obj);
```

---

## Console APIs (debugging helpers)

```js
console.log('message');
console.error('error');
console.table([{a:1}, {a:2}]);
console.group('group');
console.groupEnd();
```

---

## Notes
- Many built-in methods are part of global objects (e.g., `Math`, `Date`, `JSON`, `Array`, `String`).
- Check MDN for full APIs and browser support.
