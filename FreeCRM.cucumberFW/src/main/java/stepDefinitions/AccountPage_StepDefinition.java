package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AccountPage;
import pages.CRMLoginPage;

public class AccountPage_StepDefinition {
	WebDriver driver;
	CRMLoginPage lp;
	AccountPage ap;
	@When("^user Home page is displayed$")
	public void verifyAccountPage() {
		lp = new CRMLoginPage(driver);
		lp.verifyLogin();
		System.out.println("user Home page is displayed");
	}

	@Then("click on calender option in the menu")
	public void openCalendar() {
	  ap  = new AccountPage(driver);
	  ap.gotToCalendar();
	  System.out.println("Calendar menu is clicked");
	}

	@Then("calendar page should be displayed")
	public void verifyCalendar() {
		ap.verifyCalendarPage();
		System.out.println("Calendar page is displayed");
	}


}
