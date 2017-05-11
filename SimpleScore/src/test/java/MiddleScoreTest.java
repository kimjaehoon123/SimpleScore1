import static org.junit.Assert.*;

import org.junit.Test;

public class MiddleScoreTest {

	@Test(expected=InvalidScopeException.class)
	public void testNegativeMidScore() {
		Score score = new Score(-1,30,20);
	}
	
	public void testLeftBoundaryMidScore(){
		Score score = new Score(0,30,20);
		assertEquals(0,score.getMidScore());
	}
	
	public void testRightBoundaryMidScore(){
		Score score = new Score(35,30,20);
		assertEquals(0,score.getMidScore());
	}
	
	@Test(expected=InvalidScopeException.class)
	public void testTooBigScore() {
		Score score = new Score(36,30,20);
	}

}
