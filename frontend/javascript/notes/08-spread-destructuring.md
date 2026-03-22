# 🧠 JavaScript Notes: Spread, Destructuring, Rest & Scoping

---

## 📌 1. Spread Operator (`...`)

The spread operator is used to expand objects or arrays.

### Uses:
- Merging objects
- Cloning objects
- Updating properties

### Example (Merging Objects)
    const personalData = {
        name: "Arjun",
        mobile: ""
    }

    const professionalData = {
        company: "LinuxLibrary",
        salary: 98789,
        designation: "React Developer",
        onsite: false
    }

    let data = { ...personalData, ...professionalData }

### Explanation:
- Combines both objects
- If duplicate keys → last value overrides

---

### Updating Existing Property
    data = { ...data, mobile: "9876543210" }

✔ Updates existing property

---

### Adding New Property
    data = { ...data, email: "arjun@gmail.com" }

✔ Adds new property

---

### Key Points:
- Creates shallow copy
- Order matters
- Useful for immutability

---

## 📌 2. Destructuring

Used to extract values from objects/arrays.

### Traditional Way
    const name = data.name;
    const designation = data.designation;

---

### Using Destructuring
    const { company, email } = data;

✔ Cleaner and shorter

---

### Rest with Destructuring
    const { salary, mobile, ...displayData } = data;

### Explanation:
- Extracts salary and mobile
- Remaining properties go into displayData

---

### Example Output
    {
      name: "Arjun",
      company: "LinuxLibrary",
      designation: "React Developer",
      onsite: false,
      email: "arjun@gmail.com"
    }

---

### Key Points:
- Improves readability
- Reduces repetitive code

---

## 📌 3. Rest Operator (`...`)

Used to collect remaining values.

### Example
    const { salary, mobile, ...displayData } = data;

✔ Remaining properties stored in displayData

---

### Spread vs Rest

| Feature | Spread | Rest |
|--------|--------|------|
| Purpose | Expand | Collect |
| Usage | Right side | Left side |

---

## 📌 4. Scoping

Defines where variables are accessible.

### Example
    const dev1 = "Suresh1";

    function greet(){
        const dev1 = "Ramesh";
        console.log("Welcome ", dev1);
    }

    console.log("Welcome ", dev1);
    greet();

### Output
    Welcome Suresh1
    Welcome Ramesh

---

### Explanation:
- Global variable → "Suresh1"
- Function variable → "Ramesh"
- Inner variable overrides outer (shadowing)

---

### Types of Scope

1. Global Scope → accessible everywhere  
2. Function Scope → inside functions  
3. Block Scope → inside {} (let, const)

---

### Variable Shadowing
    const a = 10;

    function test(){
        const a = 20;
        console.log(a); // 20
    }

---

### Key Points:
- let & const → block scoped  
- var → function scoped  
- Inner scope overrides outer  

---

## 📌 5. Cloning

    const clone = { ...data };

✔ Creates shallow copy

---

## 📌 6. Concatenation

    const merged = { ...obj1, ...obj2 };

✔ Combines objects

---

## 📌 7. Creating New Property

    const updated = { ...data, newKey: "value" };

---

## 📌 8. Updating Existing Property

    const updated = { ...data, key: "newValue" };

---

## ⚠️ Important Notes

- Spread creates shallow copy only  
- Nested objects are still referenced  
- Order matters in merging  

---

## ✅ Summary

| Concept | Description |
|--------|-------------|
| Spread | Expand / merge |
| Rest | Collect remaining |
| Destructuring | Extract values |
| Scoping | Variable visibility |
| Cloning | Copy object |
| Update | Modify property |
| Add | Add property |

---

## 🚀 Best Practices

- Use spread for immutability  
- Use destructuring for clean code  
- Prefer let/const over var  
- Be careful with nested objects  