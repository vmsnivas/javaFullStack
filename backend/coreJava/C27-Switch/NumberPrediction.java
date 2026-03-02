import java.util.Scanner;
import java.util.Random;

class NumberPrediction{
    public static void main(String[] args){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int num = random.nextInt(100);

        System.out.println("Guess a number between 0 and 100");
        int userNum = scanner.nextInt();

        if(num == userNum) System.out.println("Wow, you are a genius...");
        else System.out.println("Wrong prediction. Try next time! \nThe number was : " + num);
    }
}