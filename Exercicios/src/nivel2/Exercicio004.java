package nivel2;

public class Exercicio004 {
	public static void main(String[] args) {
		
		int[] numerosPares = {2, 8, 4, 10, 7, 25, 3, 6, 5};
		
		int quantidadeNumeros = 0;
		
		for (int i = 0; i < numerosPares.length; i++) {
			 
			if (numerosPares[i] % 2 == 0) {
				quantidadeNumeros++;
			}
			
		}
		
		System.out.println("Quantidade de numeros pares: " + quantidadeNumeros);
	}
}
