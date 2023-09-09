package Scripts;

import org.testng.annotations.Test;
import PomPages.SkillraryLoginPage;
import PomPages.SkillraryDemoLoginPage;
import PomPages.AddtoCartPage;

import GenericLibrary.BaseClass;

public class TestCase1  extends BaseClass {
	@Test
	public void tc1() throws InterruptedException
	{
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.greasbutton();
		s.skillrarydemoapplication();
		utilies.switchingtabs(driver);
		SkillraryDemoLoginPage sd=new SkillraryDemoLoginPage(driver);
		utilies.mouseHover(driver,sd.getCousretab());
		sd.seleniumtrainingtab();
		
		
		AddtoCartPage ap=new AddtoCartPage(driver);
		utilies.doubleClick(driver, ap.getAddbtn());
		ap.carttocartbtn();
		utilies.alertPopup(driver);
		
		
		
		
	}

}

