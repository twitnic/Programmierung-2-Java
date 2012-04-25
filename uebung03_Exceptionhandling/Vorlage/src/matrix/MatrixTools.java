package matrix;


public class MatrixTools {

    public static int[][] createMatrix(int m, int n){
        int[][] matrix=new int[m][n];
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                matrix[i][j]=(int) (Math.random()*10);
            }
        }

        return matrix;
    }

    public static void printMatrix(int[][] m){
        for (int i = 0; i < m.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j]+" ");
            }
            System.out.println("|");
        }
    }

    public static int[][] matrixMul(int[][] a, int[][] b) {
    	
        int[][] c=new int[a.length][b[0].length];
        for(int k=0;k<a.length;k++){
            
            for(int i=0;i<b[0].length;i++){
                c[k][i]=0;
                for(int j=0;j<b.length;j++){
                    c[k][i]+=a[k][j]*b[j][i];
                }
            }
        }

        return c;
    }

}





