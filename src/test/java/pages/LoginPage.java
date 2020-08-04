package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BasePage;

public class LoginPage extends BasePage {

	
	public LoginPage(WebDriver driver) {
		
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="userid")
	WebElement userNameEle;

	@FindBy(id="pwd")
	WebElement passWordEle;
	
	@FindBy(id="passwordlogindum")
	WebElement passWordEle2;
	
	
	
	@FindBy(id="signin_submit")
	WebElement submitButton;

	public void login(String userName , String pwd) {
		
		userNameEle.sendKeys(userName);
		passWordEle2.click();
		passWordEle.sendKeys(pwd);
		submitButton.click();
	}
	
	
	
	
	
}
