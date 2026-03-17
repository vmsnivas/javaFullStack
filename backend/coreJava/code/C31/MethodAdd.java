// Develop a program with a method that takes two integers as parameters and returns their sum. Call this method from the main method and display the result.
import java.util.Scanner;

class MethodAdd{

    void add(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        int result = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + result);

        scanner.close();
    }

    public static void main(String[] args) {
        MethodAdd m = new MethodAdd();
        m.add();
    }
}