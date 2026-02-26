import java.util.Scanner;

class Person{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Print enter your age");
        int age = sc.nextInt();

        System.out.println("Please enter your name");
        sc.nextLine();
        String name = sc.nextLine();

        System.out.println("My name is " + name + ". My age is " + age);
    }
}