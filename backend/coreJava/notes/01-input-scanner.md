# 01 - Input (Scanner)

## Overview
`Scanner` is the standard way in Java to read user input from the console (`System.in`). It can parse primitives, strings, and tokens, making it easy to build interactive command-line programs.

## Key Concepts
- Import `java.util.Scanner`.
- Create a `Scanner` instance: `Scanner sc = new Scanner(System.in);`.
- Common methods:
  - `nextInt()` – reads an `int` token.
  - `nextDouble()` – reads a `double` token.
  - `nextLine()` – reads the rest of the current line (including spaces).
  - `next()` – reads the next token (delimited by whitespace).
- Always call `sc.close()` when done, to release underlying resources.

## Common Gotchas
- Mixing `nextInt()`/`nextDouble()` and `nextLine()` can cause input to be skipped (because `nextInt()` leaves the newline in the buffer). Use an extra `sc.nextLine()` to consume the newline when switching from token-based reads to line-based reads.
- `Scanner` is not thread-safe. Avoid sharing a single `Scanner` across threads.

## Example
```java
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter First number");
        double a = sc.nextDouble();

        System.out.println("Please enter Second number");
        double b = sc.nextDouble();

        System.out.println("Multiplication of a & b is : " + (a * b));

        sc.close();
    }
}
```

## Example files
- [code/C16-Input/Main.java](../code/C16-Input/Main.java) (reads two doubles and multiplies them)
