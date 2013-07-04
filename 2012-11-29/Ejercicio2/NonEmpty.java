public class NonEmpty<T> implements List<T>{
	private T head;
	private List<T> tail;
	
	public NonEmpty(T head, List<T> tail){
		this.head = head;
		this.tail = tail;
	}

	public boolean isEmpty(){
		return false;
	}

	public T head(){
		return head;
	}

	public List<T> tail(){
		return tail;
	}

	public int size(){
		return 1 + tail.size();
	}

	public boolean contains(T element){
		return head.equals(element) || tail.contains(element);
	}
}
