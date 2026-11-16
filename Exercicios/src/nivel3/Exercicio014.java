package nivel3;

import java.util.Scanner;

public class Exercicio014 {
	public static boolean validarLogin(String email, String senha) {
		
		return email.equals("sarahmalini@icloud.com") && senha.equals("sara123.");
	
	}
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o seu email: ");
		String emailDigitado = teclado.next();
		
		System.out.println("Digite a sua senha: ");
		String senhaDigitada = teclado.next();
		
		boolean valido = validarLogin(emailDigitado, senhaDigitada);
		
		if (valido) {
			System.out.println("Login válido!");
		} else {
			System.out.println("Login inválido.");
		}
		
		teclado.close();
	}
}

	