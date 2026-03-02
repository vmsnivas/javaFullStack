// Develop a program to take age from user and tell about their voting eligilibility

import java.util.Scanner;

class VotingAge{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter your age : ");
        double age = s.nextDouble();

        if(age >= 18) System.out.println("You can cast your vote");
        else System.out.println("You cannot cast your vote");
    }
}