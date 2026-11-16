package nivel2;

import java.util.Random;

public class Exercicio014 {
	public static void main(String[] args) {
		
		Random random = new Random();
		
		for (int i = 1; i <= 100; i++) {
			System.out.println("lançamento de numero " + i + ": " + random.nextInt(6) + 1);
		}
		
	}
}
