public class RankHashMap<K,V> implements RankMap<K,V>{
	private Map<K,RankEntry> map = new HashMap<K, RankEntry>();
	
	public void put(K key, V value){
		if(map.containsKey(key)){
			map.get(key).setValue(value);
		}else{
			map.put(key, new RankEntry(value));
		}
	}

	public V get(K key){
		if(map.containsKey(key)){
			return map.get(key).getValue();
		}
		return null;
	}

	public int getRank(K key){
		if(map.containsKey(key){
			return 	map.get(key).getRank();
		}
		throw new NoSuchKeyException();
	}

	public Date getLastAccess(K key){
		if(map.containsKey(key)){
			return map.get(key).getLastAccess();
		}
		throw new NoSuchKeyException();	
	}
	
	public void remove(K key){
		map.remove(key);
	}

	public List<K> getHigher(int rank){
		List<K> answer = new ArrayList<K>();
		for(K key: map.keySey()){
			if(map.get(key).getRank() >= rank){
				answer.add(key);
			}
		}
		return answer;
	}

	private class RankEntry{
		private V value;
		private int ranking;
		private Date lastAccess;
	
		public void setValue(V value){
			this.value = value;
		}

		public RankEntry(V value){
			this.value = value;
			this.ranking = 0;
			this.lastAccess = null;
		}

		public V getValue(){
			ranking++;
			lastAccess = new Date();
			return value;
		}
	
		public int getRank(){
			return ranking;
		}
	
		public Date getLastAccess(){
			return lastAccess;
		}
	}	
