import java.util.HashMap;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ScoreManager {
	HashMap scores = new HashMap<Integer,Score>();
	Grader grader = new Grader();
	
	public void setGrader(Grader g){
		this.grader = g;
	}
	
	public void addScore(int sid,Score s){
		scores.put(sid, s); 
	}
	public Score getScore(int sid){
		return (Score)scores.get(sid);
	}
	
	public void setGrade(){
		Set<Integer> keys = scores.keySet();
		
		java.util.Iterator<Integer> it = keys.iterator();
		
		while(it.hasNext()){
			int key = (Integer) it.next();
			Score score = (Score) scores.get(key);
			score.setGrade(grader.computeGrade(score));
		}
	}
	public String getGrade(int sid){
		Score score = (Score)scores.get(sid);
		String grade = score.getGrade();
		return grade;
	}
	
	
}
