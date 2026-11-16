package nivel5;

public class Exercicio007<K, V> {

	private static class Entry<K, V> {
		K key;
		V value;
		Entry<K, V> next;
		
		Entry(K key, V value) {
			this.key = key;
			this.value = value;
		}
	}
	
	private Entry<K, V>[] buckets;
	private int capacity = 16;
	
	@SuppressWarnings("unchecked")
	public Exercicio007() {
		buckets = new Entry[capacity];
	}
	
	private int getBucketIndex(K key) {
		if (key == null) return 0;
		return Math.abs(key.hashCode()) % capacity;
	}
	
	public void put (K key, V value) {
		int index = getBucketIndex(key);
		Entry<K, V> head = buckets[index];
		
		 Entry<K, V> current = head;
		 while(current != null) {
			if ((current.key == null && key == null) || (current.key != null && current.key.equals(key))) {
				current.value = value;
				return;
			}
			current = current.next;
		 }
		 
		 Entry<K, V> newEntry = new Entry<>(key, value);
		 newEntry.next = head;
		 buckets[index] = newEntry;
	}
	
	public V get(K key) {
		int index = getBucketIndex(key);
		Entry<K, V> current = buckets[index];
		
		while(current != null) {
			if ((current.key == null && key == null) || (current.key != null && current.key.equals(key))) {
				return current.value;
			}
			
			current = current.next;
		}
		
		return null;
	}
	
	public static void main(String[] args) {
		Exercicio007<String, String> mapa = new Exercicio007<>();
		
		mapa.put("RS", "Rio Grande do Sul");
		mapa.put("SP", "São Paulo");
		
		System.out.println("Resultado do GET: " + mapa.get("SP"));
	}
}
