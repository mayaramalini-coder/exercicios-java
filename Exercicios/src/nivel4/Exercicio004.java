package nivel4;

import java.util.Scanner;

public class Exercicio004 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Exercicio001Pessoa cliente = new Exercicio001Pessoa("Mayara Malini", 17, "08/07/2009", 159, "castanho", "cacheado");
		Exercicio004Corrente cc = new Exercicio004Corrente(cliente, "04324959242", 1000.0, 181427, 500.0);
		
		Double valorSacado = 0.0;
		Double valorDeposito = 0.0;
		
		System.out.println("-----TESTE CONTA CORRENTE----");
		System.out.println();
		
		System.out.println("Saldo inicial Conta Corrente R$ " + cc.getValor());
		
		System.out.println("Qual valor deseja sacar?");
	    valorSacado = teclado.nextDouble();
		
		cc.sacar(valorSacado);
		
		if (valorSacado <= cc.getValor()) {
			System.out.println("Saldo final Conta Corrente R$ " + cc.getValor());
			System.out.println();
		} else {
			System.out.println("Saldo após saque de R$ " + valorSacado + " (usando limite): R$ " + cc.getValor());
			System.out.println();
		}
		
		System.out.println("----TESTANDO POUPANÇA-----");
		System.out.println();
		
		Exercicio004Poupanca cp = new Exercicio004Poupanca(cliente, "04324959242", 2000.0, 2, 0.005);
		
		System.out.println("Saldo inicial Conta Poupança R$ " + cp.getValor());
		System.out.println();
		
		System.out.println("Qual valor deseja depositar? ");
		valorDeposito = teclado.nextDouble();
		
		cp.depositar(valorDeposito);
		
		
		System.out.println("Saldo após deposito de R$ " + valorDeposito + " é R$: "+ cp.getValor());
		System.out.println();
		
		cp.aplicarRendimento();
		System.out.println("Saldo final Conta Poupança R$ " + cp.getValor());
	
		teclado.close();
	}
	
}
