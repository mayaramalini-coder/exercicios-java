package nivel4;

import java.util.ArrayList;
import java.util.List;

public class Exercicio019Agenda {

	private List<Exercicio019Contato> contatos = new ArrayList<>();

	public void adicionarContato(Exercicio019Contato c) {
		contatos.add(c);
		System.out.println("Contato adicionado com sucesso!");
	}

	public void listarContatos() {

		if (contatos.isEmpty()) {
			System.out.println("A agenda está vazia!");

		} else {
			System.out.println("--- LISTA DE CONTATOS ---");
			for (Exercicio019Contato c : contatos) {
				System.out.println(c);
			}
		}
	}

	public void buscarContato(String nomeBusca) {
		if (contatos.isEmpty()) {
			System.out.println("A agenda está vazia!");

		} else {
			boolean encontrado = false;
			int i = 0;

			while (i < contatos.size()) {
				Exercicio019Contato c = contatos.get(i);

				if (c.getNome().equalsIgnoreCase(nomeBusca)) {
					System.out.println("Contato encontrado: " + c);
					encontrado = true;
				}

				i++;
			}

			if (encontrado == false) {
				System.out.println("O contato '" + nomeBusca + "' não foi encontrado.");

			}
		}
	}

	public void removerContato(String nomeRemover) {
		if (contatos.isEmpty()) {
			System.out.println("A agenda está vazia! Não há o que remover.");

		} else {
			boolean removido = false;
			int i = 0;

			while (i < contatos.size()) {
				Exercicio019Contato c = contatos.get(i);

				if (c.getNome().equalsIgnoreCase(nomeRemover)) {
					contatos.remove(i);
					System.out.println("Contato '" + nomeRemover + "' removido com sucesso!");
					removido = true;
					
					continue;
				}

				i++;

				}
			
		if (removido == false) {
			System.out.println("Nenhum contato com o nome '" + nomeRemover + "' foi encontrado."); 
			
		}
		}
	}
}
