package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(monochrome=true,features = "src/test/java/flipbooking/booking.feature", 
glue = "")
public class testrunner{
	
}	
