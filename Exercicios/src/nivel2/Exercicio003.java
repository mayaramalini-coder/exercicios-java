package nivel2;

public class Exercicio003 {
	public static void main(String[] args) {
		
		int[] numeros = {5, 8, 10, 65, 14, 21, 17};
		
		int soma = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			soma += numeros[i];
		}
		
		double media = soma / numeros.length;
		
		System.out.println("Média: " + media);
	}
}

