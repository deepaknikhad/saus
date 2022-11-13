package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Base.TestBase;

 //yahi pom class hai
public class page1Login extends TestBase{
	
	//Object Repository
	@FindBy(xpath = "//div[@class='login_logo']") private WebElement loginLogo;
	@FindBy(xpath = "//div[@class='bot_column']") private WebElement botlogo;
	
	@FindBy(xpath = "//input[@id='user-name']")private WebElement usernameTextbox;
	@FindBy(xpath = "//input[@id='password']")private WebElement passwordTextbox;
	
	@FindBy(xpath = "//input[@id='login-button']")private WebElement loginbutton;
	                                                                                                                                                                                               
  	@FindBy(xpath = "//span[@class='title']")private WebElement productlabel;                               

	//Constructor to initialize the elements of page/current class using this
	
	public void LoginPage1()
	{
	PageFactory.initElements(driver, this);
	}
	
	public page1Login()                                                                                                                                       
	{                                                                                                                                                                                         
		PageFactory.initElements(driver, this);                                                                                                          
	}                                                                                                                                                                                          
	
	public String LoginToApp1()
	{
		usernameTextbox.sendKeys("standard_user");
		passwordTextbox.sendKeys("secret_sauce");
		loginbutton.click();
		return productlabel.getText();
	}
	
	
	public String LoginToApp2() throws Exception
	{
		LoginToApp1();                                                     // pehele link ke baad hi dusara link open hoga na
		return driver.getCurrentUrl();
	}

	public String verifyTitle()                                     //Method to verify the title
	{
	return driver.getTitle();
	}
	
	public boolean verifyLoginLogo1()                       	//Method to verify visibility of login logo
	{
	return loginLogo.isDisplayed();
	}

	public boolean verifyBotLogo2()                          	//Method to verify visibility of bot logo
	{
	return botlogo.isDisplayed();
	}

	public String verifyUrl()                                         	//method to verify the URL
	{
		return driver.getCurrentUrl();
	}

}
