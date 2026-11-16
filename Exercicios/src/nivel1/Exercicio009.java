package nivel1;

import java.util.Scanner;

public class Exercicio009 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite a sua altura:");
		double altura = teclado.nextDouble();
		System.out.println();
		
		System.out.print("Digite o seu peso:");
		double peso = teclado.nextDouble();
		System.out.println();
		
		double valorIMC = peso / (altura * altura);
		
		if (valorIMC < 18.5) {
			System.out.println("Seu IMC é: " + valorIMC + ", você está abaixo do peso!");
			
		} else if (valorIMC >= 18.5 && valorIMC <= 24.9) {
			System.out.println("Seu IMC é: " + valorIMC + ", seu peso é normal!");
			
		} else if (valorIMC >= 25.0 && valorIMC <= 29.9) {
			System.out.println("Seu IMC é: " + valorIMC + ", você está com sobrepeso!");
			
		} else {
			System.out.println("Seu IMC é: " + valorIMC + ", você está com obesidade/ grávida!");
		}
		
			teclado.close();
		
		
	}
}
