public class UnionSet<T> extends OperableSet<T>{
	Set<T> firstSet;
	Set<T> secondSet;

	public UnionSet(Set<T> firstSet, Set<T> secondSet){
		this.firstSet = firstSet;
		this.secondSet = secondSet;
	}

	public boolean contains(T element){
		return firstSet.contains(element) || secondSet.contains(element);
	}
}
