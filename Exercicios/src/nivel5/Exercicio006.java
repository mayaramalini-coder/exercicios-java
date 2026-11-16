package nivel5;

import java.util.Scanner;

public class Exercicio006 {
	
	private Exercicio004No raiz;
	
	public Exercicio006() {
		this.raiz = null;
	}
	
	public Exercicio004No getRaiz() {
		return this.raiz;
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
	
	public boolean buscarInt(Exercicio004No raizArvore, int valor) {
		Exercicio004No atual = raizArvore;
		
		while (atual != null) {
			if (valor == atual.valor) {
				return true;
			}
			
			if (valor < atual.valor) {
				atual = atual.esquerda;
				
			} else {
				atual = atual.direita;
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Exercicio006 arvore = new Exercicio006();
		
		arvore.inserir(20);
		arvore.inserir(40);
		arvore.inserir(30);
		arvore.inserir(10);
		
		System.out.println("Digite o número que deseja buscar: ");
		int numProcurado = teclado.nextInt();
		
		boolean encontrado = arvore.buscarInt(arvore.getRaiz(), numProcurado);
		
		if (encontrado) {
			System.out.println("O número " + numProcurado + " EXISTE na árvore!");
			
		} else {
			System.out.println("O número " + numProcurado + " NÃO exite na árvore!");
		}
		
		teclado.close();
	}
}
