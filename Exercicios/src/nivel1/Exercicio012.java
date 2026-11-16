package nivel1;

import java.util.Scanner;


public class Exercicio012 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int valor = teclado.nextInt();
		
		long fatorial = 1;
		
		for (int i = 1; i <= valor; i++) {
			fatorial *= i;
		}
		
		System.out.println("O fatorial de " + valor + " é " + fatorial);
	
		teclado.close();
			
		
	}
}
