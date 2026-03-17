// Develop a program to print Reverse Right Half Pyramid.

import java.util.Scanner;

class ReverseRightHalfPyramid {

    void reverseRightPyramid() {
        Scanner scanner = new Scanner(System.in);
        int rows = 10;
        for(int i = rows; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        scanner.close();
    }

    public static void main(String[] args) {
        ReverseRightHalfPyramid rrp = new ReverseRightHalfPyramid();
        rrp.reverseRightPyramid();
    }
}