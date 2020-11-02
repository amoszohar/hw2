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
		int propagated;
		for(int row=0;row<(N+1)/2;row++) {
			for(int col=row;col<N-1-row;col++) {
				int oldRow = row;
				int oldCol = col;
				int newRow;
				int newCol;
				propagated = matrix[N-1-col][row];
				for(int k=0;k<4;k++) {
					int temp = matrix[oldRow][oldCol];
					newRow = oldCol;
					newCol = N-1-oldRow;
					matrix[oldRow][oldCol]=propagated;
					propagated= temp;
					oldRow = newRow;
					oldCol = newCol;
				}
			}
		}
		rotatedMatrix = matrix;
		// do not change this part below
		for(int i=0;i < N; i++){ 
			System.out.println(Arrays.toString(rotatedMatrix[i])); // this would compile after you would put value in transposedMatrix
		}
	}
}
