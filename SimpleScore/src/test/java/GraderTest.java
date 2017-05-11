import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class GraderTest {

	private String expected;
	private int m;
	private int f;
	private int h;
	
	@Parameters
	public static Collection getParameters(){
		return Arrays.asList(new Object[][]{
			{"F",30,20,9},
			{"C",20,30,19},
			{"A",30,30,29},
			{"A",35,35,30},
		});
	}
	
	public GraderTest(String expected,int m, int f, int h){
		this.expected = expected;
		this.m = m;
		this.f = f;
		this.h = h;
	}
	
	@Test
	public void testComputeGrade() {
		Grader grader = new Grader();
		String grade = grader.computeGrade(new Score(m,f,h));
		assertEquals(expected,grade);
	}

}
