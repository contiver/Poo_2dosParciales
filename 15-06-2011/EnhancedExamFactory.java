public class EnhancedExamFactory extends ExamFactory{
	public void printRanking(){
		Set<RankedQuestion> sortedQuestions = new 
			TreeSet<RankedQuestion>(new Comparator<RankedQuestion>(){
			public int compare(RankedQuestion rq1, RankedQuestion rq2){
				return rq1.getRatio().compareTo(rq2.getRatio());
			}
		});
		for(Question q: this.getQuestions(){
			if(((RankedQuestion)q).wasAnswered()){
				sortedQuestions.add(q);
			}
		}
		for(RankedQuestion rq: sortedQuestions){
			System.out.println(rq.getCaption() + "(" + rq.getCaption() + ")");
		}
	}

	public void addQuestion(String caption, double value, boolean answer){
		add(new RankedQuestion(caption, value, answer);
	}
}
