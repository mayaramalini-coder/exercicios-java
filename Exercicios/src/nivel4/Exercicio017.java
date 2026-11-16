package nivel4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio017 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int idade = 0;
		boolean entradaValida = false;
		
		while (!entradaValida) {
			try {
				System.out.println("Digite a sua idade: ");
				idade = teclado.nextInt();
				
				entradaValida = true;
				
			} catch (InputMismatchException e) {
				
				System.out.println("Erro: Entrada inválida. Digite apenas números inteiros!");
				teclado.nextLine();
			}
		}
		
		System.out.println("Idade cadastrada com sucesso: " + idade);
		teclado.close();
	}
}
