/* Punto (a) del primer ejercicio */

public class SetToMapImpl<T> extends HashMap<T> implements SetToMap<T>{
	public <S> Map<S,T> toMap(Function<S,T> f){
		Map<S,T> map = new HashMap<S,T>();
		for(T element: this){
			S key = f.evaluate(element);
			if(map.containsKey(key)){
				throw new IllegalStateException();
			}
			map.put(key, element);
		}
		return map;
	}
}
