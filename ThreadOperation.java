public class ThreadOperation extends Thread {

    // All of these are private and final because once the thread is 
    // constructed, it should not modify anything and just simply perform
    // its designated calculation. We first create the matrix space for A, B,
    // and C and also the values for the start and end of rows and columns.
	private final int[][] MatrixA;
	private final int[][] MatrixB;
	private final int[][] MatrixC;
    
	private final int rowStart;
    private final int rowEnd;
	private final int columnStart;
    private final int columnEnd;
    
    // This is the constructor for ThreadOperation that will use the above
    // parameters. These parameters are necessary so that we can start and
    // stop while working with matrices.
    
    public ThreadOperation(int[][] MatrixA, int[][] MatrixB, int[][] MatrixC, 
        int rowStart, int columnStart, int rowEnd, int columnEnd)
    {
        this.MatrixA = MatrixA;
        this.MatrixB = MatrixB;
        this.MatrixC = MatrixC;
        this.rowStart = rowStart;
        this.columnStart = columnStart;
        this.rowEnd = rowEnd;
        this.columnEnd = columnEnd;
    } // End of the CONSTRUCTOR
	
    
    // This loops through the provided Matrix and for each [row][column], adds
    // them between A and B to store in C.
    @Override
    public void run()
    {
        for (int row = rowStart; row < rowEnd; row++) {
            for (int column = columnStart; column < columnEnd; column++) {
                MatrixC[row][column] = MatrixA[row][column] 
                + MatrixB[row][column];
            } // End of nested FOR LOOP for column
        } // End of FOR LOOP for row
    } // End of the run() METHOD
    
} // End of CLASS ThreadOperation