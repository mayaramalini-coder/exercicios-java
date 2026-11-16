package nivel5;

public class Exercicio013 {

	int val;
	Exercicio013 next;

	Exercicio013(int val) {
		this.val = val;
		this.next = null;
	}

	public static void main(String[] args) {

		Exercicio013 no1 = new Exercicio013(1);
		Exercicio013 no2 = new Exercicio013(2);
		Exercicio013 no3 = new Exercicio013(3);
		Exercicio013 no4 = new Exercicio013(4);

		no1.next = no2;
		no2.next = no3;
		no3.next = no4;

		Solution solucao = new Solution();

		System.out.println("Tem ciclo? " + solucao.hasCycle(no1));

		no4.next = no2;

		System.out.println("Tem ciclo agora? " + solucao.hasCycle(no1));

	}
}

class Solution {
	public boolean hasCycle(Exercicio013 head) {
		if (head == null || head.next == null) {
			return false;
		}

		Exercicio013 slow = head;
		Exercicio013 fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			if (slow == fast) {
				return true;
			}
		}
		return false;
	}
}