import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter First number");
        double a;
        a = sc.nextDouble();

        System.out.println("Please enter Second number");
        double b;
        b = sc.nextDouble();

        System.out.println("Multiplication of a & b is : " + (a*b));
    }
}