import java.util.Scanner;
import java.util.Random;

class BrainTeaser{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int num = r.nextInt(30);
        num = num * 2;

        System.out.println("Think of a number and press enter");
        sc.nextLine();
        System.out.println("Add the same number of your friend and press enter");
        sc.nextLine();
        System.out.println("Add " + num + " from my side and press enter");
        sc.nextLine();
        System.out.println("Divide the sum by 2 and press enter");
        sc.nextLine();
        System.out.println("Return/subtract the number of your friend and press enter");
        sc.nextLine();

        System.out.println((num/2) + " is left now. Woohoo I read your brain!");

        sc.close();
    }
}