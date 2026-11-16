package nivel1;

import java.util.Scanner;

public class Exercicio005 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Qual é a temperatura da sua cidade? ");
		int celsius = teclado.nextInt();
		System.out.println();
		
		int calculo = (celsius * 9 / 5) + 32;
		
		System.out.println("A temperatura em Fahrenheit é: " + calculo);
		
		teclado.close();
		
		
		
		
		
		
	}
}
