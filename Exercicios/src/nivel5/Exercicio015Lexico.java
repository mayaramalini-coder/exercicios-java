package nivel5;

import java.util.ArrayList;
import java.util.List;

public class Exercicio015Lexico {

	private final String entrada;
	private int posicao = 0;
	
	public Exercicio015Lexico(String entrada) {
		this.entrada = entrada;
	}
	
	public List<Exercicio015Token> scan() {
		List<Exercicio015Token> tokens = new ArrayList<>();
		
		while (posicao < entrada.length()) {
			char atual = entrada.charAt(posicao);
			
			if (Character.isWhitespace(atual)) {
				posicao++;
				continue;
			}
			
			if (atual == '+') {
				tokens.add(new Exercicio015Token(Exercicio015TipoToken.MAIS, "+"));
				posicao++;
				
			} else if (atual == '-') {
				tokens.add(new Exercicio015Token(Exercicio015TipoToken.MENOS, "-"));
				posicao++;
			}
			
			else if (Character.isDigit(atual)) {
				StringBuilder sb = new StringBuilder();
				while (posicao < entrada.length() && Character.isDigit(entrada.charAt(posicao))) {
					sb.append(entrada.charAt(posicao));
					posicao++;
				}
				
				tokens.add(new Exercicio015Token(Exercicio015TipoToken.NUMERO, sb.toString()));
			}
			else {
				throw new RuntimeException("Erro Léxico: Caractere inválido '" + atual + "' na posição " + posicao);
			}
		}
		
		tokens.add(new Exercicio015Token(Exercicio015TipoToken.EOF, ""));
		return tokens;
	}
}
