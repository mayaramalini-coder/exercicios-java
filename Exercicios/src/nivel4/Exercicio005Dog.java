package nivel4;

public class Exercicio005Dog extends Exercicio005Animal {

	public Exercicio005Dog(String nome, String especie) {
		super(nome, especie);
		
	}

	@Override
	public void comer() {
		System.out.println("O cachorro " + this.getNome() +" está comendo");
	}
	
	@Override
	public void correr() {
		System.out.println("O cachorro " + this.getNome() + " está correndo");
	}
}
