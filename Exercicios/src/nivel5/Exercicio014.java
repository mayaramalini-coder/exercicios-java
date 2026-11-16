package nivel5;

import java.util.ArrayDeque;
import java.util.Deque;

public class Exercicio014 {

	public static boolean estaBalanceada(String expressao) {
		Deque<Character> pilha = new ArrayDeque<>();
		
		for (char c : expressao.toCharArray()) {
			if (c == '(') {
				pilha.push(c);
			}
			
			else if (c == ')') {
				if (pilha.isEmpty()) {
					return false;
				}
				pilha.pop();
			}
		}
		return pilha.isEmpty();
	}
	public static void main(String[] args) {
		String teste1 = "(a + b) * (c - d)";
		String teste2 = "((a + b)";
		
		System.out.println(teste1 + " -> " + estaBalanceada(teste1));
		System.out.println(teste2 + " -> " + estaBalanceada(teste2));
				
	}
}
