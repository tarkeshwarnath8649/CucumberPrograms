package MyHooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksTest {
	
	@Before
	public void setUp() {
		System.out.println("Before every scenario_Before1");
	}
	
	@After
	public void tearDown() {
		System.out.println("After every scenario_After1");
	}

}
