package Scripts;
import org.testng.annotations.Test;
import PomPages.SkillraryDemoLoginPage;
import PomPages.SkillraryLoginPage;
import PomPages.AddToCartPage;
import GenericLibrary.BaseClass;

public class TestCase1 extends BaseClass
{

	@Test
	public void tcl()
	{
		SkillraryLoginPage s = new SkillraryLoginPage(driver);
		s.gearsbutton();
		s.skillrarydemoapplication();
		utilies.switchingtabs(driver);
		SkillraryDemoLoginPage  sd = new SkillraryDemoLoginPage(driver) ;
		utilies.mouseHover(driver, sd.getCoursetab());
		sd.Seleniumtrainingtab();
		AddToCartPage d = new AddToCartPage(driver);
		utilies.doubleClick(driver, d.getAddbtn());
		d.carttocartbtn();
		utilies.alertPopup(driver);
		
	}
	
}
