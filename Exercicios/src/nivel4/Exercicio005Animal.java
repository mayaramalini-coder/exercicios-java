package nivel4;

public class Exercicio005Animal {

	private String nome;
	private String especie;

	public Exercicio005Animal(String nome, String especie) {
		super();
		this.nome = nome;
		this.especie = especie;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	public void comer() {
		System.out.println("O animal está comendo...");
	}

	public void correr() {
		System.out.println("O animal está correndo...");
	}

}
