package collection;
public class Matrix {
	  public static void main(String[] args) {
	        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
	        int[][] matrix2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};

	        int rows = matrix1.length;
	        int columns = matrix1[0].length;

	        int[][] sumMatrix = new int[rows][columns];
	        double[][] averageMatrix = new double[rows][columns];

	        // Calculating the sum and average of the matrices
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
	                averageMatrix[i][j] = (double) sumMatrix[i][j] / 2;
	            }
	        }

	        // Displaying the sum matrix
	        System.out.println("Sum Matrix:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                System.out.print(sumMatrix[i][j] + " ");
	            }
	            System.out.println();
	        }

	        // Displaying the average matrix
	        System.out.println("Average Matrix:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                System.out.print(averageMatrix[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
	}


