package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryLoginPage 
{
                    //Declaration 
//Address of Gears
@FindBy(xpath="//a[text()=' GEARS ']")
private WebElement gearbtn;

//address of skillrary demo
@FindBy(xpath="(//a[text()=' SkillRary Demo APP']) [2]")
private WebElement skillrarydemoapp;

//address of searchtab
@FindBy(xpath="//input[@type='search']")
private WebElement searchtab;

//address of searchicon
@FindBy(xpath="//input[@value='go']")
private WebElement searchbtn;


                   //Initialization
public SkillraryLoginPage (WebDriver driver)
{
PageFactory.initElements(driver,this);
}

                   //Utilization
public void gearsbutton()
{
	gearbtn.click();
}

public void skillrarydemoapplication()
{
	skillrarydemoapp.click();
}

public void searchtextTab(String name)
{
	searchtab.sendKeys(name);
}

public void gobutton()
{
	searchbtn.click();
}
	
}
