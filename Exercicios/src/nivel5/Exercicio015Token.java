package nivel5;

public class Exercicio015Token {

	private final Exercicio015TipoToken tipo;
	private final String valor;

	public Exercicio015Token(Exercicio015TipoToken tipo, String valor) {
		super();
		this.tipo = tipo;
		this.valor = valor;
	}

	public Exercicio015TipoToken getTipo() {
		return tipo;
	}

	public String getValor() {
		return valor;
	}
	
	@Override
	public String toString() {
		return "Token(" + tipo + ", '" + valor + "')";
	}

}
