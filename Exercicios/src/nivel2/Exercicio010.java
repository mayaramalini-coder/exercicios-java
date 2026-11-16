package nivel2;

import java.util.Arrays;

public class Exercicio010 {
	public static void main(String[] args) {
		
		int[][] matrizA = {
				{1, 3},
				{3, 2}
		};
		
		int[][] matrizB = {
				{5, 4},
				{0, 1}
		};
		
		int[][] resultado = new int[2][2];
		
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA.length; j++) {
				for (int k = 0; k < matrizA.length; k++) {
					// System.out.println(matrizA[i][j] * matrizB[i][j] + " ");
					
					resultado[i][j] = matrizA[i][j] * matrizB[i][j];
					
				}
			}
		}
		
		System.out.println(Arrays.deepToString(resultado));
	}
}
