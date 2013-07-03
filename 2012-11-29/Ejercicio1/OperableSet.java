public abstract class OperableSet<T> implements Set<T>{ 
	public Set<T> include(T element){
		return new UnionSet<T>(this, new ImmutableSet<T>(EqualsPredicate<T>(element)));
	}

	public Set<T> union(Set<T> set){
		return new UnionSet<T>(this, set);
	}
	public Set<T> intersect(Set<T> set){
		return new IntersectionSet<T>(this,set);
	}
}
