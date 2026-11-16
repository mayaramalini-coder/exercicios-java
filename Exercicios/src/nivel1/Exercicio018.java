package nivel1;

import java.util.Scanner;

public class Exercicio018 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Digite um número para calcular a potência: ");
		double base = teclado.nextDouble();
		
		System.out.println("Digite o expoente: ");
		double expoente = teclado.nextDouble();
		
		double valorFinal = 1;
		
		
		for (int i = 1; i <= expoente; i++ ) {
			valorFinal *= base;
		}
		
		
		System.out.println(valorFinal);
		
		teclado.close();
		
		
		
	}
}
