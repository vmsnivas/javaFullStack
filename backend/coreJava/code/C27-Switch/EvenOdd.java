import java.util.Scanner;

class EvenOdd{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = scanner.nextInt();

        String result = (num % 2 == 0) ? "even number" : "odd number";

        System.out.println(num + " is an " + result);

        scanner.close();
    }
}