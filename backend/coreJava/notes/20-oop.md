# ☕ Object-Oriented Programming (OOP) in Java – Complete Notes

---

## 📌 What is OOP?

Object-Oriented Programming (OOP) is a programming paradigm based on the concept of **objects**, which contain:
- **Data (attributes / variables)**
- **Behavior (methods / functions)**

Java is a **fully object-oriented language** (except for primitive types).

---

## 🧱 Core Concepts of OOP

Java OOP is based on 4 main pillars:

1. **Encapsulation**
2. **Abstraction**
3. **Inheritance**
4. **Polymorphism**

---

## 1️⃣ Encapsulation

### 📌 Definition
Encapsulation is the process of **wrapping data and methods into a single unit (class)** and restricting direct access to data.

### 🔐 Purpose
- Protect data
- Control access using getters and setters

### 💡 Key Points
- Use `private` variables
- Provide `public` getter/setter methods

### 🧠 Example Concept
- Data is hidden from outside class
- Access is controlled

---

## 2️⃣ Abstraction

### 📌 Definition
Abstraction means **hiding implementation details and showing only essential features**.

### 🔍 How it's achieved in Java
- **Abstract classes**
- **Interfaces**

### 💡 Key Points
- Focus on *what* object does, not *how*
- Reduces complexity

---

## 3️⃣ Inheritance

### 📌 Definition
Inheritance allows one class to **acquire properties and methods of another class**.

### 🔗 Types in Java
- Single
- Multilevel
- Hierarchical

*(Java does not support multiple inheritance with classes, but supports it via interfaces)*

### 💡 Benefits
- Code reuse
- Reduces redundancy
- Improves maintainability

---

## 4️⃣ Polymorphism

### 📌 Definition
Polymorphism means **one name, multiple forms**.

### 🔄 Types

#### Compile-time (Method Overloading)
- Same method name
- Different parameters

#### Runtime (Method Overriding)
- Same method signature
- Different implementation in subclass

---

## 🧩 Classes and Objects

### 📌 Class
A blueprint for creating objects.

### 📌 Object
An instance of a class.

### 💡 Relationship
- Class → Template
- Object → Real-world entity

---

## 🔄 Constructor

### 📌 Definition
A constructor is a special method used to initialize objects.

### 💡 Key Points
- Same name as class
- No return type
- Automatically called on object creation

---

## 🔐 Access Modifiers in OOP

Used to control visibility:

- `private` → within class only
- `default` → within package
- `protected` → package + subclass
- `public` → everywhere

---

## 🧠 Important OOP Principles

### ✔ DRY (Don't Repeat Yourself)
Avoid code duplication

### ✔ Modularity
Divide program into smaller parts

### ✔ Reusability
Reuse existing code using inheritance

### ✔ Maintainability
Easy to modify and extend

---

## 🔁 Method Overloading vs Overriding

| Feature | Overloading | Overriding |
|--------|------------|-----------|
| Time | Compile-time | Runtime |
| Parameters | Different | Same |
| Inheritance Required | No | Yes |

---

## 📌 Advantages of OOP

- Better code organization
- Reusability
- Scalability
- Security (data hiding)
- Easy debugging and maintenance

---

## ⚠️ Limitations of OOP

- Increased complexity for small programs
- Requires more planning
- Slight performance overhead

---

## 🎯 Real-World Analogy

Think of a **Car**:
- Class → Car blueprint
- Object → Specific car (e.g., Tesla)
- Encapsulation → Engine hidden inside
- Abstraction → You drive without knowing engine details
- Inheritance → ElectricCar extends Car
- Polymorphism → Same drive method behaves differently

---

## 📌 Summary

OOP in Java helps:
- Structure programs efficiently
- Improve code reuse and readability
- Build scalable and maintainable systems

Mastering these concepts is essential for:
- Interviews
- Real-world application development
- System design

---