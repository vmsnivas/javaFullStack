// Find perfect number
// Proper divisors of 6 are 1, 2, and 3.
// Sum of these divisors: 1 + 2 + 3 = 6.

import java.util.Scanner;

class Perfect{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int myNum = scanner.nextInt();
        int sum = 0;

        for(int num = 1; num < myNum; num++){
            if(myNum % num == 0) sum += num;
        }
        if(sum == myNum) System.out.println(myNum + " is a prime number");
        else System.out.println(myNum + " is not a prime number");
    }
}