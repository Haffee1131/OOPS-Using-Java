//  MATRIX MULTIPLICATION PROGRAM

import java.util.*;

public class MatrixMultiplication {
    public static void main(String args[]) {

        // creating scanner object
        Scanner scan = new Scanner(System.in);

        // Matrix A
        System.out.println("Matrix A");

        System.out.print("Number of rows: ");
        int ar = scan.nextInt(); // number of rows

        System.out.print("Number of columns: ");
        int ac = scan.nextInt(); // number of columns

        int[][] matrixA = new int[ar][ac]; // declaring matrix A with "ar" rows and "ac" columns

        // Read Matrix A values
        for (int i = 0; i < ar; i++) {
            for (int j = 0; j < ac; j++) {
                System.out.format("MatrixA[%d][%d]: ", i, j);
                matrixA[i][j] = scan.nextInt();
            }
        }

        // Print Matrix A values
        System.out.println("\nMatrix A:");
        for (int i = 0; i < ar; i++) {
            for (int j = 0; j < ac; j++) {
                System.out.format("%d\t", matrixA[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        // Matrix B
        System.out.println("Matrix B");

        System.out.print("Number of rows: ");
        int br = scan.nextInt(); // number of rows

        System.out.print("Number of columns: ");
        int bc = scan.nextInt(); // number of columns

        if (ac != br) {
            System.out.println("Cannot Perform Matrix Multiplication");
            System.exit(0);
        }

        int[][] matrixB = new int[br][bc]; // declaring matrix B with "br" rows and "bc" columns

        // Read Matrix B values
        for (int i = 0; i < br; i++) {
            for (int j = 0; j < bc; j++) {
                System.out.format("MatrixB[%d][%d]: ", i, j);
                matrixB[i][j] = scan.nextInt();
            }
        }

        // Print Matrix B values
        System.out.println("\nMatrix B:");
        for (int i = 0; i < br; i++) {
            for (int j = 0; j < bc; j++) {
                System.out.format("%d\t", matrixB[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        // matrix multiplication

        int[][] productMatrix = new int[ar][bc]; // declaring product matrix with "ar" rows and "bc" columns

        for (int i = 0; i < ar; i++) {
            for (int j = 0; j < bc; j++) {
                productMatrix[i][j] = 0;
                for (int k = 0; k < ac; k++) {
                    productMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        // Print product Matrix values
        System.out.println("\nproduct matrix:");
        for (int i = 0; i < ar; i++) {
            for (int j = 0; j < bc; j++) {
                System.out.format("%d\t", productMatrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        scan.close();
    }
}