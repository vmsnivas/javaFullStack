import java.util.Scanner;
import java.util.Random;

class NumberPredict{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("****************************************");
        System.out.println("This is a number prediction game.\nYou will get 3 chances to predict the number.");

        int num = random.nextInt(100);
        int count = 1;

        System.out.print("Press enter to start the game");
        scanner.nextLine();

        int start = 0;
        int end = 100;
        int maxChances = 5;

        while(count <= maxChances){
            System.out.println("****************************************");
            System.out.println("Chances left: " + (maxChances + 1 - count));
            System.out.println("Hint: The number is between " + start + " and " + end);
            System.out.println("Enter the number");
            int userNum = scanner.nextInt();

            if(num == userNum){
                System.out.println("Wow you are a genius!!!");
                break;
            }
            else{
                System.out.println("Wrong prediction!");
                if((userNum >= start) && (userNum < num)) start = userNum;
                else end = userNum;
            }

            count++;

            if(count == (maxChances + 1)) System.out.println("Game over! The number was: " + num);
        }

        scanner.close();
    }
}