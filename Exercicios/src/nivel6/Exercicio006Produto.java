package nivel6;

public class Exercicio006Produto {

	public String nome;
	public Double preco;
	
	public Exercicio006Produto(String nome, Double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public String serializar() {
		return nome + ";" + preco;
	}
	
	public static Exercicio006Produto desserializar(String dados) {
		String[] partes = dados.split(";");
		return new Exercicio006Produto(partes[0], Double.parseDouble(partes[1]));
	}
	
}
