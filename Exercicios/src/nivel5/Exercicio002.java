
package nivel5;



import java.util.LinkedList;
import java.util.Queue;

public class Exercicio002 {
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		fila.offer("Mayara");
		fila.offer("André");
		fila.offer("Monique");
		
		System.out.println("Fila atual: " + fila);
		System.out.println();
		
		System.out.println("Próximo da fila: " + fila.peek());
		
		String atendido = fila.poll();
		
		System.out.println("Atendimento finalizado: " + atendido);
		
		System.out.println("Fila após o atendimento: " + fila);
		System.out.println();
		
		System.out.println("Próximo da fila: " + fila.peek());
		
		System.out.println("Atendimento finalizado: " + fila.poll());
		
		System.out.println("Fila apó o atendimento: " + fila);
		System.out.println();
		
		System.out.println("Próximo da fila: " + fila.peek());
		
		System.out.println("Atendimento finalizado: " + fila.poll());
		
		System.out.println("Proximo da fila: " + fila);
		System.out.println();
		System.out.println("A fila está vazia? " + fila.isEmpty());
	}
}
