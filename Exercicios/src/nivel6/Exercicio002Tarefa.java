package nivel6;

import nivel6.Exercicio002Anotacao.MinhaAnotacao;

public class Exercicio002Tarefa {

	@MinhaAnotacao(descricao = "Procesar dados do sistema", prioridade = 10)
	public void executarImportante() {
		System.out.println(">> Executando tarefa importante...");
	}
	
	public void executarComum() {
		System.out.println(">> Executando tarefa comum...");
	}
}
