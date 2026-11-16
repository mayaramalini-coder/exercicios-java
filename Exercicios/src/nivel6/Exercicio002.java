package nivel6;

import java.lang.reflect.Method;

import nivel6.Exercicio002Anotacao.MinhaAnotacao;

public class Exercicio002 {
	public static void main(String[] args) throws Exception {
		
		Exercicio002Tarefa tarefa = new Exercicio002Tarefa();
		Class<?> classe = tarefa.getClass();
		
		System.out.println("Inspecionando a classe: " + classe.getSimpleName() + "\n");
		
		for (Method metodo : classe.getDeclaredMethods()) {
			if (metodo.isAnnotationPresent(MinhaAnotacao.class)) {
				MinhaAnotacao anotacao = metodo.getAnnotation(MinhaAnotacao.class);
				
				System.out.println("Método encontrado: " + metodo.getName());
				System.out.println("Descrição: " + anotacao.descricao());
				System.out.println("Prioridade: " + anotacao.prioridade());
				
				metodo.invoke(tarefa);
				System.out.println("----------------------------------------");
			}
		}
		
	}
}

