package steps;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import runner.Hooks;

public class stepsNewDef {
	public WebDriver driver;
	public Actions action;
	public stepsNewDef(){

		this.driver = Hooks.driver;
	    action = new Actions(driver);
		}
	@Given("user navigate to {string}")
	public void user_navigate_to(String string) {
		driver.get(string);
		System.out.println("user navigate to" +string);
		try {
		driver.findElement(By.xpath("//img[@class='popupCloseButton']")).click();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

	@Given("MouseHover on Products")
	public void mousehover_on_Products() {
		System.out.println("MouseHover on Products");
		WebElement elePrdcts = driver.findElement(By.xpath("//a[@class='mainlink'][text()='Products']"));
				 
        action.moveToElement(elePrdcts).build().perform(); 
        
      
	}

	@Given("MouseHover on Account & Deposits")
	public void mousehover_on_Account_Deposits() {
		WebElement eleAcntDep = driver.findElement(By.linkText("Accounts & Deposits"));
        action.moveToElement(eleAcntDep).build().perform();
		System.out.println("MouseHover on Account & Deposits");
	}

	@Given("Click on Savings Account")
	public void click_on_Savings_Account() {
		System.out.println("Click on Savings Account");
		  driver.findElement(By.linkText("Savings Account")).click();
	}

	@Then("{string} savings accounts should display")
	public void savings_accounts_should_display(String string) {
		List<WebElement> elms = driver.findElements(By.xpath("//h2"));
		boolean blnflg = false;
		for(WebElement ele: elms) {
			System.out.println(ele.getText());
			if(ele.getText().equals(string)){
				System.out.println(string+"savings accounts should displayed");
				 blnflg = true;
				break;
			}
		}
		if(blnflg == false) {
			Assert.fail(string+"Text not found");
		}else {
			System.out.println(string+"Text found");
		}
		
	}
	@Then("Close browser")
	public void close_Browser() {	
		System.out.println("Browser close");
	}
	
}
