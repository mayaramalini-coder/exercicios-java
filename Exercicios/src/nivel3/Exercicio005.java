package nivel3;

public class Exercicio005 {

	public static int buscaBinaria(int[] array, int alvo) {
		
		int inicio = 0;
		int fim = array.length - 1;
		
		while (inicio <= fim) {
			int meio = inicio + (fim - inicio) / 2;
			
			if (array[meio] == alvo) {
				return meio;
				
			}else if (array[meio] < alvo) {
				inicio = meio + 1;
				
			} else {
				fim = meio - 1;
			}
		}
		
		return - 1;
		
	}
	
	public static void main(String[] args) {
		
		int[] numeros = {2, 3, 6, 8, 9, 13};
		int resultado = buscaBinaria(numeros, 8);
		System.out.println("Indice " + resultado);
		
		
		
	}
}
