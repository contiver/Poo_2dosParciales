public interface InjectableList<T> implements List<T>{
	public <S> injectInto(S seed, Function<S,T> f);
}
