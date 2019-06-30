package steps;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import runner.Hooks;


public class StepDef {
	
	@Given("I have opened {string}")
	public void i_have_opened(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("I have opened ");
	}

	@When("I enter username as {string}")
	public void i_enter_username_as(String string) {
		System.out.println("I enter username as");
	}

	@When("Password as {string}")
	public void password_as(String string) {
		System.out.println("I enter Password as");
		Assert.fail("Failed");
	}

	@When("check login image")
	public void check_login_image() {
		System.out.println("check login image");
	}

	@When("Click on Login")
	public void click_on_Login() {
		System.out.println("Click on Login");
	}

	@Then("I should successfully login to application")
	public void i_should_successfully_login_to_application() {
		System.out.println("I should successfully login to application");
	}
	@Given("I logged into {string}")
	public void i_logged_into(String string) {
		System.out.println("I logged into ");
	}

	@When("I click on account information")
	public void i_click_on_account_information() {
		System.out.println("I click on account information ");
	}

	@Then("Account balance should display")
	public void account_balance_should_display() {
		System.out.println("Account balance should display");
	}

	@When("I click on logout")
	public void i_click_on_logout() {
		System.out.println("I click on logout");
	}

	@Then("logout should be successful")
	public void logout_should_be_successful() {
		System.out.println("logout should be successful");
	}
	

}
