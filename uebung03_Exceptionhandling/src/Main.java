import matrix.DimException;
import matrix.emphInvalidMatrixException;
import matrix.MatrixTools;
import matrix.MyDimension;

public class Main {

	/*es muessen 3 parameter ueber die commandline mitgegeben werden:
	/ 1 spalte matrix eins
	/ 2 zeile matrix eins und spalte matrix zwei
	/ 3 zeilen matrix zwei*/
	
	public static void main(String[] args)
	{

		int m = Integer.parseInt(args[0]);//Spalte 1
		int n = Integer.parseInt(args[1]);//Zeile 1 und Spalte 2
		int o = Integer.parseInt(args[2]);//Zeile 2
		
		int matrix1 [][] = MatrixTools.createMatrix(m, n);
		int matrix2 [][] = MatrixTools.createMatrix(n, o);
		MatrixTools.printMatrix(matrix1);
		MatrixTools.printMatrix(matrix2);
		
		MatrixTools.printMatrix(MatrixTools.matrixMul(matrix1, matrix2));
		
		//System.out.println(MyDimension.MyDimension(5, 4));

	}

}
