public class InterserctionSet<T> extends OperableSet<T>{
	private Set<T> firstSet;
	private Set<T> secondSet;

	public InterserctionSet(Set<T> firstSet, Set<T> secondSet){
		this.firstSet = firstSet;
		this.secondSet = secondSet;
	}

	public boolean contains(T elem){
		return firstSet.contains(elem) && secondSet.contains(elem);
	}
}
