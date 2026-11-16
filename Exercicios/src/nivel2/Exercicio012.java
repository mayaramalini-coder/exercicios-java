package nivel2;

import java.util.Random;
import java.util.Scanner;

public class Exercicio012 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Random random = new Random();
		
		
		System.out.println("Digite o número que você achar que vai aparecer:");
		int numero = teclado.nextInt();
		
		if (numero == random.nextInt(5)) {
			System.out.println("Você ACERTOU!!!!");
		} else {
			System.out.println("Você errou!");
		}
		
		teclado.close();
		
		
	}
}
