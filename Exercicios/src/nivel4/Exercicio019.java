package nivel4;

import java.util.Scanner;

public class Exercicio019 {
	public static void main(String[] args) {
		
		Exercicio019Agenda agenda = new Exercicio019Agenda();
		Scanner sc = new Scanner(System.in);
		
		String opcao = " ";
		
			System.out.println("--- LISTA DE CONTATOS ---");
			System.out.println();
			
			while (!opcao.equals("5")) {
			System.out.println("1" + "- Adicionar Contato.");
			System.out.println("2" + "- Listar Contatos.");
			System.out.println("3" + "- Buscar Contato.");
			System.out.println("4" + "- Remover Contato.");
			System.out.println("5" + "- Sair.");
			System.out.println();
			
			System.out.println("Escolha uma opção:");
			opcao = sc.next();
			
			
			if (opcao.equals("1")) {
				System.out.println("Nome: ");
				String nome = sc.next();
				
				System.out.println("Email: ");
				String email = sc.next();
				
				System.out.println("Telefone: ");
				String telefone = sc.next();
				System.out.println();
				
				Exercicio019Contato novoContato = new Exercicio019Contato(nome, email, telefone);
				agenda.adicionarContato(novoContato);
				
			} else if (opcao.equals("2")) {
				agenda.listarContatos();
				System.out.println();
				
			} else if (opcao.equals("3")) {
				System.out.println("Digite o nome para buscar: ");
				String nomeBusca = sc.next();
				
				agenda.buscarContato(nomeBusca);
				System.out.println();
				
			} else if (opcao.equals("4")) {
				System.out.println("Digite o nome do contato que deseja remover:");
				String nomeRemove = sc.next();
				System.out.println();
				
				agenda.removerContato(nomeRemove);
				System.out.println();
				
			} else if (opcao.equals("5")) {
				System.out.println("Saindo do programa...");
				
				
			} else {
				System.out.println("Opção invalida! Tente novamente.");
			}
		}
		sc.close();
	}
}
