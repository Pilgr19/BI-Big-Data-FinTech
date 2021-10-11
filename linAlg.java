import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class linAlg {
    public static void main(String[] args) throws IOException {
        FileInputStream fileByteStream = new FileInputStream("C:\\Users\\HP\\IdeaProjects\\Lab 3\\src\\matrixInput.txt");
        Scanner scan = new Scanner(fileByteStream);
        Scanner scnr = new Scanner(System.in);
        int m, n; //m x n matrix (numRows x numColumns)
        int i = 0, j = 0;
        System.out.print("Enter the m  x  n for the matrices: ");
        m = scnr.nextInt();
        n = scnr.nextInt();
//declares, initializes, and populates (double for loop) the first array        
        int[][] A = new int[m][n];
        for (i = 0; i < A.length; i++) {
            for (j = 0; j < A[i].length; j++) {
                A[i][j] = scan.nextInt();
            }
        }
//process space between the vectors of martrices A and B        
        scan.nextLine();
//declares, initializes, and populates the second array        
        int[][] B = new int[m][n];
        for (i = 0; i < B.length; i++) {
            for (j = 0; j < B[i].length; j++) {
                B[i][j] = scan.nextInt();
            }
        }
//declares, initializes, populates a third "sum" array        
        int[][] sumArray = new int[m][n];
        System.out.println("Sum of the matrices:");
        for (i = 0; i < sumArray.length; i++) {
            for (j = 0; j < sumArray[i].length; j++) {
                sumArray[i][j] = A[i][j] + B[i][j];
//combines the two arrays through addition and uses a nested for loop to store the new values in the "sum" array
                System.out.print(sumArray[i][j] + " ");
            }
            System.out.print("\n");
        }
        
        int[][] productArray = new int[m][n];
        System.out.println("Product of the matrices:");
        for (i = 0; i < productArray.length; i++) {
            for (j = 0; j < productArray[i].length; j++) {
                productArray[i][j] = A[i][j] * B[i][j];
                System.out.print(productArray[i][j] + " ");
            }
            System.out.print("\n");
        }
        
        fileByteStream.close();
    }
}
