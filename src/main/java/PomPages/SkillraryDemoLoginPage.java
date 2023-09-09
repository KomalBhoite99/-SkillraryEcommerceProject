package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoLoginPage {
	//declaration
	//address of course webelement
	@FindBy(id="course")
	private WebElement cousretab;
	
	//address of selenium training
	@FindBy(xpath="(//a[text()='Selenium Training'])[1]")
	private WebElement seleniumtraining;
	
	//address of select catogary
	@FindBy(name="addresstype")
	private WebElement coursedd;
	
	//initilization
	public SkillraryDemoLoginPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);	
	}
	//utilization

	public WebElement getCousretab() {
		return cousretab;
	}

	public void seleniumtrainingtab()
	{
		seleniumtraining.click();
	}

	public WebElement getCoursedd() {
		return coursedd;
	}
}
