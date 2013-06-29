public class SpecialIterable<T,S> implements Iterable<S>{
	private Function<T,S> f;
	private List<T> list;

	SpecialIterable(Function<T,S> f, List<T> list){
		this.f = f;
		this.list = list;
	}
	
	public Iterator<S> iterator(){
		return new Iterator<S>(){
			private Iterator<T> it = SpecialIterable.this.list.iterator();
			boolean hasNext(){
				return it.hasNext();
			}
		
			S next(){
				return SpecialIterable.this.f.apply(it.next());
			}

			void remove(){
				it.remove();
			}
		}
	}
}
