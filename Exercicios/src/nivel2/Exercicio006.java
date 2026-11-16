package nivel2;

public class Exercicio006 {
	public static void main(String[] args) {
		
		int[] numeros = {3, 10 ,5, 25, 4, 1, 8};
		
		int busca = 4;
		boolean encontrado = false;
		int indice = 0;
		
		
		for (int i = 0; i < numeros.length; i++ ) {
			
			if (numeros[i] == busca) {
				encontrado = true;
				indice = i;
				break;
			}
			
		} 
		
		if (encontrado) {
			System.out.println("O número foi encontrado no indice " + indice);
		} else {
			System.out.println("O número não foi encontrado!");
		}
		
		
	}
}
