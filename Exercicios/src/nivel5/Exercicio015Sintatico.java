package nivel5;

import java.util.List;

public class Exercicio015Sintatico {

	private final List<Exercicio015Token> tokens;
	private int atual = 0;
	
	public Exercicio015Sintatico(List<Exercicio015Token> tokens) {
		super();
		this.tokens = tokens;
	}
	
	private Exercicio015Token espiar() {
		return tokens.get(atual);
	}
	
	private void consumir(Exercicio015TipoToken tipoEsperado) {
		if (espiar().getTipo() ==  tipoEsperado) {
			atual++;
			
		} else {
			throw new RuntimeException("Erro Sintático: Esperado " + tipoEsperado + " mas encontrado " + espiar());
		}
	}
	
	public void validar() {
		expressao();
		
		if (espiar().getTipo() != Exercicio015TipoToken.EOF) {
			throw new RuntimeException("Erro Sintático: Símbolos inesperados ao final da expressão.");
		}
	}
	
	private void expressao() {
		consumir(Exercicio015TipoToken.NUMERO);
		
		while (espiar().getTipo() == Exercicio015TipoToken.MAIS || espiar().getTipo() == Exercicio015TipoToken.MENOS) {
			if (espiar().getTipo() == Exercicio015TipoToken.MAIS) {
				consumir(Exercicio015TipoToken.MAIS);
				
			} else {
				consumir(Exercicio015TipoToken.MENOS);
			}
			consumir(Exercicio015TipoToken.NUMERO);
		}
	}
}
