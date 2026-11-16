package nivel5;

import java.util.Scanner;

public class Exercicio004 {

	public Exercicio004No raiz;
	
	public Exercicio004() {
		this.raiz = null;
	}
	
	public void inserir(int valor) {
		raiz = inserirRecursivo(raiz, valor);
	}
	
	private Exercicio004No inserirRecursivo(Exercicio004No atual, int valor){
		if (atual == null) {
			return new Exercicio004No(valor);
		}
		
		if (valor < atual.valor) {
			atual.esquerda = inserirRecursivo(atual.esquerda, valor);
			
		} else if (valor > atual.valor) {
			atual.direita =  inserirRecursivo(atual.direita, valor);
		}
		
		return atual;
	}
	
	public void emOrdem() {
		if (raiz == null) {
			System.out.println("A árvore está vazia. ");
			return;
		}
		ordemRecursivo(raiz);
		System.out.println();
	}
	
	private void ordemRecursivo(Exercicio004No no) {
		if (no != null) {
			ordemRecursivo(no.esquerda);
			System.out.println(no.valor + " ");
			ordemRecursivo(no.direita);
		}
	}
	
	public boolean buscar(int valor) {
		return buscarRecursivo(raiz, valor);
	}
	
	private boolean buscarRecursivo(Exercicio004No atual, int valor) {
		if (atual == null) {
			return false;
		}
		
		if (valor == atual.valor) {
			return true;
		}
		return valor < atual.valor
				? buscarRecursivo(atual.esquerda, valor)
				: buscarRecursivo(atual.direita, valor);	
	}
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Exercicio004 arvore = new Exercicio004();
		int opcao = -1;
		
		while (opcao != 0) {
		System.out.println("--- MENU ÁRVORE BINÁRIA ---");
		System.err.println();
		
		System.out.println("1. Inserir número");
		System.out.println("2. Buscar número");
		System.out.println("3. Mostrar elementos em ordem");
		System.out.println("0. Sair");
		System.out.println("Escolha uma opção:");
		opcao = teclado.nextInt();
		
		if (opcao == 1) {
			System.out.println("Digite o número para inserir: ");
			int numeroInserir = teclado.nextInt();
			arvore.inserir(numeroInserir);
			System.out.println("Número " + numeroInserir + " inserido com sucesso!");
			
		} else if (opcao == 2) {
			System.out.println("Digite o número para buscar:");
			int numBuscar = teclado.nextInt();
			if (arvore.buscar(numBuscar)) {
			System.out.println("O número " + numBuscar + " EXISTE no árvore.");
		 }else {
			System.out.println("O número " + numBuscar + " NÃO existe na árvore!");
		}
		
		} else if (opcao == 3) {
			System.out.println("Elementos atuais da árvore:");
			arvore.emOrdem();
			
		} else if (opcao == 0) {
			System.out.println("Saindo do programa...");
			
		} else {
			System.out.println("Opção inválida! Tente novamente.");
		}
	}
		teclado.close();
	}
}

