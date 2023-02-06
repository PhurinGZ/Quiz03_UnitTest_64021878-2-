import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

	QuizOneJuni) obj;

public class AssertEqualsJunit {

	@Before
	public void setUp() {
		obj = new QuizOneJunit();
	}
	
	@After
	
	
	
	@Test
	//	1.Square Area
	public void test01() {
		assertEquals(obj.square(5), 25);
	}
	@Test
	// 2. Number of "a" and "A" letters
	public void test02() {
		assertEquals(obj.countLetterA("What the Fack AHH"), 3);
	}
	@Test
	//3. Two Letters are the same
	public void test03() {
		assertEquals(obj.checkTwoLetter("TA"), true);
	}
	
	
	
}
