// Develop a program to accept INT from user and print whether it is Even or Odd

import java.util.Scanner;

class EvenOddIf{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Please input a number : ");
        int num = sc.nextInt();

        if(num % 2 == 0) System.out.println(num + " is an even number");
        
        if(num % 2 != 0) System.out.println(num + " is an odd number");

        sc.close();
    }
}