package nivel1;

import java.util.Scanner;

public class Exercicio019 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Digite a quantidade de vezes que você quer que ocorra a sequência Fibinacci!");
		int numero = teclado.nextInt();
		
		int numero1 = 1; 
		int numero2 = 1;
		
		System.out.println("Sequência: ");
		for (int i = 1; i <= numero; i++) {
			
			System.out.println(numero1 + "");
			 
			int numero3 = numero1 + numero2;
			numero1 = numero2;
			numero2 = numero3;
			
		}
		
		teclado.close();
	}
}
