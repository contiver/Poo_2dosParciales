public class IgnoreNullsList<T> extends ArrayList<T> {
	public Iterator<T> ignoreNullsIterator(){
		return new Iterator<T>(){
			private int currentIndex = 0;
			private int lastNextIndex = 0;
			private boolean removeIsValid = false;
			private List<T> list = IgnoreNullsList.this;
			
			public boolean hasNext(){
				while(currentIndex < list.size() && list.get(currentIndex) == null){
					currentIndex++;
				}
				return currentIndex != list.size();
			}

			public T next(){
				if(hasNext()){
					removeIsValid = true;
					lastNextIndex = currentIndex;
					currentIndex++;
					return list.get(lastNextIndex);
				}
				throw new NoSuchElementException();
			}
			
			public void remove(){
				if(!removeIsValid){
					throw new IllegalStateException();
				}
				list.remove(lastNextIndex);
				removeIsValid = false;
			}
		};
	}
}
					 
