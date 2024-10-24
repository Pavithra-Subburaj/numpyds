package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = { "src/test/resources/Features"},//location of feature files
		glue={"stepDefinition"} //location of step definition
		)

public class TestRunner {


}
