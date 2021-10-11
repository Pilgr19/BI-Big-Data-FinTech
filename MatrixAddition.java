/*************************************************************************************************
 * @file MatrixAddition.java
 * @brief This program allows the user to organize and find the sum of two arrays
 * @author Robert Pilgrim
 * @date July 28, 2021
 ************************************************************************************************/
import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int numberRows;
        int numberColumns;
        int i = 0;
        int j = 0;
//declares the building blocks of the two arrays
        System.out.println("Enter the number of rows and columns for the matrices");
        numberRows = scnr.nextInt();
        numberColumns = scnr.nextInt();
//prompts user to input the desired number of rows and columns that will make up the arrays
        int[][] firstMatrix = new int[numberRows][numberColumns];
        System.out.println("Enter the elements of the first matrix:");
//declares and initializes the first array
        for (i = 0; i < firstMatrix.length; i++) {
            for (j = 0; j < firstMatrix[i].length; j++) {
                firstMatrix[i][j] = scnr.nextInt();
            }
        }
//prompts user to input the values to be stored in the first array and uses a nested for loop to parse through them
        int[][] secondMatrix = new int[numberRows][numberColumns];
        System.out.println("Enter the element of the second matrix:");
//declares and initializes the second array
        for (i = 0; i < secondMatrix.length; i++) {
            for (j = 0; j < firstMatrix[i].length; j++) {
                secondMatrix[i][j] = scnr.nextInt();
            }
        }
//prompts user to input the values to be stored in the second array and uses a nested for loop to parse through them
        int[][] sumArray = new int[numberRows][numberColumns];
        System.out.println("Sum of the matrices:");
//declares and initializes a third "sum" array
        for (i = 0; i < sumArray.length; i++) {
            for (j = 0; j < sumArray[i].length; j++) {
                sumArray[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
//combines the two arrays through addition and uses a nested for loop to store the new values in the "sum" array
                System.out.print(sumArray[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}