package nivel4;

public class Exercicio012Gato extends Exercicio012Animal {

	private String nome;

	public Exercicio012Gato(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public void fazerSom() {
		System.out.println("O gato " + nome + " está miando");
	}

	@Override
	public void dormir() {
		System.out.println("O gato " + nome + " está dormindo");
	}

}
