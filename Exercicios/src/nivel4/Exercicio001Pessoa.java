package nivel4;

public class Exercicio001Pessoa {
	private String nome;
	private Integer idade;
	private String nascimento;
	private Integer altura;
	private String corOlhos;
	private String cabelo;

	public Exercicio001Pessoa(String nome, Integer idade, String nascimento, Integer altura, String corOlhos, String cabelo) {
		this.nome = nome;
		this.idade = idade;
		this.nascimento = nascimento;
		this.altura = altura;
		this.corOlhos = corOlhos;
		this.cabelo = cabelo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getNascimento() {
		return nascimento;
	}

	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}

	public Integer getAltura() {
		return altura;
	}

	public void setAltura(Integer altura) {
		this.altura = altura;
	}

	public String getCorOlhos() {
		return corOlhos;
	}

	public void setCorOlhos(String corOlhos) {
		this.corOlhos = corOlhos;
	}

	public String getCabelo() {
		return cabelo;
	}

	public void setCabelo(String cabelo) {
		this.cabelo = cabelo;
	}

}
