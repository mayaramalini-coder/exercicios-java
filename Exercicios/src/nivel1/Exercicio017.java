package nivel1;

import java.util.Scanner;

public class Exercicio017 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String nome = "anna";
		String nome2 = "";
		
		for (int i = nome.length() - 1; i >= 0; i--) {
			nome2 += nome.charAt(i);
		}
		
		System.out.println(nome2);
		
		teclado.close();
	}
}
