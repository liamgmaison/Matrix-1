/*
This code is provided to give you a
starting place. It should be modified.
No further imports are needed.
To earn full credit, you must also
answer the following question:

Q1: One of the goals of multi-threading
is to minimize the resource usage, such
as memory and processor cycles. In three
sentences, explain how multi-threaded
code accomplishes this goal. Consider
writing about blocking on I/O, multicore 
machines, how sluggish humans are,
threads compared to processes, etcetera,
and connect these issues to 
multi-threading.

*/
import java.io.IOException;
import java.io.File;
import java.util.Scanner;
import java.io.*;

public class Main
{
    public static void main(String[] args)
    {
        // Recommended add. This checks if the user entered a usable file. If
        // not, the program prints this message and stops. No crash. No hassle.
        if (args.length != 1) {
            System.out.println("You didn't provide a useable file!");
            return;
        } // End of IF conditional
        
        // Main block of the code.
        try {
            // Create a scanner to gather information from the file.
            Scanner scanner = new Scanner(new File(args[0]));
            
            // These are important for storage
            int rows = scanner.nextInt();
            int columns = scanner.nextInt();
            
            // Read in all the matrices and store them
            int[][] MatrixA = matrixFromFile(rows, columns, scanner);
            int[][] MatrixB = matrixFromFile(rows, columns, scanner);
            int[][] MatrixC = matrixFromFile(rows, columns, scanner);
            
            int middleRow = rows / 2;
            int middleColumn = columns / 2;
            

            // Always close the scanner
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("ERROR! File cannot be opened!");
        } // End of TRY-CATCH for input
    } // End of main METHOD
    
    
    // This method is the mechanism by which we take elements from the file and
    // add them to a matrix that can be used in the main program for addition.
    public static int[][] matrixFromFile(int rows, int columns, Scanner scanner)
    {
        // This creates a new matrix that is ready to take in the data.
        int[][] matrix = new int[rows][columns];
        // for this, I opted for using i and j because rows and columns were
        // already used.
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                // For each iteration of i and j and combinations, those
                // elements are stored in matrix.
                matrix[i][j] = scanner.nextInt();
            } // End of nested FOR loop
        } // End of FOR loop
        return matrix;
    } // End of the matrixFromFile METHOD
    
    public static void print2dArray(int[][] matrix)
    {
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; 
                column < matrix[row].length; column++) {
                System.out.println();
            } // End of nested FOR loop
        } // End of FOR loop
    } // End of print2dArray METHOD
    
} // End of Main class