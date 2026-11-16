package nivel3;

import java.security.SecureRandom;
import java.util.Random;

public class Exercicio008 {

	public static void main(String[] args) {
		
		String minusculas = "abcdefghijklmnopqrstuvwxyz";
		String maiusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String numeros = "1234567890";
		String sinais = "!@#$%&*.,";
		
		String todosOsCaracteres = minusculas + maiusculas + numeros + sinais;
		
		int tamanhoDaSenha = 12;
		String senha = "";
		
		SecureRandom sorteador = new SecureRandom();
		
		for (int i = 0; i < tamanhoDaSenha; i++) {
			int posicaoSorteada = sorteador.nextInt(todosOsCaracteres.length());
			senha = senha + todosOsCaracteres.charAt(posicaoSorteada);
			
		}
		
		System.out.println("Senha gerada:" + senha);
	}
}
