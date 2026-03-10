import java.util.Scanner;

class MethodReturnType{

    int add(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        int result = num1 + num2;
        return result;
    }

    public static void main(String[] args) {
        MethodReturnType m = new MethodReturnType();
        int sum = m.add();
        System.out.println("The sum is: " + sum);
        System.out.println("The sum is: " + m.add());
    }
}