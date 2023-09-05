package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CRMLoginPage {

	WebDriver driver;
	WebDriverWait wait;
	@FindBy(xpath = "//a[normalize-space()='Sign Up']")
	private WebElement tabSignUp;
	
	@FindBy(xpath = "//input[@placeholder='Email']")
	private WebElement tfusername;
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	private WebElement tfpassword;
	
	@FindBy(xpath = "//div[@class='ui fluid large blue submit button']")
	private WebElement btnLogin;
	

	 public CRMLoginPage(WebDriver driver)
	    {
	    	this.driver = driver;
	    	PageFactory.initElements(driver, this);
	    }
	 public void openHomePage(String url)
	 {
		 driver.get(url);
	 }
	 public void getHomePageTitle()
	 {
		 String HomepageTitle = driver.getTitle();
		 Assert.assertEquals("Free CRM software for customer relationship management, sales, and support.", HomepageTitle);
	 }
	 public void goTosignInPg()
	 {
		 tabSignUp.click();
	 }
	 
	 public void entercredentials(String username,String password)
	 {
		 tfusername.sendKeys(username);
		 tfpassword.sendKeys(password);
	 }
	 public void clickLoginBtn()
	 {
		 btnLogin.click();
	 }
	 public void verifyLogin()
	 {
		 String AccountPageTitle = driver.getTitle();
		 Assert.assertEquals("Cogmento CRM",AccountPageTitle);
	 }
}
