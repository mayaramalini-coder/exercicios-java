package nivel6;

import nivel6.Exercicio005Anotacao.Coluna;
import nivel6.Exercicio005Anotacao.Tabela;

public class Exercicio005Entidade {

	@Tabela(nome = "usuarios")
	public static class Usuario {
		
		@Coluna(nome = "id", pk = true)
		public Integer id;
		
		@Coluna(nome = "nome_completo")
		public String nome;
		
		public Usuario() {}
		
		public Usuario(Integer id, String nome) {
			this.id = id;
			this.nome = nome;
		}
	}
}
