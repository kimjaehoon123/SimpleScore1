
public class Grader {
	public String computeGrade(Score s){
		int total = s.getMidScore()+s.getFinalScore()+s.getHWScore();
		String g ="F";
		
		if(total>=80) 
			g = "A";
		else if(total>=70)
			g = "B";
		else if(total>=60)
			g = "C";
		else g = "F";
		
		return g;
	}
}
