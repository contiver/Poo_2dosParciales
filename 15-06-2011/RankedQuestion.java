public class RankedQuestion extends Question{
	private int totalAnswers;
	private int rightAnswers;
	
	public RankedQuestion(String caption, double value, boolean answer){
		super.(caption, value, answer);
		totalAnswers = 0;
		rightAnswers = 0;
	}

	public boolean evaluate(boolean answer){
		totalAnswers++;
		boolean evaluation = super.evaluate(answer);
		if(evaluation){
			correctTimes++;
		}
		return evaluation;
	}
	
	public Double getRatio(){
		return ((double)rightAnswers)/totalAnswers;
	}
	
	public boolean wasAnswered(){
		return totalAnswers != 0;
	}
}
