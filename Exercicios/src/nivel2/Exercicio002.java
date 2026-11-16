package nivel2;

public class Exercicio002 {
	public static void main(String[] args) {
		
		int[] numeros = { 1, 21, 35, 14, 89, 17, 20};
		
		for (int i = 0; i < numeros.length; i++) {
			
		}
		
		int maior = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > maior) {
				maior = numeros[i];
			}
		}
		
		System.out.println(maior);
	}
}
