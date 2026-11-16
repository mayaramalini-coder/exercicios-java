package nivel6;

public class Exercicio001 {
	public static void main(String[] args) {
		
		Exercicio001Container container = new Exercicio001Container();
		
		container.register(Exercicio001Motor.class);
		container.register(Exercicio001Carro.class);
		
		Exercicio001Carro carro = container.get(Exercicio001Carro.class);
		
		carro.dirigir();
	}
}
