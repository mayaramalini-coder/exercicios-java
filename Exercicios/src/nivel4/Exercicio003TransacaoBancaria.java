package nivel4;

public class Exercicio003TransacaoBancaria {

	private Exercicio001Pessoa pessoa;
	private String cpf;
	private Double valor;
	private Integer id;

	public Exercicio003TransacaoBancaria(Exercicio001Pessoa pessoa, String cpf, Double valor, Integer id) {
		this.pessoa = pessoa;
		this.cpf = cpf;
		this.valor = valor;
		this.id = id;
	}

	public Exercicio001Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Exercicio001Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public void depositar(Double valor) {
		this.valor += valor;
	}
	
	public void sacar(Double valor) {
		this.valor -= valor;
	}

}
