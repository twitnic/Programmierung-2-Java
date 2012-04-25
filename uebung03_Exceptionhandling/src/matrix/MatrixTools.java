package matrix;

public class MatrixTools {
	
	public static int[][] createMatrix(int m, int n)
	{
		int matrix[][]=new int [m][n];
		for (int i=0; i<m; i++){
			for (int j=0; j<n; j++){
				matrix[i][j]=(int) (Math.random()*10);
			}
		}
		return matrix;
	}
	
	public static void printMatrix(int matrix[][]) {
		if (matrix==null) System.out.println("keine Matrix");
		else
		{
			int m = matrix.length;
			int n = matrix[0].length;
			
			for(int i=0; i<m; i++) {
				for(int j=0; j<n; j++)
				{
					System.out.print(matrix[i][j]+" ");
					System.out.printf("\n");
				}
				System.out.printf("\n");
			}
		}
	}

	public static int[][] matrixMul(int a[][], int b[][]) {

		int R[][] = null;

		R = new int[a.length][b[0].length];
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<b[0].length; j++) {
				for(int k=0; k<a[0].length; k++) {
					R[i][j]+=a[i][k]*b[k][j];
				}
			}
		}

		return R;
	}
}
