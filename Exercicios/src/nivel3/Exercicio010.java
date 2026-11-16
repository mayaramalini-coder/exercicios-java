package nivel3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio010 {
	public static List<Integer> listPrimos(int n) {
		
		List<Integer> numerosP = new ArrayList<>();
		
		for (int i = 2; i <= n; i++) {
			if (ehPrimo(i)) {
				numerosP.add(i);
			}
		}
		return numerosP;
	}
		
	public static boolean ehPrimo(int num) {
		
		for (int i = 2; i * i <= num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		
		return true;
	}
		
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int range = teclado.nextInt();
		
		List<Integer> listPrimos = listPrimos(range);
		
		System.out.println(listPrimos);
		
		teclado.close();
		
	}
}
