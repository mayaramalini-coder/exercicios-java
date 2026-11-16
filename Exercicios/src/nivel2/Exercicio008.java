package nivel2;

import java.util.ArrayList;

public class Exercicio008 {
	public static void main(String[] args) {
		
		int[] numeros = {1, 2, 2, 4, 5, 5};
		
		ArrayList<Integer> listaSemDuplicados = new ArrayList<>();
		
		for (int i = 0; i < numeros.length; i++) {
			
			if (listaSemDuplicados.contains(numeros[i])) {
				continue;
			}
			
			listaSemDuplicados.add(numeros[i]);
			
		}
		
		System.out.println(listaSemDuplicados);
	
	}
	
}
