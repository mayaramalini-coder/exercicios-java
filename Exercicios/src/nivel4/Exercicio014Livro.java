package nivel4;

public class Exercicio014Livro {

	private String titulo;
	private String autor;
	private String qntPaginas;
	private String genero;
	private String valor;

	public Exercicio014Livro(String titulo, String autor, String qntPaginas, String genero, String valor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.qntPaginas = qntPaginas;
		this.genero = genero;
		this.valor = valor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getQntPaginas() {
		return qntPaginas;
	}

	public void setQntPaginas(String qntPaginas) {
		this.qntPaginas = qntPaginas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

}
