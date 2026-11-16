package nivel1;

import java.util.Scanner;

public class Exercicio013 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		
		int valor = teclado.nextInt();
		
		long soma = 0;
		
		for (int i = 0; i <= valor; i++) {
			soma += i;
		}
		
		System.out.println(soma);
		
		
		teclado.close();
		
	}
}
