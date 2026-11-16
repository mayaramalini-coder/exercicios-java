package nivel6;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import nivel6.Exercicio005Anotacao.Coluna;
import nivel6.Exercicio005Anotacao.Tabela;

public class Exercicio005Motor{

	private final Map<String, List<Map<String, Object>>> bancoMemoria = new HashMap<>();
	
	public void salvar(Object entidade) throws Exception {
		Class<?> clazz = entidade.getClass();
		String nomeTabela = clazz.getAnnotation(Tabela.class).nome();
		
		bancoMemoria.putIfAbsent(nomeTabela, new ArrayList<>());
		
		
		
		Map<String, Object> linha = new HashMap<>();
		for (Field field : clazz.getDeclaredFields()) {
			if (field.isAnnotationPresent(Coluna.class)) {
				field.setAccessible(true);
				
				String nomeColuna = field.getAnnotation(Coluna.class).nome();
				linha.put(nomeColuna, field.get(entidade));
			}
		}
		
		bancoMemoria.get(nomeTabela).add(linha);
	}
	
	public <T> List<T> listarTodos(Class<T> clazz) throws Exception {
		String nomeTabela = clazz.getAnnotation(Tabela.class).nome();
		List<Map<String, Object>> linhas = bancoMemoria.getOrDefault(nomeTabela, new ArrayList<>());
		List<T> resultados = new ArrayList<>();
		
		for (Map<String, Object> linha : linhas) {
			T instancia = clazz.getDeclaredConstructor().newInstance();
			
			for (Field field : clazz.getDeclaredFields()) {
				if (field.isAnnotationPresent(Coluna.class)) {
					field.setAccessible(true);
					
					String nomeColuna = field.getAnnotation(Coluna.class).nome();
					field.set(instancia, linha.get(nomeColuna));
				}
			}
			
			resultados.add(instancia);
		}
		return resultados;
	}
	
}
