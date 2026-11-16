package nivel4;

public class Exercicio013Circulo extends Exercicio013Forma {

	private Double raio;

	public Double getRaio() {
		return raio;
	}

	public void setRaio(Double raio) {
		this.raio = raio;
	}

	public Exercicio013Circulo(Double raio) {
		super();
		this.raio = raio;
	}

	@Override
	public Double calcularArea() {
		return Math.PI * Math.pow(raio, 2);
	}

	@Override
	public Double calcularPerimetro() {
		return Math.PI * raio;
	}

}
