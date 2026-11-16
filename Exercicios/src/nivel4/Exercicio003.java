package nivel4;

import java.util.Scanner;

public class Exercicio003 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Exercicio001Pessoa pessoa = new Exercicio001Pessoa("Mayara Malini", 17, "08/07/2009", 159, "Castanho", "Cacheado");
		Exercicio003TransacaoBancaria conta = new Exercicio003TransacaoBancaria(pessoa, "04324959242", 100000.00000, 181427);
		
		
		System.out.println("Escolha uma opção: ");
		System.out.println("1-" + "Depósito");
		System.out.println("2-" + "Saque");
		String opcaoDigitada = teclado.next();
		
		String cpfDeposito = "";
		String cpfSaque = "";
		Double valorSacado = 0.0;
		Double valorDeposito = 0.0;
		
		if (opcaoDigitada.equals("1")) {
			System.out.println("Digite o cpf para qual deseja realizar o depósito:");
			cpfDeposito = teclado.next();
		} else {
			 System.out.println("Digite o cpf para qual deseja realizar o saque: ");
			 cpfSaque = teclado.next();
		}
		
		if (cpfSaque.equals(conta.getCpf())) {
			System.out.println("Conta encontrada!");
			System.out.println();
			
		} else if (cpfDeposito.equals(conta.getCpf())) {
			System.out.println("Conta encontrada!"); 
			System.out.println();
			
		} else {
			System.out.println("CPF invalido.");
			teclado.close();
			
			return;
		} 
			
		if (opcaoDigitada.equals("1")) {
			System.out.println("Qual valor deseja depositar?");
			valorDeposito  = teclado.nextDouble();
			
			conta.depositar(valorDeposito);
			
		} else {
			System.out.println("Você tem " + String.format("%.2f", conta.getValor()) + ". qual valor deseja sacar?");
			valorSacado = teclado.nextDouble();
			
			conta.sacar(valorSacado);
			
			if (valorSacado <= conta.getValor()) {
				System.out.println("Valor para sacar: " + valorSacado);
				
			} else {
				System.out.println("Saldo excedido!");

				teclado.close();
				
				return;
			}
		
		}
	
		System.out.println("Agora informe o seu id:");
		Integer idDigitado = teclado.nextInt();
		
		if (idDigitado.equals(conta.getId())) {
			System.out.println("Aguarde um momento...");
			System.out.println();
		} else {
			System.out.println("ID incorreto.");
			teclado.close();
			
			return;
		}
		
		if (opcaoDigitada.equals("1")) {
			System.out.println("Depósito realizado com sucesso!");
			System.out.println();
			System.out.println("Nome: " + pessoa.getNome());
			System.out.println("CPF: " + conta.getCpf());
			System.out.println("ID: " + conta.getId());
			System.out.println("Valor: " + String.format("%.2f", conta.getValor()));
		} else {
			System.out.println("Saque realizado com sucesso!");
			System.out.println();
			System.out.println("Nome: " + pessoa.getNome());
			System.out.println("CPF: " + conta.getCpf());
			System.out.println("ID: " + conta.getId());
			System.out.println("Valor: " + String.format("%.2f", conta.getValor()));
		}
		
		teclado.close();

	}
}
