package nivel4;

import java.util.Scanner;

public class Exercicio007 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("--- Teste 1: Criando produto válido ---");
		System.out.println();
		
		Exercicio007Produto produto = new Exercicio007Produto("notebook", 3500.000, 10);
		
		System.out.println("Produto criado: " + produto.getNome() + " | R$ " + produto.getValor() + " | Qnt: " + produto.getQuantidade()); 
		System.out.println();
		
		System.out.println("--- Teste 2: Criando produtos inválidos ---");
		System.out.println();
		
		Exercicio007Produto produto2 = new Exercicio007Produto("", -50.0, 10);
		
		System.out.println("Produto criado: " + produto2.getNome() + " | R$ " + produto2.getValor() + " | Qnt: " + produto2.getQuantidade());
		System.out.println();
		
		System.out.println("--- Teste 3: Tentando alterar para valor válido depois de criar ---");
		System.out.println();
		
		produto.setValor(-5.0);
		System.out.println("Preço final do produto: R$ " + produto.getValor());
	}
	
	
}
