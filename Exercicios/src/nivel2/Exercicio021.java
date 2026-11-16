package nivel2;

import java.util.Scanner;

public class Exercicio021 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int opcao = 0;
		
		while (opcao != 3) {
			System.out.println("1- Mostrar Bom dia!");
			System.out.println("2- Mostrar Boa tarde!");
			System.out.println("Escolha:");
			opcao = teclado.nextInt();
			
			if (opcao == 1) {
				System.out.println("Bom dia!");
				break;
				
			} else if (opcao == 2) {
				System.out.println("Boa tarde!");
				break;
				
			} else if (opcao != 2) {
				System.out.println("Opção invalida!!");
				break;
				
			}
			
		}
		
		
		System.out.println("Fim do progama.");
		teclado.close();
	}
}
