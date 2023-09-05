package pages;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountPage {

	WebDriver driver;
    WebDriverWait wait;
    JavascriptExecutor js;
    
    public AccountPage(WebDriver driver)
    {
    	this.driver = driver;
    	PageFactory.initElements(driver,this);
    }
	@FindBy(xpath = "//i[@class='calendar icon']")
	private WebElement calendarIcon; 
	@FindBy(xpath = "//span[@class='selectable ']")
	private WebElement calendarText;
	public void gotToCalendar()
	{
		calendarIcon.click();
	}
	public void verifyCalendarPage()
	{
		String actual = calendarText.getText();
		Assert.assertEquals(actual,"Calendar");
	}
	
}
