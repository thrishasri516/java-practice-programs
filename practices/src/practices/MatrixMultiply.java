package practices;

public class MatrixMultiply {

	public static void main(String[] args) {
		 int[][] firstMatrix = { {3, -2, 5}, {3, 0, 4} };
	        int[][] secondMatrix = { {2, 3}, {-9, 0}, {0, 4} };
	        
	        // r1=2, c1=3 | r2=3, c2=2
	        int r1 = firstMatrix.length;
	        int c1 = firstMatrix[0].length;
	        int c2 = secondMatrix[0].length;
	        
	        int[][] product = new int[r1][c2];

	        // Core multiplication logic
	        for(int i = 0; i < r1; i++) {
	            for (int j = 0; j < c2; j++) {
	                for (int k = 0; k < c1; k++) {
	                    product[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
	                }
	            }
	        }

	        // Displaying result
	        for(int[] row : product) {
	            for (int column : row) {
	                System.out.print(column + "    ");
	            }
	            System.out.println();
	        }
	    

	}

}
