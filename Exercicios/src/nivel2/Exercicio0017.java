package nivel2;

import java.util.Scanner;

public class Exercicio0017 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um número binário: ");
		String binarioAtual = teclado.next();
		
		String[] valoresBinario = binarioAtual.split("");
		
		int somaTotal = 0;
		
		int indice = 0;
		
		for (int i = valoresBinario.length - 1; i >= 0; i--) {
			int valorAtual = Integer.parseInt(valoresBinario[i]);
			somaTotal += valorAtual * Math.pow(2, indice);
			indice++;
		}
		
		System.out.println(somaTotal);
		teclado.close();
	}
	
}
