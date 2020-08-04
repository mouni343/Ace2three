package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BasePage;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	//by locators
	By cancel = By.id("wzrk-cancel");
	By ulList= By.id("left-menu");
	By li = By.tagName("li");
	By hList = By.className("menu");
	By hli = By.tagName("li");
	By logout = By.xpath("//a[@class='logout_btn']");
	By playnow = By.xpath("//div[@class='playnow_sml']");
	By referral = By.id("referralCodeID");
	
	
	//web elements
	public WebElement cancelEle() {
		
		return	driver.findElement(cancel);
	}
public WebElement logoutEle() {
		
		return	driver.findElement(logout);
	}
public WebElement referalcodeEle() {
	
	return	driver.findElement(referral);
}


public WebElement playnowEle() {
	
	return	driver.findElement(playnow);
}


	public WebElement menuUlEle() 
	{
		
		return	driver.findElement(ulList);
	}
	public List<WebElement> menuListEle(){
		
		return menuUlEle().findElements(li);
	}
	public WebElement headerUlEle() 
	{
		
		return	driver.findElement(hList);
	}
	
	
	
	public List<WebElement> headerListEle(){
		 return headerUlEle().findElements(hli);
	}
	
	

	
	public void clickCancel()
	{
		waitForElementToAppear(cancel);
		cancelEle().click();
	}
	
	public List<String> menuList(){
		waitForElementToAppear(ulList);
		List<String>  menuListFinal =new ArrayList<String>();
		List<WebElement> list =menuListEle();
		for (WebElement x : list) 
		{
			
			if (x.getText().length()!=0)
			{
				System.out.println("name is " +x.getText());
				menuListFinal.add(x.getText());
				
			}
			
		}
		return menuListFinal;
	}

	public List<String> HeaderList()
	 {
		waitForElementToAppear(hList);	
		List<String>  headerListFinal =new ArrayList<String>();
		List<WebElement> list =headerListEle();
		for (WebElement x : list) 
		{
			
			if (x.getText().length()!=0) 
			{
				System.out.println("name is " +x.getText());
				headerListFinal.add(x.getText());
		
			}
		}
		return headerListFinal;
		
	 }
	public void enterReferralCode(String referral1)
	{
		referalcodeEle().sendKeys(referral1);
		referalcodeEle().click();
		
		}

	
	public void clickplaynow()
	{
		playnowEle().click();	
		}
	
	public void clicklogOut() {	
		
		waitForElementToAppear(logout);
		logoutEle().click();
		
		
	}
	
	}
	
	
	

	
	




	

