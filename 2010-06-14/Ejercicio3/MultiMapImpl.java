public class MultiMapImpl<K,V> implements MultiMap<K,V>{
	private Map<K, Set<V>> map = new HashMap<K, Set<V>>();

	public void put(K key, V value){
		if(map.containsKey(key)){
			m.get(key).add(value);
		}else{
			Set<V> newSet = new HashSet<V>();
			newSet.add(value);
			map.put(key, newSet);
		}
	}

	public Collection<V> get(K key){
		return map.get(key);
	}

	public int size(){
		int total = 0;
		for(Set<V> s: map.values()){
			total += s.size();
		}
		return total;
	}

	public void remove(K key, V value){
		if(map.containsKey(key)){
			Set<V> set = map.get(key);
			if(set.contains(value)){
				set.remove(value);
			}
		}
	}
	
	public void remove(K key){
		map.remove(key);
	}
}
