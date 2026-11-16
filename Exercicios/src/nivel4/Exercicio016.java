package nivel4;

import java.util.Scanner;

import nivel4.Exercicio016Status.StatusPedido;

public class Exercicio016 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("=== CADASTRO DE PEDIDO ===");
		System.out.println();
		
		System.out.println("Digite o ID do pedido (número longo): ");
		long idDigitado = teclado.nextLong();
		teclado.nextLine();
		
		Exercicio016Pedido pedido = new Exercicio016Pedido(idDigitado);
		
		System.out.println("[Sucesso] Pedido criado com ID: " + idDigitado);
		System.out.println();
		
		System.out.println("Status atual: " + pedido.getStatus().getDescricao());
		System.out.println();
		
		
		while (true) {
			System.out.println();
			System.out.println("=== ATUALIZAR STATUS ===");
			System.out.println();
			
			System.out.println("Escolha um código:");
			System.out.println();
			
			System.out.println("1" + "- Aguardando Pagamento");
			System.out.println("2" + "- Em Processamento");
			System.out.println("3" + "- Enviado");
			System.out.println("4" + "- Entregue");
			System.out.println("5" + "- Cancelado");
			System.out.println("0" + "- Sair do programa");
			System.out.println();
			
			System.out.println("Digite o código do novo status:");
			int codigoDigitado = teclado.nextInt();
			teclado.nextLine();
			
			if (codigoDigitado == 0) {
				System.out.println("Saindo...");
				break;
			}
			
			try {
				StatusPedido novoStatus = StatusPedido.porCodigo(codigoDigitado);

				pedido.setStatus(novoStatus);

				System.out.println("[Sucesso] Status do pedido: " + idDigitado);
				System.out.println();
				System.out.println("Novo status: " + pedido.getStatus().getDescricao());
				

			} catch (IllegalArgumentException e) {

				System.out.println("Erro" + e.getMessage());

			} 
		}
		System.out.println("--- Fim do programa! ---");
		teclado.close();
	}
} 

