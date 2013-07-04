public class RankIterable<K,V> extends RankMap<K,V>{
	public Iterator<K> iterator(int minRank){
		return new RankIterator(minRank);
	}

	private class RankIterator implements Iterator<K>{
		private Iterator<Map.Entry<K, RankEntry>> mapIt = getMap().entrySet().iterator();
		private Map.Entry<K, RankEntry> currentMapEntry = null;
		private Map.Entry<K, RankEntry> lastMapEntry = null;
		private int minRank;

		public RankIterator(int minRank){
			this.minRank = minRank;
		}

		public boolean hasNext(){
			if(currentMapEntry != null){
				return true;
			}
			lastMapEntry = null;
			while(mapIt.hasNext()){
				currentMapEntry = mapIt.next();
				if(currentMapEntry.getValue().getRank() >= minRank)
					return true;
			}
			currentMapEntry = null;
			return false;
		}

		public K next(){
			if(!hasNext()){
				throw new NoSuchElementException();
			}
			lastMapEntry = currentMapEntry;
			currentMapEntry = null;
			return lastMapEntry.getKey();
		}

		public void remove(){
			if(lastMapEntry == null){
				throw new IllegalStateException();
			}
			mapIt.remove();
		}
	}
}
