package nivel5;

import java.util.Scanner;

public class Exercicio005 {

	private Exercicio004No raiz;
	
	public Exercicio005() {
		this.raiz = null;
	}
	
	public void inserir(int valor) {
		raiz = inserirRecursivo(raiz, valor);
	}
	
	private Exercicio004No inserirRecursivo(Exercicio004No atual, int valor) {
		if (atual == null) {
			return new Exercicio004No(valor);
		}
		
		if (valor < atual.valor) {
			atual.esquerda = inserirRecursivo(atual.esquerda, valor);
			
		} else if (valor > atual.valor) {
			atual.direita = inserirRecursivo(atual.direita, valor);
		}
		return atual;
	}
	
	public void preOrdem() {
		if (raiz == null) {
			System.out.println("A árvore está vazia.");
			return;
		}
		preOrdemRecursivo(raiz);
		System.out.println();
	}
	
	private void preOrdemRecursivo(Exercicio004No no) {
		if (no != null) {
			System.out.println(no.valor + " ");
			preOrdemRecursivo(no.esquerda);
			preOrdemRecursivo(no.direita);
		}
	}
	
	public void inOrdem() {
		if (raiz == null) {
			System.out.println("A árvore está vazia.");
			return;
		}
		inOrdemRecursivo(raiz);
		System.out.println();
	}
	
	private void inOrdemRecursivo(Exercicio004No no) {
		if (no != null) {
			inOrdemRecursivo(no.esquerda);
			System.out.println(no.valor + " ");
			inOrdemRecursivo(no.direita);
		}
	}
	
	public void posOrdem() {
		if (raiz == null) {
			System.out.println("A árvore está vazia.");
			return;
		}
		posOrdemRecursivo(raiz);
		System.out.println();
	}
	
	private void posOrdemRecursivo(Exercicio004No no) {
		if (no != null) {
			posOrdemRecursivo(no.esquerda);
			posOrdemRecursivo(no.direita);
			System.out.println(no.valor + " ");
		}
	}
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Exercicio005 arvore = new Exercicio005();
		int opcao = -1;
		
		while (opcao != 0) {
			System.out.println("--- PERCURSOS DA ÁRVORE ---");
			System.out.println();
			
			System.out.println("1. Inserir número");
			System.out.println("2. Mostrar PRÉ-ORDEM");
			System.out.println("3. Mostrar IN-ORDEM");
			System.out.println("4. Mostrar PÓS-ORDEM");
			System.out.println("0. Sair");
			System.out.println("Escolha uma opção:");
			opcao = teclado.nextInt();
			
			if (opcao == 1) {
				System.out.println("Digite o número que deseja inserir: ");
				int nI = teclado.nextInt();
				arvore.inserir(nI);
				System.out.println("Número " + nI + " inserido!");
				
			} else if (opcao == 2) {
				System.out.println("Pré-Ordem: ");
				arvore.preOrdem();
				
			} else if (opcao == 3 ) {
				System.out.println("In-Ordem: ");
				arvore.inOrdem();
				
			} else if (opcao == 4) {
				System.out.println("Pós-Ordem: ");
				arvore.posOrdem();
			} else if (opcao == 0) {
				System.out.println("Saindo...");
				
			} else {
				System.out.println("Opção inválida! Tente novamente.");
			}
		}
		teclado.close();
	}
}
