# 07 - Random OTP Generation

## Overview
This note covers how to generate a fixed-width numeric one-time password (OTP) using Java's pseudo-random number generators. The example demonstrates a simple approach to create a 6-digit code.

## Key Concepts
- `java.util.Random` generates pseudo-random values. It is not cryptographically secure but is fine for simple practice programs.
- To create a fixed-width number of digits:
  - Determine the smallest value (`min`) and the size of the range.
  - Use `min + random.nextInt(range)`.
  - Example for 6 digits: `100000 + random.nextInt(900000)`.

## Common Pitfalls
- `Random.nextInt(0)` throws `IllegalArgumentException`.
- `nextInt(999999)` yields `0..999998`, so it doesn’t guarantee 6 digits. Always use proper bounds.
- For real-world security, use `java.security.SecureRandom`.

## Example snippet
```java
Random random = new Random();
int otp = 100000 + random.nextInt(900000); // 100000..999999
System.out.println("OTP for account verification is : " + otp);
```

## Example files
- [code/C25/Otp.java](../code/C25/Otp.java) (generate a 6-digit OTP)
