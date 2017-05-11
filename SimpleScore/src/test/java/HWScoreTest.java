import static org.junit.Assert.*;

import org.junit.Test;

public class HWScoreTest {

	@Test(expected=InvalidScopeException.class)
	public void testNegativeHWScore() {
		Score score = new Score(30,30,-1);
	}
	
	public void testLeftBoundaryHWScore(){
		Score score = new Score(30,30,0);
		assertEquals(0,score.getHWScore());
	}
	
	public void testRightBoundaryFinalScore(){
		Score score = new Score(30,30,20);
		assertEquals(0,score.getHWScore());
	}
	
	@Test(expected=InvalidScopeException.class)
	public void testTooBigScore() {
		Score score = new Score(30,30,31);
	}

}
