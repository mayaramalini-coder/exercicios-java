package nivel4;

import java.util.Scanner;

public class Exercicio014 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		Exercicio014Biblioteca biblioteca = new Exercicio014Biblioteca();

		String opcaoDigitada = " ";

		System.out.println("---- BIBLIOTECA ----");
		System.out.println();

		while (!opcaoDigitada.equals("5")) {
			System.out.println("Escolha a opção que deseja: ");

			System.out.println("1 " + "-" + " Adicionar livro");
			System.out.println("2 " + "-" + " Pesquisar livros");
			System.out.println("3 " + "-" + " Deletar livros");
			System.out.println("4 " + "-" + " Verificar livros");
			System.out.println("5 " + "-" + " Sair");
			opcaoDigitada = teclado.next();

			if (opcaoDigitada.equals("1")) {
				System.out.println("Digite o nome do livro que deseja adicionar:");
				String nome = teclado.next();

				System.out.println("Qual o autor desse livro:");
				String autor = teclado.next();

				System.out.println("Qual o genero do livro:");
				String genero = teclado.next();

				System.out.println("Qual a quantidade de paginas que o livro tem:");
				String paginas = teclado.next();

				System.out.println("Digite o valor do livro:");
				String valor = teclado.next();

				Exercicio014Livro livro = new Exercicio014Livro(nome, autor, paginas, genero, valor);
				biblioteca.adicionar(livro);

				System.out.println("Livro: " + livro.getTitulo() + " adicionado com sucesso!");
				System.out.println();

			} else if (opcaoDigitada.equals("2")) {
				System.out.println("Escreva o nome do livro que deseja pesquisar:");
				String livroPesquisado = teclado.next();

				Exercicio014Livro livro = biblioteca.getProdutoPorNome(livroPesquisado);

				if (livro != null) {
					
					StringBuilder sb = new StringBuilder();
					
					sb
					.append("Nome: ")
					.append(livro.getTitulo() + "\n")
					.append("Autor: ")
					.append(livro.getAutor() + "\n")
					.append("Gênero: ")
					.append(livro.getGenero() + "\n")
					.append("Páginas: ")
					.append(livro.getQntPaginas() + "\n")
					.append("Valor: R$")
					.append(livro.getValor() + "\n");
					
					System.out.println(sb.toString());
				} else {
					System.out.println("Livro não encontrado.");
					System.out.println();
				}

			} else if (opcaoDigitada.equals("3")) {
				System.out.println("Digite o nome do livro que deseja deletar:");
				String livroDeletado = teclado.next();
				
				biblioteca.deletar(livroDeletado);
				System.out.println(" Livro deletado");
				System.out.println();
				
			} else if (opcaoDigitada.equals("4")) {
				System.out.println("--- LIVROS NA BIBLIOTECA ---");
				System.out.println();
				
				biblioteca.verificar();
				System.out.println();
				
			} else if (opcaoDigitada.equals("5")) {
				System.out.println("Saindo...");
				System.out.println();
				
			} else {
				System.out.println("Opção inválida!");
				System.out.println();
			}

		}
		teclado.close();
}

}
