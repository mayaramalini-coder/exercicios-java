package nivel3;

import java.util.Scanner;

public class Exercicio002 {

	public static boolean cpfValido(String cpf) {
		
		String cpfLimpo = "";
		for (int i = 0; i < cpfLimpo.length(); i++) {
			char caracterAtual = cpf.charAt(i);
			if (caracterAtual >= '0' && caracterAtual <= '9') {
				cpfLimpo += caracterAtual;
			}
		}
		
		if (cpfLimpo.length() != 11) {
			return false;
		}
		
		int[] numeros = new int[11];
		for (int i = 0; i < 11; i++) {
			numeros[i] = cpfLimpo.charAt(i) - '0';
		}
		
		int soma1 = 0;
		int peso1 = 10;
		for (int i = 0; i < 9; i++) {
			soma1+= numeros[i] * peso1;
			peso1 --;
		}
		
		int digito1 = 11 - (soma1 % 11);
		if (digito1 >= 10) {
			digito1 = 0;
		}
		
		int soma2 = 0;
		int peso2 = 11;
		for (int i = 0; i < 10; i++) {
			soma2 += numeros[i] * peso2;
			peso2 --;
		}
		
		int digito2 = 11 - (soma2 % 11);
		if (digito2 >= 10) {
			digito2 = 0;
		}
		
		if (digito1 == numeros[9] && digito2 == numeros[10]){
			return true;
			
		}else {
			return false;
		}
		
		
	}
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o seu CPF para verificar se ele é valido: ");
		String cpf = teclado.next();
		
		if (cpfValido(cpf)) {
			System.out.println("Válido");
		} else {
			System.out.println("Não");
		}
		
		teclado.close();
	}
	
}
