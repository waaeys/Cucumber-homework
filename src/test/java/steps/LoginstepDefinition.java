package steps;

import org.openqa.selenium.support.PageFactory;

import Pages.LoginPage;
import Pages.Testbase;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class LoginstepDefinition extends Testbase {
	LoginPage loginPage;
	@Before
	public void beforeRun() {
		loginPage = PageFactory.initElements(driver, LoginPage.class);
	}
	
	@Given("User is on thr codefios login page")
	public void user_is_on_thr_codefios_login_page() { 
	  Testbase.init();
		driver.get("https://codefios.com/ebilling/login");
	}

	@When("user enters username as {string}")
	public void user_enters_username_as(String username) {
	   loginPage = PageFactory.initElements(driver, LoginPage.class);
	   loginPage.enterUserName(username);
	}
	@When ("User enters password as {string}")
	public void User_enters_password(String Password) {
		loginPage.enterPassword(Password);
	}
	@When ("User click on signin button")
	public void userClickOnSigninButton() {
		loginPage.clickSignInButton();
	}

	@Then("user should land on dashboard page")
	public void user_should_land_on_dashboard_page() {
	   String expectedTitle = "Codefios";
	   String actualTitle = loginPage.getPageTitle();
	   Assert.assertEquals("page titles are notmatching!",expectedTitle,actualTitle);
	}
	
}
