package Scripts;
import org.testng.annotations.Test;
import PomPages.SkillraryLoginPage;
import PomPages.SkillraryDemoLoginPage;
import PomPages.AddtoCartPage;
import PomPages.TestingcatogaryPage;
import GenericLibrary.BaseClass;
public class TestCase2 extends BaseClass {
	@Test
	public void tc2() throws Throwable
	{
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.greasbutton();
		s.skillrarydemoapplication();
		utilies.switchingtabs(driver);
		SkillraryDemoLoginPage sd=new SkillraryDemoLoginPage(driver);
		
	
		utilies.dropDown(sd.getCoursedd(),pdata.getPropertydata("courseadd"));
		Thread.sleep(2000);
		TestingcatogaryPage t=new TestingcatogaryPage(driver);
		utilies.dragAnddrop(driver, t.getSeleniumtraining(), t.getCarttab());
	}

}
