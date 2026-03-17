# 10 - `while` Loop Game Logic

## Overview
This note demonstrates building a simple interactive game using a `while` loop. The loop maintains game state and provides feedback until the user wins or runs out of chances.

## Why it matters
Games and interactive command-line tools rely on looping state management. Learning how to maintain and update game state is a great way to practice control flow.

## Key Concepts
- Use a `while` loop to allow repeated guesses.
- Track state variables (e.g., `count`, `start`, `end`) to provide hints and stop after a maximum number of attempts.
- Use `break` to exit the loop early when the user guesses correctly.

## Common Pitfalls
- Forgetting to update the loop counter can cause an infinite loop.
- Always close the `Scanner` at the end of the game to avoid resource leaks.

## How it works
The `while` loop checks the condition before each iteration. Track game state using variables (e.g., `count`, `isCorrect`) and update them to ensure the loop eventually terminates when a win/loss condition is met.

## Example snippet (game loop)
```java
int maxChances = 5;
int count = 1;

while (count <= maxChances) {
    // ... read user input ...
    if (num == userNum) {
        System.out.println("Wow you are a genius!!!");
        break;
    }
    count++;
    if (count == maxChances + 1) {
        System.out.println("Game over! The number was: " + num);
    }
}
```

## Example files
- [code/C28-While/NumberPredict.java](../code/C28-While/NumberPredict.java) (number guessing game using `while`)
