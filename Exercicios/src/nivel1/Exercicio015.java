package nivel1;

public class Exercicio015 {
	public static void main(String[] args) {
		
		String texto = "Olá mundo!";
		int contador = 0;
		
		String textoFormatado = texto.toLowerCase();
		
		for (int i = 0; i < textoFormatado.length(); i++) {
			if (textoFormatado.charAt(i) == 'a' || textoFormatado.charAt(i) == 'e' || textoFormatado.charAt(i) == 'i' || textoFormatado.charAt(i) == 'o' || textoFormatado.charAt(i) == 'u') {
				contador++;
			}
		}
		
		System.out.println("Quantidade de vogais: " + contador);
	
	}
}
