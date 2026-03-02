// Develop a program to check whether a number Even or Odd without using modulo operator
import java.util.Scanner;

class EvenOdd{
    public static void main(String[] args){

        // This can be solved using Bitwise operators
        // Binary number of any decimal will end with 0 if it is even 
        // And it will end with 1 if it is an odd number
        // If we use AND(&) operation between 0 and 1 it will return 0 which means even
        // If we use OR(|) operation between 1 and 1 it will return 1 which means odd

        int num = 34;
        int res = num & 1;
        if(res == 0) System.out.println(num + " is an even number");
        else System.out.println(num + " is an odd number");

    }
}