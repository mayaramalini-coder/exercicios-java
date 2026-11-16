package nivel4;

public abstract class Exercicio012Animal {
	private String especie;

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public abstract void fazerSom();

	public abstract void dormir();

}
