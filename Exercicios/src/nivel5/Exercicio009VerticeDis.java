package nivel5;

public class Exercicio009VerticeDis implements Comparable<Exercicio009VerticeDis> {

	private final int id;
	private final int distanciaAcumulada;
	
	public Exercicio009VerticeDis(int id, int distanciaAcumulada) {
		super();
		this.id = id;
		this.distanciaAcumulada = distanciaAcumulada;
	}

	public int getId() {
		return id;
	}

	public int getDistanciaAcumulada() {
		return distanciaAcumulada;
	}
	
	@Override
	public int compareTo(Exercicio009VerticeDis outro) {
		return Integer.compare(this.distanciaAcumulada, outro.distanciaAcumulada);
	}
}
