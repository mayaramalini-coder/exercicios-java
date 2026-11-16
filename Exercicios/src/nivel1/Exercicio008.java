package nivel1;

import java.util.Scanner;

public class Exercicio008 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite um numero:");
		int numero1 = teclado.nextInt();
		System.out.println();
		
		System.out.print("Digite outro numero:");
		int numero2 = teclado.nextInt();
		System.out.println();
		
		System.out.print("Digite o ultimo numero:");
		int numero3 = teclado.nextInt();
		System.out.println();
		
		if (numero1 > numero2) {
			System.out.println(numero1 + " é maior que " + numero2);
		
		} else if (numero2 > numero3) {
			System.out.println(numero2 + " é maior que " + numero3);
		
		} else if (numero1 < numero2) {
			System.out.println(numero1 + " é menor que " + numero2);
		
		} else if (numero2 < numero3) {
			System.out.println(numero2 + " é menor que " + numero3);
		
		} else if (numero3 < numero1) {
			System.out.println(numero3 + " é menor que " + numero1);
			
		} else {
			System.out.println(numero3 + " é maior que " + numero1);
		}
		
		teclado.close();
	}
}
