package nivel4;

import java.util.Scanner;

class RegraNegocioException extends RuntimeException {
	
	public RegraNegocioException(String mensagem) {
		super(mensagem);
	}
}
public class Exercicio018 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		try {
			System.out.println("Digite a sua idade:");
			int idade = teclado.nextInt();
			
			validarIdade(idade);
			
		} catch (RegraNegocioException e) {
			System.out.println("Erro de validação| " + e.getMessage());
			System.out.println();
			
		} catch (Exception e) {
			System.out.println("Erro: Digite apenas números inteiros.");
			System.out.println();
			
		} finally {
			teclado.close();
		}
	}
	
	public static void validarIdade(int idade) {
		if (idade < 18) {
			
			throw new RegraNegocioException("Acesso negado: Menor de idade.");
			
		} else {
			System.out.println("Acesso liberado! Bem-Vindo ao sistema.");
		}
	}

	
}
