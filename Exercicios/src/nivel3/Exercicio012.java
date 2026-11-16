package nivel3;

import java.util.Scanner;

public class Exercicio012 {
	public static String removerEspaco(String frase) {
		
		String novaFrase = frase.replaceAll("  "," ").strip().trim();
		return novaFrase;
		
	}
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite uma frase: ");
		String fraseDigitada = teclado.nextLine();
		
		System.out.println(removerEspaco(fraseDigitada));
		
		teclado.close();
		
	}
}

