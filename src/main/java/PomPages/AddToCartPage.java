package PomPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;

public class AddToCartPage
{
	//declaration
	//address of + icon
	@FindBy(id = "add")
	private WebElement addbtn;
	
	//address of add to cart button
	@FindBy(xpath = "//button[text()=' Add to Cart'] ")
	private WebElement cartbtn;
	
	//initialization
	public AddToCartPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public WebElement getAddbtn()
	{
		return addbtn;
	}
	
	public void carttocartbtn()
	{
		cartbtn.click();
	}
		
}
