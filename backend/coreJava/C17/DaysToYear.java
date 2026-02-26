// Develop a program to accept Days as input and convert into Years, Months and Days

import java.util.Scanner;

class DaysToYear{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Please input the number of days : ");

        int days = sc.nextInt();
        int years = days / 365;
        int months = days % 365 / 30;
        days = days % 365 % 30;

        System.out.println("It is " + years + " Year(s) " + months + " Month(s) " + days + " Day(s)");

        sc.close();
    }
}