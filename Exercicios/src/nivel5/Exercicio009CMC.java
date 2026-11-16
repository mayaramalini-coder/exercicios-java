package nivel5;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Exercicio009CMC {

	public int[] cMC(int numVertices, List<List<Exercicio009Aresta>> grafo, int origem) {
		int[] distancias = new int[numVertices];
		Arrays.fill(distancias, Integer.MAX_VALUE);
		distancias[origem] = 0;
		
		PriorityQueue<Exercicio009VerticeDis> filaPrioridade = new PriorityQueue<>();
		filaPrioridade.add(new Exercicio009VerticeDis(origem, 0));
		
		boolean[] visitados = new boolean[numVertices];
		
		while(!filaPrioridade.isEmpty()) {
			Exercicio009VerticeDis atual = filaPrioridade.poll();
			int u = atual.getId();
			
			if (visitados[u]) continue;
			visitados[u] = true;
			
			for (Exercicio009Aresta aresta : grafo.get(u)) {
				int v = aresta.getDestino();
				int peso = aresta.getPeso();
				
				if (!visitados[v] && distancias[u] != Integer.MAX_VALUE && distancias[u] + peso < distancias[v]) {
					distancias[v] = distancias[u] + peso;
					filaPrioridade.add(new Exercicio009VerticeDis(v, distancias[v]));
				}
			}
		}
		
		return distancias;
	}
}
