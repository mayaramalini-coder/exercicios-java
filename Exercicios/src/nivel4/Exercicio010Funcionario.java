package nivel4;

public class Exercicio010Funcionario {

	private Exercicio001Pessoa pessoa;
	private Double salario;
	private String funcao;
	private int cargaHoraria;

	public Exercicio010Funcionario(Exercicio001Pessoa pessoa, Double salario, String funcao, int cargaHoraria) {
		super();
		this.pessoa = pessoa;
		this.salario = salario;
		this.funcao = funcao;
		this.cargaHoraria = cargaHoraria;
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

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

}
