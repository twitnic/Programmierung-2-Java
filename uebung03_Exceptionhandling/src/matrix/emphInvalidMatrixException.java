package matrix;

public class emphInvalidMatrixException extends Exception {

	public static Integer getMasse(int f[]) throws Exception {
		int summe = 0;
		for (int g:f){
			summe += g;
			if(g<0) throw new Exception("El.==0");

		}
		if (summe==0) throw new Exception("Kein Brot da!");
		return new Integer(summe);
	}

}
