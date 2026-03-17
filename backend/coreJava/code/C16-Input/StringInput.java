import java.util.Scanner;

class StringInput{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a STRING(word)");
        String a = sc.next(); // next() will only accept one word as the input.

        System.out.println("You have entered : " + a);

        System.out.println("Please enter a LINE");
        String b = sc.nextLine(); // nextLine() accepts whole string or a line.

        System.out.println("You have entered : " + b);

        System.out.println("Please enter a LINE");
        String c = sc.nextLine(); // nextLine() accepts whole string or a line.

        System.out.println("You have entered : " + c);

        System.out.println("Please enter a Character");
        char d = sc.next().charAt(0); // char() accepts a single character only.

        System.out.println("You have entered : " + d);

        sc.close();
    }
}