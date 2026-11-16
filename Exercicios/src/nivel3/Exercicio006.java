package nivel3;

public class Exercicio006 {

	public static void ordenar(int[] array, int inicio, int fim) {
		
		if (inicio >= fim) return;
		
		int pivo = array[fim];
		int i = inicio;
		
		for (int j = inicio; j < fim; j++) {
			if (array[j] <= pivo) {
				
				int tempo = array[i];
				array[i] = array[j];
				array[j] = tempo;
				i++;
			}
		}
		
		int tempo = array[i];
		array[i] = array[fim];
		array[fim] = tempo;
		
		ordenar(array, inicio, i - 1);
		ordenar(array, i + 1, fim);
	}
	
	public static void main(String[] args) {
		
		int[] dados = {5, 2, 9, 1, 3};
		ordenar(dados, 0, dados.length - 1);
		
		for (int n: dados) System.out.println(n + " ");
	}
}
