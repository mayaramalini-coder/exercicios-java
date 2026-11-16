package nivel4;

public class Exercicio011Sistema {

	private Exercicio001Pessoa pessoa;
	private Double salario;
	private int cargaHoraria;
	private int horaExtra;
	private String profissao;

	public Exercicio011Sistema(Exercicio001Pessoa pessoa, Double salario, int cargaHoraria, int horaExtra,
			String profissao) {
		super();
		this.pessoa = pessoa;
		this.salario = salario;
		this.cargaHoraria = cargaHoraria;
		this.horaExtra = horaExtra;
		this.profissao = profissao;
	}

	public Exercicio001Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Exercicio001Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public int getHoraExtra() {
		return horaExtra;
	}

	public void setHoraExtra(int horaExtra) {
		this.horaExtra = horaExtra;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

}
