// Develop a program to reverse a number
// Num: 205
// Output: 502
import java.util.Scanner;

class NumberReverse{
    public static void main(String[] args){
        //Scanner scanner = new Scanner(System.in);

        int num = 205;
        int rev = 0;

        while(num > 0){
            rev = (rev * 10) + (num % 10);
            num /= 10; 
        }
        System.out.println("Reverse of 205 is : " + rev);
    }
}