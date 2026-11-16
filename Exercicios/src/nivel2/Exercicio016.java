package nivel2;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio016 {
	public static void main(String[] args) {
		
		ArrayList<Integer> restos = new ArrayList<>();
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um numero decimal: ");
		int quocienteAtual = teclado.nextInt();
		
		int proximoQuociente = 0;
		
		while (quocienteAtual >= 1) {
			
			proximoQuociente = quocienteAtual / 2;
			int resto = quocienteAtual % 2;
			
			if (quocienteAtual == 1) {
				restos.add(quocienteAtual);
				break;
			}
			
			restos.add(resto);
			quocienteAtual = proximoQuociente;
		} 
		
		for (int i = restos.size() - 1; i >= 0; i--) {
			System.out.print(restos.get(i) + " ");
		}
			
		teclado.close();
		
	}
}
