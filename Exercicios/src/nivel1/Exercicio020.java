package nivel1;

import java.util.Scanner;

public class Exercicio020 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o número que você deseja calcular: ");
		double numero = teclado.nextDouble();
		
		System.out.println("Digite o número que você deseja calcular: ");
		double numero2 = teclado.nextDouble();
		
		System.out.println("Digite a operação que você deseja usar: ");
		String operacao = teclado.next();
		
		if (operacao.equals("+")) {
			double valorSoma = numero + numero2;
			System.out.println("Resultado: " + valorSoma);
			
		} else if (operacao.equals("-")) {
			double valorSubtracao = numero - numero2;
			System.out.println("Resultado: " + valorSubtracao);
			
		} else if (operacao.equals("*")) {
			double valorMultiplicacao = numero * numero2;
			System.out.println("Resultado: " + valorMultiplicacao);
			
		} else {
			double valorDivisao = numero / numero2;
			System.out.println("Resultado: " + valorDivisao);
			
		}
		
		teclado.close();
	}
}
