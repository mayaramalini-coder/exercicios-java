package nivel6;

public class Exercicio007 {
	public static void main(String[] args) {
		
		new Thread(() -> {
			for (int i = 1; i <= 3; i++) {
				System.out.println("Ajudante: cortando salada " + i);
			}
		}).start();
		
		for (int i = 1; i <= 3; i++) {
			System.out.println("Cozinheiro: fritando carne " + i);
		}
	}
}

