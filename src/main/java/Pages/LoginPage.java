package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;

public class LoginPage extends Testbase {

   
	WebDriver driver;

public LoginPage(WebDriver driver) {
	this.driver = driver;
}

	@FindBy(how = How.XPATH, using = "//input[@id='user_name']")
	WebElement UserNmae;
	@FindBy(how = How.XPATH, using = "//input[@id='password']")
	WebElement Password;
	@FindBy(how = How.XPATH, using = "//button[@id='login_submit']")
	WebElement SigninButton;


	 public void enterUserName(String userName) {
	     UserNmae.sendKeys(userName);
	        try {
	            Thread.sleep(3000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }

	    public void enterPassword(String password) {
	        Password.sendKeys(password);
	        try {
	            Thread.sleep(3000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }

	    public void clickSignInButton() {
	        SigninButton.click();
	        try {
	            Thread.sleep(3000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }

		public String getPageTitle() {
			// TODO Auto-generated method stub
			return driver.getTitle();
		}
	
		
		
	
		
	}
