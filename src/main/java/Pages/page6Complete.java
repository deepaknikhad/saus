package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class page6Complete extends TestBase {

	
	@FindBy(xpath = "//div[@class='app_logo']")private WebElement swaglabslogo;
	@FindBy(xpath = "//span[text()='Checkout: Complete!']")private WebElement checkoutcompletelabel;
	@FindBy(xpath = "//h2[@class='complete-header']")private WebElement thankyoulabel;
	@FindBy(xpath = "//div[@class='complete-text']")private WebElement completelabel;
	@FindBy(xpath = "//img[@class='pony_express']")private WebElement ponylogo;
	@FindBy(xpath = "//button[@id='react-burger-menu-btn']")private WebElement burgerbtn;
	@FindBy(xpath = "//a[@id='logout_sidebar_link']")private WebElement logoutbtn;

	@FindBy(xpath = "//div[@class='app_logo']") private WebElement swaglogo;
	@FindBy(xpath = "//li[@class='social_twitter']") private WebElement twitterLogo;
	@FindBy(xpath = "//li[@class='social_facebook']") private WebElement facebookLogo;
	@FindBy(xpath = "//li[@class='social_linkedin']") private WebElement linkedlinLogo;
	@FindBy(xpath = "//a[@class='shopping_cart_link']") private WebElement cartlogo;
	@FindBy(xpath = "//img[@alt='Swag Bot Footer']") private WebElement bigLogo;
	@FindBy(xpath = "//div[@class='footer_copy']")private WebElement footerlabel;

	
	//constructor
	public page6Complete()
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyswaglabslogo6()
	{
		return swaglabslogo.isDisplayed();
	}
	
	public String verifycheckoutcompletelabel()
	{
		return checkoutcompletelabel.getText();
	}
	
	public String verifythankyoulabel()
	{
		return thankyoulabel.getText();
	}
	
	public String verifycompletelabel()
	{
		return completelabel.getText();
	}
	
	public boolean verifyvisibilityofponylogo()
	{
		return ponylogo.isDisplayed();
	}
	
	public void verifyburgerbtn()
	{
		burgerbtn.click();
	}

	public void verifylogoutbtn()
	{
	     logoutbtn.click();
	}

	public String verifyfooterlabel()
	{
		return footerlabel.getText();
	}

	public boolean verifySwaglogo6()
	{
	return	swaglogo.isDisplayed();
	}
	
	public boolean verifybiglogo6()
	{
	return	bigLogo.isDisplayed();
	}
	
	public boolean verifycartlogo6()
	{
	return	cartlogo.isDisplayed();
	}
	
	public boolean verifytwitterlogo6()
	{
		return twitterLogo.isDisplayed();
	}
	
	public boolean verifyfacebooklogo6()
	{
		return facebookLogo.isDisplayed();
	}
	
	public boolean verifylinkedlinlogo6()
	{
		return linkedlinLogo.isDisplayed();
	}
}
