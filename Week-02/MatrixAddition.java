// MATRIX ADDITION PROGRAM

import java.util.*;

public class MatrixAddition{
    public static void main(String args[]){

        // creating scanner object
        Scanner scan = new Scanner(System.in);

        System.out.print("Number of Rows: ");
        int rows = scan.nextInt();      // number of rows

         System.out.print("Number of Columns: ");
        int columns = scan.nextInt();      // number of columns

        // Matrix A
        int[][] matrixA = new int[rows][columns]; // declaring matrix A with "rows" rows and "columns" columns

        // Read Matrix A values
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                System.out.format("MatrixA[%d][%d]: ", i, j);
                matrixA[i][j] = scan.nextInt();
            }
        }

        // Print Matrix A values
        System.out.println("\nMatrix A:");
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                System.out.format("%d\t", matrixA[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        //  matrix B
        int[][] matrixB = new int[rows][columns]; // declaring matrix B with "rows" rows and "columns" columns

        // Read Matrix B values
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                System.out.format("MatrixB[%d][%d]: ", i, j);
                matrixB[i][j] = scan.nextInt();
            }
        }

        // Print Matrix B values
        System.out.println("\nMatrix B:");
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                System.out.format("%d\t", matrixB[i][j]);
            }
            System.out.println();
        }

        // Matrix Addition
        int[][] additionMatrix = new int[rows][columns]; // declaring addition Matrix with "rows" rows and "columns" columns


        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                additionMatrix[i][j] = matrixA[i][j] + matrixB[i][j]; // adding corresponding matrix values
            }
            System.out.println();
        }

        // Print additionMatrix values
        System.out.println("\nAddition Matrix: ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                System.out.format("%d\t", additionMatrix[i][j]);
            }
            System.out.println();
        }
        scan.close();

    }
}