public class Expression{
	/* Luego del código en el pdf
	   se agrega lo siguiente */
	
	public NegatedExpression not(){
		return new NegatedExpression(this);
	}

	public OrExpression or(Expression e){
		return new OrExpression(this, e);
	}

	public AndExpression and(Expression e){
		return new AndExpression(this, e);
	}
}
