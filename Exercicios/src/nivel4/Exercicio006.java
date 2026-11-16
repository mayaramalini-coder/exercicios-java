package nivel4;

import java.util.Scanner;

public class Exercicio006 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Exercicio006Estoque estoque = new Exercicio006Estoque();
		
		String opcaoDigitada = " ";
		
	   while (!opcaoDigitada.equals("5")) {
		   System.out.println("Escolha a opção que deseja: ");
			
			System.out.println("1 " + "-" + " Adicionar produtos");
			System.out.println("2 " + "-" + " Pesquisar produtos");	 
			System.out.println("3 " + "-" + " Deletar produtos");	 
			System.out.println("4 " + "-" + " Verificar produtos");	 
			System.out.println("5 " + "-" + " Sair");	
			opcaoDigitada = teclado.next();
			
			if (opcaoDigitada.equals("1")) {
				System.out.println("Digite o produto que deseja adicionar: ");
				String nome = teclado.next();
				System.out.println("Digite o preço do produto:");
				Double valor = teclado.nextDouble();
				
				Exercicio006Produtos produto = new Exercicio006Produtos(nome, valor);
			
				estoque.adicionar(produto);
				System.out.println(produto.getNome() + " adicionado com sucesso!");
				System.out.println();
				
			} else if (opcaoDigitada.equals("2")) {
				System.out.println("Escreva o nome do produto que deseja pesquisar:");
				String produtoPesquisado = teclado.next();
				
				Exercicio006Produtos produto = estoque.getProdutoPorNome(produtoPesquisado);
				
				if (produto != null) {
					System.out.println("Produto encontrado: " + produto.getNome() + " - R$ " + produto.getValor());
					System.out.println();
					
				} else {
					System.out.println("Produto não encontrado!");
					System.out.println();
				}
			} else if (opcaoDigitada.equals("3")) {
				System.out.println("Digite o nome do produto que deseja deletar:");
				String nomeDeletado = teclado.next();
				estoque.deletar(nomeDeletado);
				System.out.println();
				
			} else if (opcaoDigitada.equals("4")) {
				System.out.println("---- Produtos no estoque ----");
				estoque.verificar();
				System.out.println();
				
			} else if (opcaoDigitada.equals("5")) {
				System.out.println("Saindo...");
			} else {
				System.out.println("Opção invalida!");
				System.out.println();
			}
			
	   }
		
	teclado.close();
}
}
