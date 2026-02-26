// Develop a program to convert Celcius to Fahranheit
/*

F = (9/5) * C + 32

*/

import java.util.Scanner;

class CelciusToFH{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temparature in Celcius : ");
        double celcius = sc.nextDouble();
        double fahranheit = (1.8 * celcius) + 32;

        System.out.println("It is " + (float) fahranheit + " FH");

        sc.close();
    }
}