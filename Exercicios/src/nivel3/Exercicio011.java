package nivel3;

import java.security.SecureRandom;

public class Exercicio011 {
	public static void main(String[] args) {
		
		String maiusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String minusculas = "abcdefghijklmnopqrstuvwxyz";
		String numeros = "1234567890";
		String sinais = "!@#$%&*.";
		
		String todosCaracteres = maiusculas + minusculas + numeros + sinais;
		
		int tamanho = 15;
		String senha = "";
		
		SecureRandom aleatorio = new SecureRandom();
		
		for (int i = 0; i < tamanho; i++) {
			int posicaoSorteada = aleatorio.nextInt(todosCaracteres.length());
			senha = senha + todosCaracteres.charAt(posicaoSorteada);
		}
		
		System.out.println("A senha é: " + senha);
	}
}
