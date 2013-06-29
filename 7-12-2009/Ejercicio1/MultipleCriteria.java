public class MultipleCriteria<T> implements Criteria<T>{
	private Set<Criteria<T>> criteriaSet = new HashSet<Criteria<T>>();
	
	public void addCriterion(Criteria<T> c){
		criteriaSet.add(c);
	}

	boolean satisfies(T obj){
		for(Criteria<T> c: criteriaSet){
			if(!c.satisfies(obj)){
				return false;
			}
		}
		return true;
	}
}
/* Luego dentro de TestFilterList, en la parte comentada
 * se agrega lo siguiente:

MultipleCriteria<Integer> criteria = new MultipleCriteria<Integer>();
criteria.addCriterion(new Criteria<Integer>(){
	boolean satisfies(Integer i){
		return i % 2 == 0;
	}
});
criteria.addCriterion(new Criteria<Integer>(){
	boolean satisfies(Integer i){
		return i > 9 && i < 100;
	}
});

*/ 
