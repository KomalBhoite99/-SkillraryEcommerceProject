package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingcatogaryPage {
	//decalration
	//address of seleniun training
	@FindBy(xpath="(//a[text()='Selenium Training'])[2]")
     private WebElement  seleniumtraining;
	//addres  of my cart
	@FindBy(id="cartArea")
	private WebElement carttab;
	//addresss of facebook
	@FindBy(xpath="(//i[@class='fa fa-facebook'])[2]")
	private WebElement facebook;

	//initilization
		public  TestingcatogaryPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);	
		}
		//utilization
		public WebElement getSeleniumtraining()
		{
			return seleniumtraining;
			
		}
		public WebElement getCarttab()
		{
			return carttab;
			
		}
		public void facebookicon()
		{
			facebook.click();
			
		}
}
