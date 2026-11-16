package nivel5;

import java.util.Stack;

public class Exercicio001 {
	public static void main(String[] args) {
		Stack<String> pilha = new Stack<>();
		
		pilha.push("Livro A");
		pilha.push("Livro B");
		pilha.push("Livro C");
		
		System.out.println("Topo: " + pilha.peek());
		
		System.out.println("Removido: " + pilha.pop());
		
		System.out.println("Vazia? " + pilha.isEmpty());
		System.out.println();
		
		System.out.println("Topo atualizado: " + pilha.peek());
		
		System.out.println("Removido: " + pilha.pop());
		
		System.out.println("Vazio? " + pilha.isEmpty());
		System.out.println();
		
		System.out.println("Topo atualizado: " + pilha.peek());
		
		System.out.println("Removido: " + pilha.pop());
		
		System.out.println("Vazio? " + pilha.isEmpty());
		
		
	}
}
 