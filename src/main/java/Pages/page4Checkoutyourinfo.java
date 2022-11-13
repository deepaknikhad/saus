package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class page4Checkoutyourinfo extends TestBase{

	@FindBy(xpath = "//input[@id='first-name']")private WebElement firstnametextbox;
	@FindBy(xpath = "//input[@id='last-name']")private WebElement lastnametextbox;
	@FindBy(xpath = "//input[@id='postal-code']")private WebElement pincodetextbox;
	@FindBy(xpath = "//input[@id='continue']")private WebElement continuebtn;
	@FindBy(xpath = "//span[text()='Checkout: Your Information']")private WebElement checkouttext;

	@FindBy(xpath = "//div[@class='app_logo']") private WebElement swaglogo;
	@FindBy(xpath = "//li[@class='social_twitter']") private WebElement twitterLogo;
	@FindBy(xpath = "//li[@class='social_facebook']") private WebElement facebookLogo;
	@FindBy(xpath = "//li[@class='social_linkedin']") private WebElement linkedlinLogo;
	@FindBy(xpath = "//a[@class='shopping_cart_link']") private WebElement cartlogo;
	@FindBy(xpath = "//img[@alt='Swag Bot Footer']") private WebElement bigLogo;
	@FindBy(xpath = "//div[@class='footer_copy']")private WebElement footerlabel;
	
	@FindBy(xpath = "//span[text()='Checkout: Overview']")private WebElement overviewtext;
	
	//constructor
	public page4Checkoutyourinfo()
	{
		PageFactory.initElements(driver, this);
	}

	public void clicktocontinuebtn()
	{
		firstnametextbox.sendKeys("Aston");
		lastnametextbox.sendKeys("Martin");
		pincodetextbox.sendKeys("28728");
		continuebtn.click();
	}
	
	public String verifycheckouttext()
	{
		return checkouttext.getText();
	}
	
	public String verifycheckout2pagetext()
	{
		return overviewtext.getText();	
	}
	

	public String verifyfooterlabel()
	{
		return footerlabel.getText();
	}

	public boolean verifySwaglogo4()
	{
	return	swaglogo.isDisplayed();
	}
	
	public boolean verifybiglogo4()
	{
	return	bigLogo.isDisplayed();
	}
	
	public boolean verifycartlogo4()
	{
	return	cartlogo.isDisplayed();
	}
	
	public boolean verifytwitterlogo4()
	{
		return twitterLogo.isDisplayed();
	}
	
	public boolean verifyfacebooklogo4()
	{
		return facebookLogo.isDisplayed();
	}
	
	public boolean verifylinkedlinlogo4()
	{
		return linkedlinLogo.isDisplayed();
	}
		
}
