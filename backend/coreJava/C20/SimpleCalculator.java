// Develope a program to build a simple calculator

import java.util.Scanner;

class SimpleCalculator{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter first number : ");
        double num1 = s.nextDouble();

        System.out.print("Enter the operator (+|-|*|/|%) : ");
        char ch = s.next().charAt(0);

        System.out.print("Enter the second number : ");
        double num2 = s.nextDouble();

        if(ch == '+') System.out.println(num1 + num2);
        else if(ch == '-') System.out.println(num1 - num2);
        else if(ch == '*') System.out.println(num1 * num2);
        else if(ch == '/') System.out.println(num1 / num2);
        else if(ch == '%') System.out.println(num1 % num2);
        else System.out.println("Unsupported operation!");

        s.close();
    }
}