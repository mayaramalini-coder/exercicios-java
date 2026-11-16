package nivel3;

public class Exercicio004 {

	public static long calcularFibonacci(int n) {
		
		if (n <= 1) {
			return n; 
		}
		
		return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
		
	}
	
	public static void main(String[] args) {
		
		int n = 10;
		System.out.println("O termo " + n + " de fibonacci é: " + calcularFibonacci(n));
	}
	
}
