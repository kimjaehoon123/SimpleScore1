
public class Score {
	private int m;
	private int f;
	private int h;
	private String g;
	
	public Score(int m,int f, int h){
		if(m<0||m>35) throw new InvalidScopeException();
		if(f<0||f>35) throw new InvalidScopeException();
		if(h<0||h>30) throw new InvalidScopeException();
		this.m = m;
		this.f = f;
		this.h = h;
	}
	
	public String getGrade(){
		return g;
	}
	public void setGrade(String g){
		this.g= g;
	}
	
	public int getMidScore(){
		return m;
	}
	
	public int getFinalScore(){
		return f;
	}
	
	public int getHWScore(){
		return h;
	}
}
