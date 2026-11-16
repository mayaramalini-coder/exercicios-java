package nivel4;

import java.util.ArrayList;
import java.util.List;

public class Exercicio008Carrinho {

	private List<Exercicio006Produtos> produtos = new ArrayList<>();
	
	public void adicionar(Exercicio006Produtos produto) {
		produtos.add(produto);
	}
	
	public Exercicio006Produtos getProduto(int id) {
		return produtos.get(id);
	}
	
	public Exercicio006Produtos getProdutoPorNome(String nome) {
		for (Exercicio006Produtos p : produtos) {
			if (p.getNome().equalsIgnoreCase(nome)) {
				return p;
			}
		}
		
		return null;
	}
	
	public void deletar(String nome) {
		Exercicio006Produtos produto = getProdutoPorNome(nome);
		if (produto != null) {
			produtos.remove(nome);
			System.out.println(nome + " removido com sucesso!");
			System.out.println();
		} else {
			System.out.println("Produto não encontrado para deletar");
			System.out.println();
		}
	}
	
	public void verificar() {
		if (produtos.isEmpty()) {
			System.out.println("O estoque está vazio.");
			System.out.println();
		} 
		for (Exercicio006Produtos p : produtos) {
			System.out.println("- " + p.getNome() + " R$: " + p.getValor());
		}
	}
	
	
	
	
}
