package TestRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Akash\\New folder\\Kachra2\\src\\test\\java\\Resources\\First.feature",
		glue= {"stepDefinition"},
		plugin = {"pretty", "html:target/cucumber-reports",
	              "json:target/cucumber.json",
	              "rerun:target/rerun.txt"} //Creates a text file with failed scenarios
	       
		)

public class Runner {

}
