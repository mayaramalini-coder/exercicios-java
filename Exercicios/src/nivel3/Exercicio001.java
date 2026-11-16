package nivel3;

import java.util.Scanner;

public class Exercicio001 {
	
	public static Double soma(Double n1, Double n2) {
		return n1 + n2;
	}
	
	public static Double subtracao(Double n1, Double n2) {
		return n1 - n2;
	}
	
	public static Double multiplicacao(Double n1, Double n2) {
		return n1 * n2;
	}
	
	public static Double divisao(Double n1, Double n2) {
		return n1 / n2;
	}
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o número que você deseja calcular:");
		double numero1 = teclado.nextInt();
		
		System.out.println("Digite o outro número:");
		double numero2 = teclado.nextInt();
		
		System.out.println("Digite a operação que deseja realizar:");
		String operacao = teclado.next();
		
		if (operacao.equals("+")) {
			Double soma = soma(numero1, numero2);
			System.out.println("O resultado é: " + soma);
			
		} else if (operacao.equals("-")) {
			Double subtracao = subtracao(numero1, numero2);
			System.out.println("O resutado é: " + subtracao);
			
		} else if (operacao.equals("*")) {
			Double multiplicacao = multiplicacao(numero1, numero2);
			System.out.println("O resutado é: " + multiplicacao);
			
		} else {
			Double divisao = divisao(numero1, numero2);
			System.out.println("O resultado é: " + divisao);
		}
		
		teclado.close();
	}
}
