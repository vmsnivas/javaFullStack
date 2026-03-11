import java.util.Scanner;

class Even {

    boolean isEven() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        if(num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Even even = new Even();
        System.out.println("Is the number even? " + even.isEven());
    }
}