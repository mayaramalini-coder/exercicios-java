package nivel2;

public class Exercicio011 {
	public static void main(String[] args) {
		
		int somaTotal = 0;
		
		int[][] matrizA = { 
				{1, 0, 0},
				{0, 4, 0},
				{0, 0, 6}
				
		};
		
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA.length; j++) {
				if (matrizA[i][j] == 0) {
					continue;
				}
				
				somaTotal += matrizA[i][j];
			}
		}
		
		System.out.println(somaTotal);
		
		}
}
