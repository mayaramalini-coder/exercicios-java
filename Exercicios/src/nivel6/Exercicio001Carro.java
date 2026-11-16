package nivel6;

public class Exercicio001Carro {

	private Exercicio001Motor motor;
	
	public Exercicio001Carro(Exercicio001Motor motor) {
		this.motor = motor;
	}
	
	public void dirigir() {
		motor.ligar();
		System.out.println("O carro está andando.");
	}
}
