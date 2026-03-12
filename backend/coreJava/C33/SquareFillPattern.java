// Develop a program to print Square Fill Pattern.

import java.util.Scanner;

class SquareFillPattern {

    void printSquare() {
        Scanner scanner = new Scanner(System.in);
        int rows = 10, cols = 10;

        scanner.close();
        
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= cols; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        SquareFillPattern square = new SquareFillPattern();
        square.printSquare();
    }
}