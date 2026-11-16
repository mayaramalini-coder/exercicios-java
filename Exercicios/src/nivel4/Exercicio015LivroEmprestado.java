package nivel4;


public class Exercicio015LivroEmprestado {
	private Exercicio014Livro livro;
	private String nome;
	private String dataDevolucao;

	public Exercicio015LivroEmprestado(Exercicio014Livro livro, String nome, String dataDevolucao) {
		super();
		this.livro = livro;
		this.nome = nome;
		this.dataDevolucao = dataDevolucao;
	}

	public Exercicio014Livro getLivro() {
		return livro;
	}

	public void setLivro(Exercicio014Livro livro) {
		this.livro = livro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(String dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
	
	

}
