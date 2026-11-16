package nivel4;

public class Exercicio010 {
	public static void main(String[] args) {
		
		Exercicio001Pessoa pessoa = new Exercicio001Pessoa("Sarah", 20, "08/07/2006", 160, "azul", "ruivo");
		Exercicio010Funcionario funcionario = new Exercicio010Funcionario(pessoa, 10000.000, "programadora", 8);
		
		System.out.println("--- INFORMAÇÕES DA FUNCIONÁRIA ---");
		System.out.println();
		
		System.out.println("Nome do funcionario: " + pessoa.getNome());
		System.out.println("Função: " + funcionario.getFuncao());
		System.out.println("Salario: " + funcionario.getSalario());
		System.out.println("Carga horária: " + funcionario.getCargaHoraria());
	}
}
