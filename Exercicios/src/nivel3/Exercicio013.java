package nivel3;

import java.util.Scanner;

public class Exercicio013 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite uma operação: ");
		String expressao = teclado.nextLine();
		
		String[] valorExpressao = expressao.split(" ");
		System.out.println(calcular(valorExpressao));
		
		teclado.close();
		
	}
	
	public static Integer calcular(String[] valoresExpressao) {
		
		Integer resultadoFinal = 0;
		
		for (int i = 0; i < valoresExpressao.length; i++) {
			
			if (valoresExpressao[i].equals("0")) {
				continue;
			}
			
			Integer resultado = 0;
			
			if (valoresExpressao[i].equals("*")) {
				Integer valorAnterior = Integer.parseInt(valoresExpressao[i - 1]);
				Integer valorPosterior = Integer.parseInt(valoresExpressao[i + 1]);
				
				resultado = valorAnterior * valorPosterior;
				resultadoFinal += resultado;
				
				valoresExpressao[i - 1] = String.valueOf(resultado);
				valoresExpressao[i] = "0";
				valoresExpressao[i + 1] = "0";
			}
			
			if (valoresExpressao[i].equals("/")) {
				Integer valorAnterior = Integer.parseInt(valoresExpressao[i - 1]);
				Integer valorPosterior = Integer.parseInt(valoresExpressao[i + 1]);
				
				resultado = valorAnterior / valorPosterior;
				resultadoFinal += resultado;
				
				valoresExpressao[i - 1] = String.valueOf(resultado);
				valoresExpressao[i] = "0";
				valoresExpressao[i + 1] = "0";
			}
			
			if (valoresExpressao[i].equals("+")) {
				Integer valorAnterior = Integer.parseInt(valoresExpressao[i - 1]);
				Integer valorPosterior = Integer.parseInt(valoresExpressao[i + 1]);
				
				resultado = valorAnterior + valorPosterior;
				resultadoFinal += resultado;
				
				valoresExpressao[i - 1] = String.valueOf(resultado);
				valoresExpressao[i] = "0";
				valoresExpressao[i + 1] = "0";
				
				
			} else if (valoresExpressao[i].equals("-")) {
				Integer valorAnterior = Integer.parseInt(valoresExpressao[i - 1]);
				Integer valorPosterior = Integer.parseInt(valoresExpressao[i + 1]);
				
				resultado = valorAnterior - valorPosterior;
				resultadoFinal += resultado;
				
				valoresExpressao[i - 1] = String.valueOf(resultado);
				valoresExpressao[i] = "0";
				valoresExpressao[i + 1] = "0";
				
			} else {
				continue;
			}
			
			
		}
		
		return resultadoFinal;
		
	}
	
}
