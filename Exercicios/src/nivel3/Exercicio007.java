package nivel3;

import java.util.Arrays;

public class Exercicio007 {

	public static void main(String[] args) {
		
		int[] vetor = {12, 11, 13, 5, 6, 7};
		
		System.out.println("Vetor original " + Arrays.toString(vetor));
		
		int[] vetoOrdenado = mergeSort(vetor);
		
		System.out.println("Vetor Ordenado " + Arrays.toString(vetoOrdenado));
	}
	
	public static int[] mergeSort(int[] array) {
		
		if (array.length <= 1) {
			return array;
		}
		
		int meio = array.length / 2;
		
		int[] esquerda = Arrays.copyOfRange(array, 0, meio);
		int[] direita = Arrays.copyOfRange(array, meio, array.length);
		
		esquerda = mergeSort(esquerda);
		direita = mergeSort(direita);
		
		return merge(esquerda, direita);
	}
	
	private static int[] merge(int[] esquerda, int[] direita) {
		int[] resultado = new int[esquerda.length + direita.length];
		
		int iEsquerda = 0;
		int iDireita = 0;
		int iResultado = 0;
		
		
		while (iEsquerda < esquerda.length && iDireita < direita.length) {
			if (esquerda[iEsquerda] < direita[iDireita]) {
				resultado[iResultado] = esquerda[iEsquerda];
				iEsquerda++;
				
			} else {
			resultado[iResultado] = direita[iDireita]; 
			iDireita++;
			}
			
			iResultado++;
		}
		
		while (iEsquerda < esquerda.length) {
			resultado[iResultado] = esquerda[iEsquerda];
			iEsquerda++;
			iResultado++;
		}
		
		while (iDireita < direita.length) {
			resultado[iResultado] = direita[iDireita];
			iDireita++;
			iResultado++;
		}
		
		return resultado;
	}
}
