package nivel4;

public class Exercicio001 {
	
	public static void main(String[] args) {
		
		Exercicio001Pessoa p1 = new Exercicio001Pessoa("Mayara", 14, "08/07/2009", 159, "Castanho", "Cacheado");
		
		System.out.println(p1.getNome());
		p1.setNome("Cute Cute");
		System.out.println(p1.getNome());
		
	}
}
