public class Empty<T> implements List<T>{
	public boolean isEmpty(){
		return true;
	}
	
	public boolean contains(T element){
		return false;
	}

	public T head(){
		throw new NoSuchElementException();
	}

	public List<T> tail(){
		throw new NoSuchElementException();
	}

	public int size(){
		return 0;
	}
}
