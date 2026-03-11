import java.util.Scanner;

class ParamsCalculator{
    double add(double a, double b){
        return a + b;
    }

    double subtract(double a, double b){
        return a - b;
    }

    double multiply(double a, double b){
        return a * b;
    }

    double division(double a, double b){
        return a / b;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ParamsCalculator pc = new ParamsCalculator();
        
        System.out.println("-----Calculator-----");
        while(true){
            System.out.println("********************");
            System.out.println(".  Choose Option   .");
            System.out.println("********************");
            System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Exit");
            int choice = scanner.nextInt();

            if(choice == 1){
                System.out.println("Enter first number");
                double num1 = scanner.nextDouble();
                System.out.println("Enter second number");
                double num2 = scanner.nextDouble();
                System.out.println("Sum : " + pc.add(num1, num2));
            }
            else if(choice == 2){
                System.out.println("Enter first number");
                double num1 = scanner.nextDouble();
                System.out.println("Enter second number");
                double num2 = scanner.nextDouble();
                System.out.println("Difference : " + pc.subtract(num1, num2));
            }
            else if(choice == 3){
                System.out.println("Enter first number");
                double num1 = scanner.nextDouble();
                System.out.println("Enter second number");
                double num2 = scanner.nextDouble();
                System.out.println("Product : " + pc.multiply(num1, num2));
            }
            else if(choice == 4){
                System.out.println("Enter first number");
                double num1 = scanner.nextDouble();
                System.out.println("Enter second number");
                double num2 = scanner.nextDouble();
                System.out.println("Quotient : " + pc.division(num1, num2));
            }
            else if(choice == 5){
                System.out.println("Thank you.");
                break;
            }
            else{
                System.out.println("!!! Wrong Input !!!");
            }
        }
    }
}