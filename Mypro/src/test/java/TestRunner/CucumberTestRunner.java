package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(tags="@smoke",features= {"src/test/resources/Features/background.feature"},
glue= {"StepDefenations"},
plugin= {"pretty","html:target/htmlreport.html"})
public class CucumberTestRunner extends AbstractTestNGCucumberTests{
	
	
	
	

}
