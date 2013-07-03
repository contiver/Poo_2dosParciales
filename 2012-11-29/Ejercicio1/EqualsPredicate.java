public class EqualsPredicate<T> implements Predicate<T>{
	private T predicateElem;

	public EqualsPredicate(T element){
		this.element = element;
	}

	public boolean satisfies(T elem){
		return element.equals(elem);
	}
}
