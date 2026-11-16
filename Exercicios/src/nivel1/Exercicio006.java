package nivel1;

import java.util.Scanner;

public class Exercicio006 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite um numero:");
		int valor = teclado.nextInt();
		System.out.println();
		
		if (valor % 2 == 0) {
			System.out.println(valor + " é par!");
		} else {
			System.out.println(valor + " é impar!");
		}
		
		teclado.close();
	}
}
