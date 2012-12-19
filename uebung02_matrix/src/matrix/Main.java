package matrix;

public class Main {

	
	/**
	/ es muessen 3 parameter ueber die commandline mitgegeben werden:
	/ @param 1 spalte matrix eins
	/ @param 2 zeile matrix eins und spalte matrix zwei
	/ @param 3 zeilen matrix zwei
	*/
	
	static MatrixTools mTools = new MatrixTools();
	public static void main(String[] args) {

		int m = Integer.parseInt(args[0]);//Spalte 1
		int n = Integer.parseInt(args[1]);//Zeile 1 und Spalte 2
		int o = Integer.parseInt(args[2]);//Zeile 2
		
		int matrix1 [][] = mTools.createMatrix(m, n);
		int matrix2 [][] = mTools.createMatrix(n,o);
		mTools.printMatrix(matrix1);
		mTools.printMatrix(matrix2);
		
		mTools.printMatrix(mTools.matrixMul(matrix1, matrix2));

	}

}
