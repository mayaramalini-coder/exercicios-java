package nivel2;

public class Exercicio007 {
	public static void main(String[] args) {
		
		int[] numeros = {1, 3, 10, 9};
		
		int segundoMaior = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > segundoMaior) {
				segundoMaior = numeros[i + 1];
				
			} 
		}
		
		System.out.println(segundoMaior);
	}
}
