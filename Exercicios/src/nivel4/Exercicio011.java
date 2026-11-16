package nivel4;

public class Exercicio011 {
	public static void main(String[] args) {
		
		Exercicio001Pessoa pessoa = new Exercicio001Pessoa("Emili", 23, "08/07/2003", 160, "azul", "ruiva");
		Exercicio011Sistema folha = new Exercicio011Sistema(pessoa, 15000.00, 12, 4, "Médica");
		
		System.out.println("--- FOLHA SALÁRIAL ---");
		System.out.println();
		
		System.out.println("Nome:"
				+ " " + pessoa.getNome());
		System.out.println("Salário: R$ " + folha.getSalario());
		System.out.println("Carga horário no dia: " + folha.getCargaHoraria() + "H");
		System.out.println("Horas extras: " + folha.getHoraExtra() + "H");
		System.out.println("Profissão: " + folha.getProfissao());
	}
}
