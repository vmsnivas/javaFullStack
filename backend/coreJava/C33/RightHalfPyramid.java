// Develop a program to print Right Half Pyramid.

import java.util.Scanner;

class RightHalfPyramid {

    void rightPyramid() {
        Scanner scanner = new Scanner(System.in);
        int rows = 10;

        scanner.close();
        
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        RightHalfPyramid rp = new RightHalfPyramid();
        rp.rightPyramid();
    }
}