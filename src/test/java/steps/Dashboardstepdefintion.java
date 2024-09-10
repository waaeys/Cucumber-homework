package steps;

import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import Pages.LoginPage;
import Pages.Testbase;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Dashboardstepdefintion extends Testbase {

	LoginPage loginPage;
	@Test
	public void beforeRun() {
		loginPage = PageFactory.initElements(driver, LoginPage.class);
	}

	@When("user enters username as {string}")
	public void user_enters_username_as(String username) {
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		   loginPage.enterUserName(username);
	}

	@When("User enters password as {string}")
	public void User_enters_password(String Password) {
	   loginPage.enterPassword(Password);
	}

	@When("User click on signin button")
	public void userClickOnSigninButton() {
		loginPage.clickSignInButton();
	}

	@Then("user should land on dashboard page")
	public void user_should_land_on_dashboard_page() {

	}
}
