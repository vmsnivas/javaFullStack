// Develop a program to print Triangular Pyramid.

import java.util.Scanner;

class TriangularPyramid {

    void triangularPyramid() {
        Scanner scanner = new Scanner(System.in);
        int rows = 10;
        int cols = rows * 2 - 1;
        for(int i = 1; i <= rows; i++){
            for(int k = 1; k <= rows - i; k++) System.out.print(" ");
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        TriangularPyramid tp = new TriangularPyramid();
        tp.triangularPyramid();
    }
}