package nivel4;

public class Exercicio005Cat extends Exercicio005Animal {

	public Exercicio005Cat(String nome, String especie) {
		super(nome, especie);

	}
	
	@Override
	public void comer() {
		System.out.println("O gato está " + this.getNome() + " comendo...");
	}
	
	@Override
	public void correr() {
		System.out.println("O gato está " + this.getNome() + " correndo...");
	}

}