package nivel1;

import java.util.Scanner;

public class Exercicio010 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite um numero:");
		int numero = teclado.nextInt();
		System.out.println();
		
		if (numero < 0) {
			System.out.println(numero + ", esse numero é negativo! ");
			
		} else if (numero == 0) {
			System.out.println(numero + ", é igual a zero!");
			
		} else {
			System.out.println(numero + ", esse numero é positivo!");
		}
		
		teclado.close();
	}
}
