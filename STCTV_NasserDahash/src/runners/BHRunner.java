package runners;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="bhProjectFeatures",
				glue="bhStepDefinition",
				plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json",
						"junit:target/cucumber-reports/Cucumber.xml",
						"html:target/cucumber-reports"})
public class BHRunner {

}
