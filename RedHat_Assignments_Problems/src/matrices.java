class matrices {

	// this is a Function to print Matrix
	static void printMatrix(int M[][],
							int rowSize,
							int colSize)
	{  
		for (int i = 0; i < rowSize; i++) {
			for (int j = 0; j < colSize; j++)
				System.out.print(M[i][j] + " ");

			System.out.println();
		}
	}

	// this is Function to multiply
	// two matrices A[][] and B[][]
	static void multiplyMatrix(
		int row1, int col1, int A[][],
		int row2, int col2, int B[][])
	{
		int i, j, k;

		
		if (row2 != col1) {

			System.out.println(
				"\nMultiplication Not Possible");
			return;
		}

		// this is store the matrices result 
		int C[][] = new int[row1][col2];

		// Multiply the two matrices
		for (i = 0; i < row1; i++) {
			for (j = 0; j < col2; j++) {
				for (k = 0; k < row2; k++)
					C[i][j] += A[i][k] * B[k][j];
			}
		}

		//for printing the result
		System.out.println("\nResultant Matrix:");
		printMatrix(C, row1, col2);
	}

	
	public static void main(String[] args)
	{

		int row1 = 4, col1 = 3, row2 = 3, col2 = 4;

		int A[][] = { { 1, 1, 1 },
					{ 2, 2, 2 },
					{ 3, 3, 3 },
					{ 4, 4, 4 } };

		int B[][] = { { 1, 1, 1, 1 },
					{ 2, 2, 2, 2 },
					{ 3, 3, 3, 3 } };

		multiplyMatrix(row1, col1, A,
					row2, col2, B);
	}
}