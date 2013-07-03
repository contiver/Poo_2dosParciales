public class OneToTenPredicate<Integer> implements Predicate<Integer>{
	public boolean satisfies(Integer i){
		return 0 < i && i < 11;
	}
}
