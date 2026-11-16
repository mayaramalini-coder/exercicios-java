package nivel5;

import java.util.LinkedHashMap;
import java.util.Map;

public class Exercicio011 {

	public static class LRUCache<K, V> extends LinkedHashMap<K, V> {
		
		private final int capacity;
		
		public LRUCache(int capacity) {
			super(capacity, 0.75f, true);
			this.capacity = capacity;
		}
		
		@Override
		protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
			return size() > capacity;
		}
	}
	
	public static void main(String[] args) {
		LRUCache<String, Integer> cache = new LRUCache<>(2);
		
		cache.put("A", 1);
		cache.put("B", 2);
		System.out.println("Cache inicial: " + cache);
		
		cache.get("A");
		
		cache.put("C", 3);
		System.out.println("Após inserir C: " + cache);
	}
}
