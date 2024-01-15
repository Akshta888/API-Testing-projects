package Users;

import com.intuit.karate.*;
import com.intuit.karate.junit5.Karate;

public class RunnerTest {

		
		@Karate.Test
		Karate getpetidAPITest() {
			return Karate.run("CreateUser").relativeTo(getClass());
							}
		

}
