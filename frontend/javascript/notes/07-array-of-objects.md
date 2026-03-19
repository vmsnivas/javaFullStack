# Arrays of Objects (Common Patterns)

JavaScript arrays often contain objects when modeling collections of related data (e.g., users, products, tasks). Working with arrays of objects usually involves iterating over the array and using array methods like `forEach`, `filter`, and `find`.

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

## `forEach` (iterate for side effects)
Use `forEach` when you need to run an operation for each item (e.g., logging, updating UI).

```js
employees.forEach(e => {
  console.log(e.name);
});
```

## `filter` (subset of items)
`filter` returns a new array with all items that match a condition.

```js
const frontendDevs = employees.filter(e => {
  return e.designation === 'React Developer' && e.onsite;
});
console.log(frontendDevs);
```

## `find` (first matching item)
`find` returns the first element that matches the condition or `undefined` if none match.

```js
const backendDev = employees.find(e => {
  return e.designation === 'Node Developer' && e.onsite;
});
console.log(backendDev);
```

## Common patterns
### Map to a different shape
```js
const names = employees.map(e => e.name);
```

### Sum a numeric field
```js
const totalSalary = employees.reduce((sum, e) => sum + e.salary, 0);
```

### Group by a key
```js
const byDesignation = employees.reduce((acc, e) => {
  (acc[e.designation] ||= []).push(e);
  return acc;
}, {});
```

---

## Notes
- Array methods do not mutate the original array (except mutation methods like `push`, `pop`, `splice`).
- Prefer `const` for array variables when reassigning the variable isn't needed.
- Use `===` for strict equality when matching string or numeric properties.
