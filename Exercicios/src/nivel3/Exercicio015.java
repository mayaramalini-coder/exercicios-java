package nivel3;

import java.util.Scanner;

public class Exercicio015 {

	public static char[] tabuleiro = { '0', '1', '2', '3', '4', '5', '6', '7', '8' };
	public static char jogador = 'X';

	public static void mostrarTabuleiro() {
		System.out.println(tabuleiro[0] + "  " + tabuleiro[1] + "  " + tabuleiro[2]);
		System.out.println();
		System.out.println(tabuleiro[3] + "  " + tabuleiro[4] + "  " + tabuleiro[5]);
		System.out.println();
		System.out.println(tabuleiro[6] + "  " + tabuleiro[7] + "  " + tabuleiro[8]);
		System.out.println();
	}

	public static boolean verificarVencedor() {
		int[][] combinacoes = {
				{0, 1, 2}, {3, 4, 5}, {6, 7, 8},
				{0, 3, 6}, {1, 4, 7}, {2, 5, 8},
				{0, 4, 8}, {2, 6, 4}
		};
		
		for (int i = 0; i < combinacoes.length; i++) { 
			int[] combinacao = combinacoes[i];
			
			if (tabuleiro[combinacao[0]] == jogador && tabuleiro[combinacao[1]] == jogador && tabuleiro[combinacao[2]] == jogador) {
				return true;
			}
		}
		
		return false;
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int tentativas = 1;
		boolean jogovencido = false;
		
		while (tentativas <= 9 ) {
			mostrarTabuleiro();
			System.out.println("Jogador " + jogador + " escolha a sua posição: ");
			int posicao = teclado.nextInt();
			
			tabuleiro[posicao] = jogador;
			
			if (verificarVencedor()) {
				System.out.println("Jogador " + jogador + " venceu!");
				jogovencido = true;
				break;
			} else {
				tentativas++;
				
				if (jogador == 'X') {
					jogador = 'M';
					
				} else {
					jogador = 'X';
				}
			}
		}
		
		if (jogovencido == false) {
			System.out.println("Empate, ou seja dois ruins!!");
		}
		
		teclado.close();
		
	}
}
