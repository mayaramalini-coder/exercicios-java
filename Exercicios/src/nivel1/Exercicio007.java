package nivel1;

import java.util.Scanner;

public class Exercicio007 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite um numero:");
		int numero1 = teclado.nextInt();
		System.out.println("");
		
		System.out.print("Digite outro numero:");
		int numero2 = teclado.nextInt();
		System.out.println();
		
		if (numero1 > numero2) {
			System.out.println(numero1 + " é maior que " + numero2);
		} else {
			System.out.println(numero1 + " é menor que " + numero2);
		}
		
		teclado.close();
		
	}
}
