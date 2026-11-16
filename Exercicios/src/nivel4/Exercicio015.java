package nivel4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.Scanner;

public class Exercicio015 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		Exercicio014Livro livro = new Exercicio014Livro("As tranças de um careca", "Monteiro Lobato", "Comédia", "200",
				"100,00");

		System.out.println("Digite o seu nome:");
		String nome = teclado.nextLine();

		System.out.println("Digite a data da devolução:");
		String data = teclado.nextLine();
		
		if (isDataValida(data)) {
			Exercicio015LivroEmprestado emprestimo = new Exercicio015LivroEmprestado(livro, nome, data);
			
			System.out.println("Nome da pessoa: " + emprestimo.getNome());
			System.out.println("Nome do livro: " + emprestimo.getLivro().getTitulo());
			System.out.println("Data da devolução: " + emprestimo.getDataDevolucao());
		} else { 
			System.out.println("Data inválida");
		}
		
		teclado.close();

	}

	public static boolean isDataValida(String dataStr) {
	  
	    DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/uuuu")
	       
	        .withResolverStyle(ResolverStyle.STRICT);
	    
	    try {
	       
	        LocalDate.parse(dataStr, formatador);
	        return true;
	        
	    } catch (DateTimeParseException e) {
	        return false;
	    }
	}}