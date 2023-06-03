package runners;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="saProjectFeatures",
				glue="saStepDefinition",
				plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json",
				"junit:target/cucumber-reports/Cucumber.xml",
				"html:target/cucumber-reports"})
public class SARunner {

}
