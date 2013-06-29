public class ConcatSimpleList<T> extends ArrayList<T> implements SimpleList<T>{
	private SimpleList<T> list1;
	private SimpleList<T> list2;

	public ConcatSimpleList(SimpleList<T> list1; SimpleList<T> list2){
		this.list1 = list1;
		this.list2 = list2;
	}

	public void append(T element){
		list2.add(element);
	}
	
	public Iterator<T> iterator(){
		return new Iterator<T>(){
			private Iterator<T> it1 = list1.iterator();
			private Iterator<T> it2 = list2.iterator();
			private Iterator<T> currentIt = it1;
			private boolean removeIsValid = false;
			
			public boolean hasNext(){
				if(currentIt.hasNext()){
					return true;
				}
				if(currentIt == it1){
					currentIt = it2;
					return hasNext();
				}
				return false;
			}
			
			public T next(){
				if(!hasNext()){
					throw new NoSuchElementException();
				}
				removeIsValid = true;
				return currentIt.next();
			}

			public  void remove(){
				if(!removeIsValid){
					throw new IllegalStateException();
				}
				currentIt.remove();
				removeIsValid = false;
			}
		}
	}
}	
