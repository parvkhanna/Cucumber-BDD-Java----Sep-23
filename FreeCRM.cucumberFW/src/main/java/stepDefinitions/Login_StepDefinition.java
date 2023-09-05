package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.CRMLoginPage;

public class Login_StepDefinition {

	static WebDriver driver;
	public CRMLoginPage lp;
	String username = "parvkhanna11@gmail.com";
	String password = "Demo@123";
	String url = "https://freecrm.com/";

	@Before
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		System.out.println("launch the chrome browser");	
	}
	@AfterAll
	public static void after_all()
	{
		driver.close();
		System.out.println("Browser is closed");
	}
	
	@Given("user enters url") public void openHomePg() {
		lp = new CRMLoginPage(driver);
		lp.openHomePage(url);
		System.out.println("Url is entered");
	}

	@And("^title of FreeCRM homePage is displayed$")
	public void verifyHomePg() {
		lp.getHomePageTitle();
		System.out.println("title of FreeCRM HomePage is displayed");
	}

	@And("^user clicked on SignIn Tab to move to sign in page$")
	public void goToSignIn() {
		lp.goTosignInPg();
		System.out.println("user clicked on SignIn Tab to move to sign in page");
	}

	@Then("^user enters username and password$")
	public void enterCredentials() {
		lp.entercredentials(username, password);
		System.out.println("user enters username and password");
	}

	@And("^user clicks on login button$")
	public void login() {
		lp.clickLoginBtn();
		System.out.println("user clicks on login button");
	}

	@Then("^user account page is displayed$")
	public void verifyAccountPage() {
		lp.verifyLogin();
		System.out.println("user account page is displayed");
	}

}
