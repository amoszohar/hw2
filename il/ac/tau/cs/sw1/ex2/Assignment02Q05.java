package il.ac.tau.cs.sw1.ex2;
import java.util.Arrays;

public class Assignment02Q05 {

	public static void main(String[] args) {
		// do not change this part below
		int N = Integer.parseInt(args[0]);
		int[][] matrix = new int[N][N]; // the input matrix to be
		for(int i=0;i < N; i++){
			for(int j=0; j < N; j++){
				matrix[i][j] = Integer.parseInt(args[1+(i*N)+j]); // the value at [i][j] is the i*N+j item in args (without considering args[0])
			}
		}
		for(int i=0;i < N; i++)
			System.out.println(Arrays.toString(matrix[i]));
		System.out.println("");
		int[][] rotatedMatrix; // the rotated matrix
		
		// your code goes here below
		int row=0;
		int col=0;
		int numOfSteps = 0;
		for(int i=0;i<N;i++) {
			while(numOfSteps<N) {
				int propagated = matrix[row][col];
				int nextRow = N-1-col;
				int nextCol = row;
				matrix[row][col]=matrix[nextRow][nextCol];
				row = nextRow;
				col = nextCol;
				numOfSteps++;
			}
			numOfSteps = 0;
			if(++col>=N) {
				row++;
				col=0;
			}
		}
		rotatedMatrix = matrix;
		// do not change this part below
		for(int i=0;i < N; i++){ 
			System.out.println(Arrays.toString(rotatedMatrix[i])); // this would compile after you would put value in transposedMatrix
		}
	}
}
