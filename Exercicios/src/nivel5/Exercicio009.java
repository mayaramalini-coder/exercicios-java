package nivel5;

import java.util.ArrayList;
import java.util.List;

public class Exercicio009 {
	public static void main(String[] args) {
		
		int totalVertices = 5;
		
		List<List<Exercicio009Aresta>> grafo = new ArrayList<>();
		
		for (int i = 0; i < totalVertices; i++) {
			grafo.add(new ArrayList<>());
		}
		
		grafo.get(0).add(new Exercicio009Aresta(1, 4));
		grafo.get(0).add(new Exercicio009Aresta(2, 1));
		grafo.get(2).add(new Exercicio009Aresta(1, 2));
		grafo.get(1).add(new Exercicio009Aresta(3, 1));
		grafo.get(2).add(new Exercicio009Aresta(3, 5));
		grafo.get(3).add(new Exercicio009Aresta(4, 3));
		
		Exercicio009CMC algoritimo = new Exercicio009CMC();
		
		int pontOrigem = 0;
		int[] menoresDistancias = algoritimo.cMC(totalVertices, grafo, pontOrigem);
		
		System.out.println("--- MENORES DISTÂNCIAS A PARTIR DO VÉRTICE " + pontOrigem + " ---");
		System.out.println();
		
		for (int i = 0; i < totalVertices; i++) {
			String distanciaFormatada = (menoresDistancias[i] == Integer.MAX_VALUE) ? "Inacessível" : String.valueOf(menoresDistancias[i]);
			System.out.println("Até o Vértice " + i + " o custo mínimo é: " + distanciaFormatada);
		}
	}
}
