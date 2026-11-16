package nivel2;

public class Exercicio009 {
	public static void main(String[] args) {
		
		int[] numeros = {1, 2, 3 ,4, 5};
		int rotacionar = 0;
		
		
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros.length - 1; j++) {
				
				if (numeros[j] < numeros[j + 1]) {
					rotacionar = numeros[j];
					numeros[j] = numeros[j + 1];
					numeros[j + 1] = rotacionar;
				}
				
				
				
			}
		}
		
		for (int resultado : numeros) {
			System.out.println(resultado);
		}
	}
}
