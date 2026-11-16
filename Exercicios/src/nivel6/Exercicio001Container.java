package nivel6;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

public class Exercicio001Container {

	private Map<Class<?>, Object> objetos = new HashMap<>();
	
	public <T> void register(Class<T> classe) {
		get(classe);
		
	}

	public <T> T get(Class<T> classe) {
		
		if (objetos.containsKey(classe)) {
			return classe.cast(objetos.get(classe));
		}
		
		try {
			Constructor<?> construtor =
			  classe.getConstructors()[0];
			
			Class<?>[] dependencias = 
					construtor.getParameterTypes();
			
			Object[] argumentos = new Object[dependencias.length];
			
			for (int i = 0; i < dependencias.length; i++) {
				argumentos[i] = get(dependencias[i]);
			}
			
			T objeto = classe.cast(construtor.newInstance(argumentos));
			
			objetos.put(classe, objeto);
			
			return objeto;
			
		} catch (Exception e ){
			throw new RuntimeException("Erro ao criar objeto:" + classe.getName());
		}
	}
}
