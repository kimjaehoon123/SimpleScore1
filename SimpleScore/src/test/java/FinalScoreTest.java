import static org.junit.Assert.*;

import org.junit.Test;

public class FinalScoreTest {

	@Test(expected=InvalidScopeException.class)
	public void testNegativeFinalScore() {
		Score score = new Score(30,-1,20);
	}
	
	public void testLeftBoundaryFinalScore(){
		Score score = new Score(30,0,20);
		assertEquals(0,score.getFinalScore());
	}
	
	public void testRightBoundaryFinalScore(){
		Score score = new Score(30,35,20);
		assertEquals(0,score.getFinalScore());
	}
	
	@Test(expected=InvalidScopeException.class)
	public void testTooBigScore() {
		Score score = new Score(30,36,20);
	}
}
