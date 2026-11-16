package nivel2;

import java.util.Scanner;

public class Exercicio020 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int[] quantidadeNotas = new int[8];
		
		int troco = 0;
		
		System.out.println("Qual o valor do produto?");
		int valorProduto = teclado.nextInt();
		
		System.out.println("Qual o valor que você tem na sua conta?");
		int contaBancaria = teclado.nextInt();
		
		troco = contaBancaria - valorProduto;
		
		if (troco / 200 > 0) {
			System.out.println((troco / 200) + " notas de R$200");
		}
		
		if (troco / 100 > 0) {
			System.out.println((troco / 100) + " notas de R$100");
		}
		
		if (troco / 50 > 0) {
			System.out.println((troco / 50) + " notas de R$50");
		}
		
		if (troco / 20 > 0) {
			System.out.println((troco / 20) + " notas de R$20");
		}
		
		if (troco / 10 > 0) {
			System.out.println((troco / 10) + " notas de R$10");
		}
		
		if (troco / 5 > 0) {
			System.out.println((troco / 5) + " notas de R$5");
		}
		
		if (troco / 2 > 0) {
			System.out.println((troco / 2) + " notas de R$2");
		}
		
		if (troco / 1 > 0) {
			System.out.println((troco / 1) + " notas de R$1");
		}
		
		teclado.close();
		
		
	}
}
