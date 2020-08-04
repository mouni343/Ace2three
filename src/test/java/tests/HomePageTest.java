package tests;

import java.util.List;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;
import pages.LoginPage;


public class HomePageTest extends BaseTest {
	  @Test
	    public void validateMenu() throws InterruptedException {
		    LoginPage lp = new LoginPage(getDriver());
	        lp.login("priya027438", "ace2three");
	        HomePage hp = new HomePage(getDriver());
	        hp.clickCancel();
	        hp.menuList();
	        hp.HeaderList();
	       // hp.clickplaynow();
	        hp.enterReferralCode("xyzzz");
	       // hp.clicklogOut();
	        
	        
	    }
	
	
}
