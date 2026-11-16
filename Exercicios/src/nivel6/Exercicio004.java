package nivel6;

import java.lang.reflect.Method;

public class Exercicio004 {
	public static void main(String[] args) {
		
		try {
			MinhaClasse obj = new MinhaClasse();
			
			Method metodo = obj.getClass().getMethod("nomeDoMetodo", String.class, int.class);
			
			Object resultado = metodo.invoke(obj, "Texto de exemplo", 10);
			
			System.out.println("Retorno do método: " + resultado);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class MinhaClasse {
	public String nomeDoMetodo(String texto, int numero) {
		return texto + "-" + numero;
	}
}




