public InjectableListImpl<T> extends ArrayList<T> implements InjectableList<T>{
	public <S> S injectInto(S seed, F function<S,T> f){
		for(T elem : this){
			seed = f.evaluate(seed, elem);
		}
	return seed;
	}
}
