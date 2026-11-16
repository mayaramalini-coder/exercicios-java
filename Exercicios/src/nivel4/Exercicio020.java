package nivel4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Exercicio020 {
	public static void main(String[] args) {
		
		String caminhoArquivo = "dados.txt";
		
		salvarDados(caminhoArquivo, "Nova linha de dados persistida!\n");
		lerDados(caminhoArquivo);
	}
	
	public static void salvarDados(String caminho, String texto) {
		try (FileWriter fw = new FileWriter(caminho, false);
				PrintWriter pw = new PrintWriter(fw)) {
			pw.print(texto);
			System.out.println("Texto gravado: " + texto);
			
		} catch (IOException e){
			System.out.println("Erro ao salvar: " + e.getMessage());
		}
	}

	public static void lerDados(String caminho) {
		try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
			
			String linha;
			while ((linha = br.readLine()) != null) {
				System.out.println("Linha lida: " + linha);
			}
		
		} catch (IOException e) {
			System.out.println("Erro ao ler: " + e.getMessage());
		  }
		} 
	}