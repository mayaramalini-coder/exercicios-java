package nivel4;

public class Exercicio005Main {
	public static void main(String[] args) {
		
		Exercicio005Animal animal1 = new Exercicio005Animal(null, null);
		Exercicio005Animal animal2 = new Exercicio005Dog ("Ayla", "Husky");
		Exercicio005Animal animal3 = new Exercicio005Cat ("Safira", "Persa");
		
		animal2.comer();
		animal2.correr();
		
		animal3.comer();
		animal3.correr();
	}
}
