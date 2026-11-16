package nivel6;

import java.nio.file.Files;
import java.nio.file.Path;

public class Exercicio006 {
	public static void main(String[] args) throws Exception {
		
		Exercicio006Produto p = new Exercicio006Produto("Teclado", 150.00);
		Path caminho = Path.of("produto.txt");
		
		String textoSerializado = p.serializar();
		System.out.println("Texto gerado: " + textoSerializado);
		
		Files.writeString(caminho, textoSerializado);
		System.out.println("Arquivo salvo com sucesso!");
		
		String conteudoLido = Files.readString(caminho);
		Exercicio006Produto produtoRecuperado = Exercicio006Produto.desserializar(conteudoLido);
		
		System.out.println("Obejto recuperado -> Nome: " + produtoRecuperado.nome +  " | Preço " + produtoRecuperado.preco);
	}
}
