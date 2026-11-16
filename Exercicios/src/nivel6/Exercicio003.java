package nivel6;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Exercicio003 {
	public static void main(String[] args) {
		
		Class<?> clazz = String.class;
		
		System.out.println("--- Métodos de Classe --- [DevMedio](https://www.devmedia.com.br/conhecendo-java-reflection/29148)");
		Method[] methods = clazz.getDeclaredMethods();
		
		for (Method m : methods) {
			System.out.println(m.getName());
		}
		
		System.out.println("\n--- Atributos da Classe --- [Baeldung](https://baeldung.com");
		Field[] fields = clazz.getDeclaredFields();
		
		for (Field f : fields) {
			System.out.println(f.getName());
		}
	}
}
