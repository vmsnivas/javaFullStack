import java.util.Scanner;

class Person2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your name");
        String name = sc.next();

        System.out.println("Print enter your age");
        int age = sc.nextInt();

        System.out.println("My name is " + name + ". My age is " + age + ".");

        sc.close();
    }
}