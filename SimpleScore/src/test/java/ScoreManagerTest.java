import static org.junit.Assert.*;

import org.junit.Test;

public class ScoreManagerTest {

	@Test
	public void testAddScore() {
		Score score1 = new Score(20,30,25);
		Score score2 = new Score(30,30,30);
		ScoreManager scoreManager = new ScoreManager();
		scoreManager.addScore(1234,score1);
		scoreManager.addScore(2345,score2);
		
//		Score s = scoreManager.getScore(1234);
//		assertEquals(20,s.getMidScore());
//		assertEquals(30,s.getFinalScore());
//		assertEquals(25,s.getHWScore());
		
		scoreManager.setGrade();
		
		assertEquals("B",scoreManager.getGrade(1234));
		assertEquals("A",scoreManager.getGrade(2345));
	}

}
