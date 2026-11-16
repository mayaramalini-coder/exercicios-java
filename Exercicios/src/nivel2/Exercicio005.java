package nivel2;

public class Exercicio005 {
	public static void main(String[] args) {
		
		
		int[] numeros = {8, 5, 3 ,4 ,1};
		
		int auxiliar = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros.length -1; j++ ) {
				
				if (numeros[j] > numeros[j + 1]) {
				    auxiliar = numeros[j];
					numeros[j] = numeros[j + 1];
					numeros[j + 1] = auxiliar;
				}
			}
		}
		
		for (int resultado : numeros) {
			System.out.println(resultado);
		}
		
		
		
	}
}
