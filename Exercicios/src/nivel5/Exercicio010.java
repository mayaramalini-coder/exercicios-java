package nivel5;

public class Exercicio010 {

	public static void resolver(int n, char origem, char destino, char auxiliar) {
		if (n == 1) {
			System.out.println("Mova o disco 1 da haste " + origem + " para a haste " + destino);
			return;
		}
		
		resolver(n - 1, origem, auxiliar, destino);
		
		System.out.println("Mova o disco " + n + " da haste " + origem + " para a haste " + destino);
		
		resolver(n - 1, auxiliar, destino, origem);
	}
	
	public static void main(String[] args) {
		int quantidadeDiscos = 3;
		
		resolver(quantidadeDiscos, 'A', 'C', 'B');
	}
}
