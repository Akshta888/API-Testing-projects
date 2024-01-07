package RunnerClass;

import com.intuit.karate.junit5.Karate;

public class RunnerTest {
	
	@Karate.Test
	Karate testone()
	{
		
		//return Karate.run("GetUser").relativeTo(getClass());
	//	return Karate.run("classpath:Features/GetUser.feature");
		return Karate.run("classpath:Features");
		
	}

}
