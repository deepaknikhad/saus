package Pages;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class page5Overview extends TestBase {

	@FindBy(xpath = "//span[text()='Checkout: Overview']")private WebElement overviewtext;
	@FindBy(xpath = "//button[@id='finish']")private WebElement finishbtn;	
	@FindBy(xpath = "//div[@class='cart_quantity_label']")private WebElement quantitylabel;
	@FindBy(xpath = "//div[@class='cart_desc_label']")private WebElement descriptionlabel;
    @FindBy(xpath = "//div[text()='Payment Information:']")private WebElement paymentlabel;
	@FindBy(xpath = "//div[text()='SauceCard #31337']")private WebElement saucecardlabel;
	@FindBy(xpath = "//div[text()='Shipping Information:']")private WebElement shippinglabel;
	@FindBy(xpath = "//div[text()='FREE PONY EXPRESS DELIVERY!']")private WebElement freeponyexpresslabel;
//    @FindBy(xpath = "//div[contains(text(),'FREE PONY EXPRESS DELIVERY!')]")private WebElement freeponyexpresslabel;

	@FindBy(xpath = "//div[@class='app_logo']") private WebElement swaglogo;
	@FindBy(xpath = "//li[@class='social_twitter']") private WebElement twitterLogo;
	@FindBy(xpath = "//li[@class='social_facebook']") private WebElement facebookLogo;
	@FindBy(xpath = "//li[@class='social_linkedin']") private WebElement linkedlinLogo;
	@FindBy(xpath = "//a[@class='shopping_cart_link']") private WebElement cartlogo;
	@FindBy(xpath = "//img[@alt='Swag Bot Footer']") private WebElement bigLogo;
	@FindBy(xpath = "//div[@class='footer_copy']")private WebElement footerlabel;
	
	//next page
	@FindBy(xpath = "//span[text()='Checkout: Complete!']")private WebElement completetext;

	public page5Overview()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifyoverviewtext()
	{
		return overviewtext.getText();
	}
	
	public void clickfinishbtn() 
	{
		finishbtn.click();
	}
	
	public String verifycompletetextonlastpage()
	{
		return completetext.getText();
	}
	
	public String verifyquantitylabel()
	{
		return quantitylabel.getText();
	}
	
	public String verifydescriptionlabel()
	{
		return descriptionlabel.getText();
	}
	
	public String paymentlabellabel()
	{
		return paymentlabel.getText();
	}
	
	public String verifysaucecardlabel()
	{
		return saucecardlabel.getText();
	}
	
	public String verifyshippinglabel()
	{
		return shippinglabel.getText();
	}
	
	public String verifyfreeponyexpresslabel()
	{
		return freeponyexpresslabel.getText();
	}

	public String verifyfooterlabel5()
	{
		return footerlabel.getText();
	}

	public boolean verifySwaglogo5()
	{
	return	swaglogo.isDisplayed();
	}
	
	public boolean verifybiglogo5()
	{
	return	bigLogo.isDisplayed();
	}
	
	public boolean verifycartlogo5()
	{
	return	cartlogo.isDisplayed();
	}
	
	public boolean verifytwitterlogo5()
	{
		return twitterLogo.isDisplayed();
	}
	
	public boolean verifyfacebooklogo5()
	{
		return facebookLogo.isDisplayed();
	}
	
	public boolean verifylinkedlinlogo5()
	{
		return linkedlinLogo.isDisplayed();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
