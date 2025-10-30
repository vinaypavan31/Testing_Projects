package cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
//cucumber ==> testng or junit to run cucumber feature files
@CucumberOptions(features="src/test/java/cucumber",glue="vinay.stepDefinitions",
monochrome=true,plugin= {"html:target/cucumber.html"})
public class TestNGTestRunner extends AbstractTestNGCucumberTests{

}
//tags= "@Regression",
