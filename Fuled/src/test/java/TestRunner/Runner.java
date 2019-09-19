package TestRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Akash\\New folder\\Fuled\\Resources\\Jabong.feature",
		glue= {"stepDefinition"}
		)

public class Runner {
	
}
