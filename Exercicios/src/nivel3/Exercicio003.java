package nivel3;

import java.util.Scanner;

public class Exercicio003 {

	public static int calcularFatorial(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		
		return n * calcularFatorial(n - 1);
	}
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero = teclado.nextInt();
		
		int resultado = calcularFatorial(numero);
		
		System.out.println("O fatorial de " + numero + " é " + resultado);
	}
	
}
