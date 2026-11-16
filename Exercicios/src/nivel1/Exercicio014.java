package nivel1;

import java.util.Scanner;

public class Exercicio014 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero = teclado.nextInt();
		
		boolean ehPrimo = true;
		
		if (numero <= 1) {
			ehPrimo = false;
			
		} else if (numero == 2) {
			ehPrimo = true;
			
		} else if (numero % 2 == 0) {
			ehPrimo = false;
			
		} else {
			for (int i = 3; i <= Math.sqrt(numero); i += 2) {
				if (numero % i == 0) {
					ehPrimo = false;
					break;
				}
			}
		}
		
		if (ehPrimo) {
			System.out.println(numero + " é um número primo!");
			
		} else {
			System.out.println(numero + " não é um número primo!");
		}
		
		teclado.close();
			
	}
}
