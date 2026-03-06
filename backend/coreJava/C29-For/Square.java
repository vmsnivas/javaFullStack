import java.util.Scanner;

class Square{
    public static void square(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();
        System.out.println("Square : " + (num * num));
    }

    public static void main(String[] args){
        square();
        System.out.println("I am a Java Architect!");
    }
}