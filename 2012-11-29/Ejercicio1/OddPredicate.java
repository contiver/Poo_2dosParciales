/* Tener en cuenta que la clase es OddPredicate en vez de
 * EvenPredicate por que el enunciado estaba mal. Notar que el
 * 4to y 5to println retornan false y true respectivamente,
 * mientras que si fuera even, debería ser a la inversa.
 */

public class OddPredicate<Integer> implements Predicate<Integer>{
	public boolean satisfies(Integer i){
		return i % 2 != 0;
	}
}
	
