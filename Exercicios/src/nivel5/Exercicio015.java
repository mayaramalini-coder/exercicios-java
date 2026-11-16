package nivel5;

import java.util.List;

public class Exercicio015 {
	public static void main(String[] args) {

		String codigoValido = "150 + 3 - 42";
		String codigoInvalido = "150 + - 42";

		executarCompilador(codigoValido);
		System.out.println("-------------------------------");
		executarCompilador(codigoInvalido);
	}

	private static void executarCompilador(String codigo) {
		System.out.println("Analisando entrada: \"" + codigo + "\"");
		try {
			Exercicio015Lexico scanner = new Exercicio015Lexico(codigo);
			List<Exercicio015Token> tokens =  scanner.scan();
			System.out.println("Tokens gerados: " + tokens);
			
			Exercicio015Sintatico parser = new Exercicio015Sintatico(tokens);
			parser.validar();
			
			System.out.println("Resultado: Sintaxe VÁLIDA!");
			
		} catch (RuntimeException e) {
			System.err.println("Resultado: CÓDIGO INVÁLIDO!");
			System.err.println(e.getMessage());
		}
	}
}
