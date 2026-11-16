package nivel5;

import java.util.Arrays;

public class Exercicio012 {

	public static int menorNumeroMoeda(int[] moedas, int valorAlvo) {
		int[] dp = new int[valorAlvo + 1];

		Arrays.fill(dp, valorAlvo + 1);

		dp[0] = 0;

		for (int i = 1; i <= valorAlvo; i++) {
			for (int moeda : moedas) {
				if (moeda <= i) {
					dp[i] = Math.min(dp[i], dp[i - moeda] + 1);
				}
			}
		}

		return dp[valorAlvo] > valorAlvo ? -1 : dp[valorAlvo];
	}

	public static void main(String[] args) {

		int[] moedas = { 1, 3, 4, 5 };
		int valorAlvo = 15;

		int resultado = menorNumeroMoeda(moedas, valorAlvo);
		System.out.println("Menor número de moedas: " + resultado);
	}
}
