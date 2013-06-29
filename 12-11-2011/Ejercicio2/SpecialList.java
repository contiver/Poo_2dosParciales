public interface SpecialList<T> extends List<T>{
	public <S> Iterable<S> iterable(Function<T,S> f);
}
