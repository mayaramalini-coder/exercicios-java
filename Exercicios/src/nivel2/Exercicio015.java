package nivel2;

import java.util.Scanner;

public class Exercicio015 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		char[] alfabeto = new char[26];
		
		int[] contagem = new int[26];
		
		for (int i = 0; i < 26; i++) {
			alfabeto[i] = (char) ('a' + i);
		}
		
		System.out.println("Digite uma palvra:");
		String palavra = teclado.next();
		
		for (int i = 0; i < palavra.length(); i++) {
			
			char caractere = palavra.charAt(i);
			
			contagem[caractere - 'a']++;
			
		}
		
		for (int i = 0; i < contagem.length; i++) {
			
			if (contagem[i] == 0) {
				continue;
			}
			
			char letra = (char) (i + 'a');
			
			System.out.println("Letra: " + letra + ": " + contagem[i]);
			
		}
		
		teclado.close();
		
	}
}
