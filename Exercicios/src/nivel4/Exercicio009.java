package nivel4;

public class Exercicio009 {
	public static void main(String[] args) {
		Exercicio006Produtos produto = new Exercicio006Produtos("Poco X8 Pro", 1900.00);
		Exercicio006Produtos produto2 = new Exercicio006Produtos("Iphone16", 6000.00);
		
		System.out.println(produto.hashCode());
		System.out.println(produto2.equals(produto));
	}
	
}
