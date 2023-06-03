package bhStepDefinition;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class BHHooks {
	
	public static WebDriver driver;
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "/Users/nasser/eclipse-workspace/Jars/chromedriver");
		driver= new ChromeDriver();
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
}
