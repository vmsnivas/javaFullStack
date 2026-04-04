# Java Packages and Modifiers – Complete Notes

## 📦 Packages in Java

### What is a Package?
A package in Java is a namespace that groups related classes and interfaces together. It helps organize code and avoid naming conflicts.

### Types of Packages
1. **Built-in Packages**
   - Provided by Java
   - Example: `java.util`, `java.lang`, `java.io`

2. **User-defined Packages**
   - Created by developers

### Creating a Package
- Use the `package` keyword at the top of a file
- Must be the first statement

### Example Concept
- A package groups similar functionality
- Like folders in a file system

### Benefits of Packages
- Avoids class name conflicts
- Provides access control
- Improves code organization
- Helps reuse code

### Accessing Packages
- Using `import` keyword
- Using fully qualified name

---

## 🔐 Modifiers in Java

Modifiers define access level and behavior of classes, variables, methods, and constructors.

---

## 1. Access Modifiers

### Types of Access Modifiers

| Modifier | Same Class | Same Package | Subclass | Other Package |
|----------|------------|-------------|----------|---------------|
| private  | Yes        | No          | No       | No            |
| default  | Yes        | Yes         | No       | No            |
| protected| Yes        | Yes         | Yes      | No*           |
| public   | Yes        | Yes         | Yes      | Yes           |

\* Protected allows access in other packages only through inheritance.

---

### private
- Accessible only within the same class
- Used for encapsulation

### default (no modifier)
- Accessible within the same package

### protected
- Accessible within package and subclasses

### public
- Accessible everywhere

---

## 2. Non-Access Modifiers

### static
- Belongs to class, not object
- Shared across all instances

### final
- Variable → cannot be changed
- Method → cannot be overridden
- Class → cannot be inherited

### abstract
- Method → no body
- Class → cannot be instantiated

### synchronized
- Used for thread safety

### volatile
- Ensures visibility of changes across threads

### transient
- Skips variable during serialization

### native
- Used to call code written in other languages (like C)

---

## 🧠 Key Concepts

- Packages help organize code logically
- Access modifiers control visibility
- Non-access modifiers control behavior
- Proper use improves maintainability and security

---

## 📌 Summary

- Use packages to structure large applications
- Use access modifiers for encapsulation
- Use non-access modifiers for behavior control

These concepts are fundamental for writing clean, maintainable, and scalable Java applications.
