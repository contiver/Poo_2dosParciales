public class ImmutableSet<T> extends OperableSet<T>{
	private Predicate<T> predicate;
	
	public ImmutableSet(Predicate<T> predicate){
		this.predicate = predicate;
	}

	public boolean contains(T element){
		return predicate.satisfies(element);
	}
}
