package nivel4;

public class Exercicio013Retangulo extends Exercicio013Forma {

	private Double largura;
	private Double altura;

	public Exercicio013Retangulo(Double largura, Double altura) {
		super();
		this.largura = largura;
		this.altura = altura;
	}

	public Double getLargura() {
		return largura;
	}

	public void setLargura(Double largura) {
		this.largura = largura;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	@Override
	public Double calcularArea() {
		return altura * largura;
	}

	@Override
	public Double calcularPerimetro() {
		return (altura * 2) + (largura * 2);
	}

}
