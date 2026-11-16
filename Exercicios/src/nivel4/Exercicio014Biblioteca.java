package nivel4;

import java.util.ArrayList;
import java.util.List;

public class Exercicio014Biblioteca {
	private List<Exercicio014Livro> livros = new ArrayList<>();
	
	public void adicionar (Exercicio014Livro livro) {
		livros.add(livro);
		
	}
	
	public Exercicio014Livro getLivro(int id) {
		return livros.get(id);
	}
	
	public Exercicio014Livro getProdutoPorNome(String titulo) {
		for (Exercicio014Livro l : livros) {
			if (l.getTitulo().toLowerCase().equals(titulo.toLowerCase())) {
				return l;
			}
		}
		
		return null;
	}
	
	public void deletar(String autor) {
		Exercicio014Livro livro = getProdutoPorNome(autor);
		if (livro != null) {
			livros.remove(livro);
			System.out.println(livro.getTitulo() + "removido com sucesso!");
			System.out.println();
			
		} else {
			System.out.println("Livro não encontrado para deletar.");
			System.out.println();
		}
	}
	
	public void verificar() {
		if (livros.isEmpty()) {
			System.out.println("O estoque está vazio.");
			System.out.println();
		}
		
		StringBuilder sb = new StringBuilder();
		
		for (Exercicio014Livro livro : this.livros) {
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
			.append(livro.getValor() + "\n\n");
		}
		
		System.out.println(sb.toString());
	}
}
