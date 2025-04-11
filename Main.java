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
            
            // Always close the scanner
            scanner.close();
        } catch (Exception e) {
            
        }
    }
} // End of Main class