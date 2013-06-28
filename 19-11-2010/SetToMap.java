public interface SetToMap<T> extends Set<T>{
	public Map<S,T> toMap(Function<S,T> f);
}
