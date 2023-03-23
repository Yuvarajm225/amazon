package AmazonStepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import AmazonTestRunner.AmazonTestRun;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonStepDef {
	public static WebDriver driver = AmazonTestRun.driver;

	@Given("user Launches The Web Application")
	public void user_launches_the_web_application() {
		driver.get("https://www.amazon.in/");
	
//		@When("user Select Required Category Tab")
//		public void user_select_required_category_tab() {
//			WebElement mob = driver.findElement(By.linkText("Mobiles"));
//			mob.click()
//		}
//		@When("user Select A Product")
//		public void user_select_a_product() {
//			WebElement iphone = driver.findElement(By.xpath("//img[@alt='iPhone 14 Pro']"));
//			iphone.click();
//		}
//		@Then("it Navigates To Product Page")
//		public void it_navigates_to_product_page() {
//		}	
		
	}

}
