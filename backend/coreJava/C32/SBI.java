import java.util.Scanner;
import java.util.Random;

class SBI{

    static double balance = 0;

    static double deposit(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount to deposit: ");
        double amount = scanner.nextDouble();
        balance += amount;
        return balance;
    }

    static String withdraw(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount to withdraw: ");
        double amount = scanner.nextDouble();
        if(amount <= balance){
            balance -= amount;
            return "Your account has been debited with Rs. " + amount + ". Your current balance is: " + balance;
        } else {
            return "Insufficient funds.";
        }
    }

    static double check(){
        return balance;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Enter your gender (M/F): ");
        String gender = scanner.next();
        System.out.println("Enter your Aadhar number: ");
        long aadhar = scanner.nextLong();
        System.out.println("Enter your PAN number: ");
        String pan = scanner.next();
        int accNo = 100000 + random.nextInt(899999);
        System.out.println("Congratulations " + name + "! Your account with SBI has been created successfully.");
        System.out.println("Your account number is: " + accNo);
        System.out.println("Press enter to continue...");
        scanner.nextLine();

        while(true){
            System.out.println("\n-----------------------------------");
            System.out.println("Welcome to SBI, " + name + "!");
            System.out.println("-----------------------------------");
            System.out.println("Please select an option:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if(choice == 1){
                System.out.println("Your new balance is: " + deposit());
            } else if(choice == 2){
                System.out.println(withdraw());
            } else if(choice == 3){
                System.out.println("Your current balance is: " + check());
            } else if(choice == 4){
                System.out.println("Thank you for banking with SBI. Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}