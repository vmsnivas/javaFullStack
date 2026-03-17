# 01 - Input (Scanner)

## Overview
`java.util.Scanner` is the standard Java utility for reading user input from the console (`System.in`). It can parse tokens into primitive types and strings, which makes it ideal for simple interactive programs and learning exercises.

## Why it matters
Most command-line programs need to accept user input. `Scanner` lets you build menus, read numbers, and handle text input with minimal boilerplate.

## Core Concepts
### Creating a Scanner
```java
Scanner sc = new Scanner(System.in);
```

### Common methods
- `nextInt()` — reads the next token as an integer
- `nextDouble()` — reads the next token as a double
- `next()` — reads the next token as a string (whitespace-delimited)
- `nextLine()` — reads the remainder of the current line (including spaces)

### Closing the scanner
Always close the scanner when done to release the underlying input stream:
```java
sc.close();
```

## How it works
`Scanner` uses whitespace as a delimiter by default. Each token separated by spaces/tabs/newlines is returned by `next()` (or parsed by typed methods like `nextInt()`).

## Common Gotchas
- **Newline handling**: `nextInt()` and `nextDouble()` leave the newline character in the stream, so a following `nextLine()` may return an empty string. Fix: call `sc.nextLine()` after `nextInt()` to consume the remaining newline.
- **Exceptions**: If the next token cannot be parsed to the requested type (e.g., user enters `hello` and you call `nextInt()`), `InputMismatchException` is thrown.
- **Thread safety**: `Scanner` is not thread-safe. Use separate scanners in each thread or synchronize access.

## Example (interactive input)
```java
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Hello " + name + ", age " + age);

        sc.close();
    }
}
```

## Example files
- [code/C16-Input/Main.java](../code/C16-Input/Main.java) (reads two doubles and multiplies them)
