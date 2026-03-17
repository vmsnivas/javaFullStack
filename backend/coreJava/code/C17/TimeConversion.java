// Develop a program to take seconds from user and convert them into Hours, Minutes and Seconds

import java.util.Scanner;

class TimeConversion{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Please enter seconds : ");
        int seconds = sc.nextInt();
        int minutes;
        int hours;

        hours = seconds / 3600;
        minutes = seconds % 3600 / 60;
        seconds = seconds % 3600 % 60;

        System.out.println("Total time is : " + hours + " Hour(s) " + minutes + " Minute(s) " + seconds + " Second(s)");

        sc.close();
    }
}