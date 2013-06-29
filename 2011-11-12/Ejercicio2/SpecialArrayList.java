public class SpecialArrayList<T> extends ArrayList<T> implements SpecialList<T>{
	public <S> Iterable<S> iterable(Function<T,S> f){
		return new SpecialIterable<T,S>(f, this);
	}
}
