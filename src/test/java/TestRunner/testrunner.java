package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= {"loginpage.feature"},
			
		glue= {"loginpage.java"},
		
		dryRun= false,
		
		monochrome= true
		)

public class testrunner {

}

