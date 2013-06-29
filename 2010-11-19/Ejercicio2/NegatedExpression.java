public class NegatedExpression extends Expression{
	private Expression e;
	
	public NegatedExpression(Expression e){
		this.e = e;
	}
	
	public boolean evaluate(){
		return !e.evaluate();
	}
} 
