package nivel4;

public class Exercicio002 {
	public static void main(String[] args) {
		
		Exercicio001Pessoa pessoa = new Exercicio001Pessoa("Mayara Malini", 17, "08/07/2009", 159, "Castanho", "Cacheado");
		Exercicio002ContaBancaria conta = new Exercicio002ContaBancaria(pessoa, "04324959242", 100000.00000, 181427);
	
		System.out.println("Sua conta bancária: ");
		System.out.println();
		
		System.out.println("Nome: " + pessoa.getNome());
		System.out.println("CPF: " + conta.getCpf());
		System.out.println("Valor guardado: " + conta.getValor());
		System.out.println("ID|: " + conta.getId());
		System.out.println();
		
		System.out.println("Obrigada por confiar em nós!");
	
	
	
	}
}
