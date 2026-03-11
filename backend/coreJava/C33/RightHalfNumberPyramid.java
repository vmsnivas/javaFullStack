// Develop a program to print Right Half Number IncreasingPyramid.

import java.util.Scanner;

class RightHalfNumberPyramid {

    void rightNumberPyramid() {
        Scanner scanner = new Scanner(System.in);
        int rows = 10;
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        RightHalfNumberPyramid rnp = new RightHalfNumberPyramid();
        rnp.rightNumberPyramid();
    }
}