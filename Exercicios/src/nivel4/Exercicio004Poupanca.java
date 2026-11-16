package nivel4;

public class Exercicio004Poupanca extends Exercicio003TransacaoBancaria {

	private Double taxaRendimento;

	public Exercicio004Poupanca(Exercicio001Pessoa pessoa, String cpf, Double valor, Integer id,
			Double taxaRendimento) {
		super(pessoa, cpf, valor, id);
		this.taxaRendimento = taxaRendimento;
	}

	public Double getTaxaRendimento() {
		return taxaRendimento;
	}

	public void setTaxaRendimento(Double taxaRendimento) {
		this.taxaRendimento = taxaRendimento;
	}
	
	public void aplicarRendimento() {
		Double saldoAtual = getValor();
		Double rendimento = saldoAtual * this.getTaxaRendimento();
		setValor(saldoAtual + rendimento);
		System.out.println("Rendimento de R$ " + rendimento + " aplicado. Novo saldo R$ " + getValor());
	}
	
	
	}


