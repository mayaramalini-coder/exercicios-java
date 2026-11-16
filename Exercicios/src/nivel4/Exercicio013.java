package nivel4;

public class Exercicio013 {
	public static void main(String[] args) {
		
		Exercicio013Forma retangulo = new Exercicio013Retangulo(4.0, 2.0);
		Exercicio013Forma circulo = new Exercicio013Circulo(10.0);
		
		System.out.println("A área do retângulo é: " + retangulo.calcularArea());
		System.out.println("O perímetro do retângulo é: " + retangulo.calcularPerimetro());
		System.out.println();
		
		System.out.println("O perímetro do circulo é:" + circulo.calcularPerimetro());
		System.out.println("A área do circulo é: " + circulo.calcularArea());
	}
}
