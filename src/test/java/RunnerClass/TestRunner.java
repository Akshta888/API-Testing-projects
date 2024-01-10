package RunnerClass;


import com.intuit.karate.Results;
import com.intuit.karate.Runner;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRunner {
	
	@Test
	public static void testParallel() {
		
		Results results = Runner.path("classpath:Features").tags("@Regression").parallel(1);
		assertEquals(0,results.getFailCount(),results.getErrorMessages());
		
	}
	
	public static void main(String[] args)
	{
		
		testParallel();
		//Runner.path("src/test/java/Features").parallel(1);
		
	}

	
}



