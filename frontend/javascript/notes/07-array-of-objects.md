# Arrays of Objects (Common Patterns)

JavaScript arrays often contain objects when modeling collections of related data (e.g., users, products, tasks). Each object usually represents an entity with multiple properties, and arrays let you work with the whole collection using powerful built-in methods.

This note is based on the sample program `code/C07/02arrayOfObjects.js`, which uses a list of employees and demonstrates common array operations.

---

## Example data (employees)
```js
const employees = [
  { name: 'Sireesha', designation: 'React Developer', salary: 98765, onsite: true },
  { name: 'Sanjay', designation: 'Node Developer', salary: 87654, onsite: true },
  { name: 'Praveen', designation: 'React Developer', salary: 76543, onsite: false },
  { name: 'Sam', designation: 'React Developer', salary: 65432, onsite: true },
  { name: 'Prem', designation: 'Node Developer', salary: 54321, onsite: false },
];
```

### Explanation of the data structure
- `employees` is an array of objects, where each object has the same set of keys: `name`, `designation`, `salary`, and `onsite`.
- Each object is a separate reference (mutating one object does not change the others). The array itself is also a reference, so using methods that mutate the array (like `push`) changes the original array.

---

## `forEach` (iterate for side effects)
`forEach` is used when you need to perform an action for each element but you don’t need a returned array.

```js
employees.forEach(e => {
  console.log(e.name);
});
```

### Concept breakdown
- `employees.forEach(...)` loops through every employee in order.
- The callback receives three arguments: `(element, index, array)` but you only need the element most of the time.
- Common uses: logging, DOM updates, accumulating stats in an external variable.

---

## `filter` (subset of items)
`filter` returns a **new array** containing elements that match a predicate (condition). It does not mutate the original.

```js
const frontendDevs = employees.filter(e => {
  return e.designation === 'React Developer' && e.onsite;
});
console.log(frontendDevs);
```

### Concept breakdown
- The callback is invoked for each array element.
- If the callback returns `true`, the element is included in the returned array.
- `frontendDevs` is a new array containing only onsite React developers; the original `employees` array remains unchanged.

---

## `find` (first matching item)
`find` searches for the **first element** that satisfies the predicate and returns it immediately, or `undefined` if none match.

```js
const backendDev = employees.find(e => {
  return e.designation === 'Node Developer' && e.onsite;
});
console.log(backendDev);
```

### Concept breakdown
- `find` stops iterating as soon as a match is found, which can be more efficient than `filter` when you only need one item.
- The returned value is the original object reference from the array (not a clone).

---

## Common patterns (beyond the sample program)

### Map to a different shape (transformation)
`map` creates a new array by transforming each element.

```js
const names = employees.map(e => e.name);
```

✅ Use `map` when you want a new array derived from the original, without mutating it.

---

### Sum a numeric field (accumulation)
`reduce` is a flexible method for combining array elements into a single value.

```js
const totalSalary = employees.reduce((sum, e) => sum + e.salary, 0);
```

### Explanation
- The callback receives an accumulator (`sum`) and the current element (`e`).
- The second argument to `reduce` (here `0`) is the initial accumulator value.
- Use `reduce` for sums, averages, counts, or building new objects/arrays.

---

### Group by a key (build a lookup)
You can use `reduce` to group items into buckets keyed by a property.

```js
const byDesignation = employees.reduce((acc, e) => {
  (acc[e.designation] ||= []).push(e);
  return acc;
}, {});
```

### Explanation
- `acc` starts as an empty object (`{}`).
- For each employee, we ensure there is an array at `acc[e.designation]` (using `||=`), then push the employee into that array.
- The result is an object where each key is a designation, and each value is an array of matching employees.

---

## Notes
- Array methods like `map`, `filter`, and `reduce` return new arrays/values and do not mutate the original array.
- Methods like `push`, `pop`, `splice`, and direct assignment (`arr[0] = ...`) do mutate the array.
- Use `const` for arrays when you don’t intend to reassign the variable; it still allows mutation of the array contents.
- Prefer `===` for strict equality checks when matching string or numeric properties to avoid unexpected coercion.
- When dealing with objects in arrays, remember you are working with references. Mutating an object affects all references to it.
