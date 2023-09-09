package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryLoginPage {
	//Declaration
	//address of gears
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearbtn;
	//address of skillrary demo page
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement skillrarydemopage;
	
	//address of search text  field
	@FindBy(xpath="//input[@name='q']")
	private WebElement searchtb;
	
	//address for search icon
	@FindBy(xpath="//input[@value='go']")
	private WebElement  searchbtn;

	
	//initilization
	public  SkillraryLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	//utilization
	public void greasbutton()
	{
		gearbtn.click();
	}
	public void skillrarydemoapplication()
	{
		skillrarydemopage.click();
	}
	public void searchTextbox(String name)
	{
		searchtb.sendKeys(name);
	}
	public void gobutton()
	{
		searchbtn.click();
	}


}
