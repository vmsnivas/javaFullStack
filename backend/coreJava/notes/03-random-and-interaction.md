# 03 - Random Numbers & Interactive Prompts

## Overview
This concept covers generating pseudo-random values and combining them with user interaction to build simple console games and interactive programs.

## Why it matters
Randomness is important for games, simulations, testing, and more. Knowing how Java generates pseudo-random values helps you avoid predictable behavior and choose appropriate APIs for the job.

## Key Concepts
- `java.util.Random` generates pseudo-random numbers using a seed.
  - `new Random()` uses a time-based seed by default.
  - `nextInt(bound)` returns an int in the range `[0, bound)`.
- `Math.random()` is an alternative that returns a `double` between `0.0` and `1.0`.
- Use `Scanner` to read input and pause execution (e.g., prompting the user to press Enter).

## Common Pitfalls
- `Random` is not cryptographically secure; do not use it for security-sensitive OTPs in real applications.
- Using `nextInt(0)` throws `IllegalArgumentException`.
- When generating a fixed-length number (like a 6-digit OTP), ensure the range covers the required digits (e.g., `100000 + nextInt(900000)`).
- Re-seeding `Random` too frequently (e.g., `new Random()` in a fast loop) can reduce randomness.

## How it works
`Random` uses a linear congruential generator (LCG) algorithm. It generates a deterministic sequence of values based on an initial seed, so the same seed produces the same sequence.

## Example snippet (random trivia game)
```java
Random r = new Random();
int num = r.nextInt(30); // 0..29
num = num * 2;

System.out.println("Think of a number and press enter");
scanner.nextLine();
// ... (game steps) ...
System.out.println((num/2) + " is left now. Woohoo I read your brain!");
```

## Example files
- [code/C18/BrainTeaser.java](../code/C18/BrainTeaser.java) (interactive number game with random value)
- [code/C18/CelciusToFH.java](../code/C18/CelciusToFH.java) (temperature conversion alongside user input)
