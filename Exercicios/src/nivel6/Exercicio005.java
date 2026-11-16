package nivel6;

import java.util.List;

import nivel6.Exercicio005Entidade.Usuario;

public class Exercicio005 {
	public static void main(String[] args) throws Exception {

		Exercicio005Motor orm = new Exercicio005Motor();
		

		orm.salvar(new Usuario(1, "João"));
		orm.salvar(new Usuario(2, "Maya"));
		
		List<Usuario> lista = orm.listarTodos(Usuario.class);
		for (Usuario u : lista) {
			System.out.println(u.id + "-" + u.nome);
		}
	}
}
