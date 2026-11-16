package nivel4;

public class Exercicio007Produto {

	private String nome;
	private Double valor;
	private int quantidade;

	public Exercicio007Produto(String nome, Double valor, int quantidade) {
		super();
		this.nome = nome;
		this.valor = valor;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome == null || nome.trim().isEmpty()) {
			System.out.println("Aviso: Nome inválido! Definido como 'Produto sem nome.'");
			this.nome = "Produto sem nome.";
			
		} else {
			this.nome = nome;
		}
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		if (valor <= 0) {
			System.out.println("Aviso: Preço " + valor + " é inválido! Definido como R$ 1.00");
			this.valor = 1.00;
			
		} else {
			this.valor = valor;
		}
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		if (quantidade < 0) {
			System.out.println("Aviso: Quantidade " + quantidade +  " é inválida! Definida como 0.");
			this.quantidade = 0;
		} else {
			this.quantidade = quantidade;
		}
	}
	

}
