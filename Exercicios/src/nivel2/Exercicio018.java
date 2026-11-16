package nivel2;

public class Exercicio018 {
	public static void main(String[] args) {
		
		
		int[][] matriz = new int[2][2];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				
				if (i == j) {
					matriz[i][j] = 1;
				} else {
					matriz[i][j] = 0; 
					}
			}
		}
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.println(matriz[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
