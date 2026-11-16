package nivel5;

public class Exercicio003 {
	public static void main(String[] args) {

		Exercicio003Node node1 = new Exercicio003Node(10);
		Exercicio003Node node2 = new Exercicio003Node(20);
		Exercicio003Node node3 = new Exercicio003Node(30);
		Exercicio003Node node4 = new Exercicio003Node(40);

		node1.setNode(node2);
		node2.setNode(node3);
		node3.setNode(node4);
		node4.setNode(null);

		percorrer(node1);
	}

	public static void percorrer(Exercicio003Node head) {
		System.out.println(head.getValor());

		if (head.getNode() == null) {
			return;
		}

		percorrer(head.getNode());
	}
}
