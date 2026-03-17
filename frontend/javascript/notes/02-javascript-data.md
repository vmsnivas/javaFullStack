# JavaScript Data Structures (Objects & Arrays)

## Overview
Objects and arrays are the fundamental data structures in JavaScript. Objects are collections of named values, and arrays are ordered lists.

## Objects
- Created using `{}`.
- Properties are key-value pairs.
- Access using dot notation (`obj.key`) or bracket notation (`obj['key']`).

Example:
```js
var employee = {
  name: 'John Doe',
  salary: 30000,
  designation: 'React Developer'
};
console.log(employee.name);
```

## Arrays
- Created using `[]`.
- Indexed from 0.
- Have useful methods like `.push()`, `.pop()`, `.length`, `.map()`, `.filter()`.

Example:
```js
var employees = ['John', 'Jane', 'Doe'];
console.log(employees[0]);
console.log(employees.length);
```

## Example files
- [code/C02/01object.js](../code/C02/01object.js) (object literal and property access)
- [code/C02/02array.js](../code/C02/02array.js) (array indexing and `.length`)
