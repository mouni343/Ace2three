package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends BaseTest {

	  @Test
	    public void login() {
	        LoginPage lp = new LoginPage(getDriver());
	        lp.login("priya027438", "ace2three");
	        HomePage hp = new HomePage(getDriver());
	        hp.clickCancel();
	        
	    }
}
