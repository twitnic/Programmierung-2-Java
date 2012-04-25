import matrix.MatrixTools;


public class Main {

    public static void main(String[] args){
    	
    	

        int[][] a = MatrixTools.createMatrix(2, 1);
        int[][] b = MatrixTools.createMatrix(3, 2);

        System.out.println("Matrix A:");
        MatrixTools.printMatrix(a);

        System.out.println("Matrix B:");
        MatrixTools.printMatrix(b);

        //falsche Dreiecksmatrix erzeugen
        int[][] dreieck=new int[5][0];
        for(int i=0;i<5;i++){
            dreieck[i]=new int[i];
        }
        

        System.out.println("\n\nMultiplikation: ");
        int[][] c = null;
        c = MatrixTools.matrixMul(a, b);
	    MatrixTools.printMatrix(c);

				
    }

}
