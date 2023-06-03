package bhStepDefinition;
import static org.testng.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class BHSteps {

	WebDriver driver=BHHooks.driver;

	@Given("The customer in the main subscription page")
	public void Customer_on_Subscription_page() {
		driver.get("https://subscribe.stctv.com/");
	}
	@When("The customer go to BH version")
	public void Customer_Go_To_Package_details_BH () {
		driver.findElement(By.id("translation-btn")).click();
		driver.findElement(By.id("country-name")).click();
		driver.findElement(By.id("bh-contry-lable")).click();
	}
	
	@Then ("The customer should be able to view Package name")
	public void Customer_Go_To_Package_name_BH () {
		String ActualPackageLite=driver.findElement(By.id("name-lite")).getText();
		String ExpectedPackageLite="LITE";
		assertEquals(ExpectedPackageLite, ActualPackageLite);
		
		String ActualPackageClassic=driver.findElement(By.id("name-classic")).getText();
		String ExpectedPackageClassic="CLASSIC";
		assertEquals(ExpectedPackageClassic, ActualPackageClassic);
		
		String ActualPackagePremium=driver.findElement(By.id("name-premium")).getText();
		String ExpectedPackagePremium="PREMIUM";
		assertEquals(ExpectedPackagePremium, ActualPackagePremium);
		
	}
	@Then ("The customer should be able to view Package price")
	public void Customer_Go_To_Package_Price_BH () {
		String ActualPackagePriceLite=driver.findElement(By.id("currency-lite")).getText();
		String ExpectedPackagePriceLite="2 BHD/month";
		assertEquals(ExpectedPackagePriceLite, ActualPackagePriceLite);
		
		String ActualPackagePriceClassic=driver.findElement(By.id("currency-classic")).getText();
		String ExpectedPackagePriceClassic="3 BHD/month";
		assertEquals(ExpectedPackagePriceClassic, ActualPackagePriceClassic);
		
		String ActualPackagePricePremium=driver.findElement(By.id("currency-premium")).getText();
		String PackagePricePremium="6 BHD/month";
		assertEquals(PackagePricePremium, ActualPackagePricePremium);
	}
	}

