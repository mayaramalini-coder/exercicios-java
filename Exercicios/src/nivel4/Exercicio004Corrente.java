package nivel4;

public class Exercicio004Corrente extends Exercicio003TransacaoBancaria {
	
	private Double limite;


	public Exercicio004Corrente(Exercicio001Pessoa pessoa, String cpf, Double valor, Integer id, Double limite) {
		super(pessoa, cpf, valor, id);
		this.limite = limite;
	}
	
	public Double getLimite() {
		return limite;
	}

	public void setLimite(Double limite) {
		this.limite = limite;
	}

	@Override
	public void sacar(Double valorSaque) {
		
		Double saldoAtual = getValor();
		
		if (valorSaque >= 0 && (saldoAtual + this.limite) >= valorSaque) {
			setValor(saldoAtual - valorSaque);
			System.out.println("Saque de R$ " + valorSaque + " realizado com sucesso!");
		} else {
			System.out.println("Limite insuficiente para realizar o saque.");
		}
	}
}
