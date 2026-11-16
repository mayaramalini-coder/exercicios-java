package nivel3;

import java.util.Scanner;

public class Exercicio009 {

	public static boolean ehPrimo(int numero) {
		
		if (numero <= 1) {
			return false;
		}
		
		for (int i = 2; i * i <= numero; i++) {
			if (numero % i == 0) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int resposta = teclado.nextInt();
		
		if (ehPrimo(resposta)) {
			System.out.println(resposta + " é primo!");
			
		} else {
			System.out.println(resposta + " não é primo!");
		}
	}
}
