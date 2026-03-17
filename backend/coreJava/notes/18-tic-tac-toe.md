# 18 - Tic Tac Toe (Game Loop & Win Detection)

## Overview
This note explains a simple command-line Tic Tac Toe implementation using an array to represent the board, a loop to drive turns, and win/draw detection logic.

## Why it matters
Building small games like Tic Tac Toe helps you combine several core principles (arrays, loops, methods, input validation, and state management) into a single program. It also introduces basic game logic such as win conditions and turn-based flows.

## Key Concepts
- Representing a 3×3 board using a one-dimensional array.
- Tracking game state with flags (`isGameActive`, `clicks`, `player`).
- Looping until the game ends (win or draw).
- Checking win conditions by testing rows, columns, and diagonals.
- Switching players on each valid move.
- Validating user input (range check and empty cell check).

## How it works
The board is stored in a `String[]` of length 9. Each cell is either "" (empty), "O" or "X". The game loops while `isGameActive` is `true`. On each iteration:
1. The board is printed in a 3×3 layout.
2. The user enters a cell number (1–9).
3. The input is validated to ensure it maps to an empty cell.
4. The player's mark is placed, and `clicks` is incremented.
5. Win conditions are checked by comparing the current player's mark against all row/column/diagonal combinations.
6. If a player wins, the game ends; if 9 moves are made without a winner, the game is a draw.

## Common Pitfalls
- **String comparison**: Use `.equals(...)` to compare string values (`player.equals("O")`) rather than `==`, which compares object references.
- **Array indexing**: User inputs are 1–9 but array indices are 0–8. Convert with `num - 1`.
- **Input validation**: Always ensure the chosen cell is within the valid range and unoccupied.
- **Infinite loops**: Ensure the game state (`isGameActive`) is updated when the game ends.

## Example snippet (win check)
```java
if (cells[0].equals(current) && cells[1].equals(current) && cells[2].equals(current)) {
    // player wins across the top row
    isGameActive = false;
}
```

## Example files
- [code/C39/TicTacToe.java](../code/C39/TicTacToe.java) (console Tic Tac Toe game)
