public class AndExpression extends Expression{
	private Expression e1;
	private Expression e2;

	public AndExpression(Expression e1, Expression e2){
		this.e1 = e1;
		this.e2 = e2;
	}
	
	public boolean evaluate(){
		return e1.evaluate() && e2.evaluate();
	}
}
