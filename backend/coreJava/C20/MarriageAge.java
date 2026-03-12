// Develop a prograom to check marriage eligibility. 21 for Male and 18 for Female.

import java.util.Scanner;

class MarriageAge{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Enter your gender like male/female");
        String gender = s.next();

        System.out.println("Enter your age");
        double age = s.nextDouble();

        if(gender.equals("male") && age >= 21) System.out.println("You can get married");
        else if(gender.equals("female") && age >= 18) System.out.println("You can get married");
        else System.out.println("You cannot get married");

        s.close();
    }
}