package nivel2;

public class Exercicio019 {
	public static void main(String[] args) {
		
		int[][] matriz = {
				{1, 2, 3},
				{5, 2, 0},
				{1, 3, 2}
		};
		
		int linhas = matriz.length;
		int colunas = matriz[0].length;
		boolean ehSimetrica = true;
		
		if (linhas != colunas) {
			ehSimetrica = false;
			
		} else {
			for (int i = 0; i < linhas; i++) {
				for (int j = 0; j < colunas; i++) {
					
					if (matriz[i][j] != matriz[j][i]) {
						ehSimetrica = false;
						break;
					}
				}
				
				if (!ehSimetrica) {
					break;
				}
			}
		}
		
		if (ehSimetrica) {
			System.out.println("A matriz é simétrica!");
		} else {
			System.out.println("A matriz não é simétrica!");
		}
	}
}
