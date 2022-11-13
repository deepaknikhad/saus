package Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Base.TestBase;

public class page3Cart extends TestBase{

//	@FindBy(xpath = "//a[@class='shopping_cart_link']") private WebElement cartvalue;
//    @FindBy(xpath = "//div[@class='cart_quantity_label']")private WebElement quantitylabel;	
//    @FindBy(xpath = "//div[@class='cart_desc_label']")private WebElement descriptionlabel;
//
//    @FindBy(xpath = "//span[@class='shopping_cart_badge']")private WebElement cartbadge;
//    
//    @FindBy(xpath = "//div[contains(text(),'Sauce Labs Backpack')]")private List<WebElement> product;
//    @FindBy(xpath = "//div[contains(text(),'Sauce Labs Backpack')]")private List<WebElement> productname;
//
//    
//    @FindBy(xpath = "//div[contains(text(),'Sauce Labs Backpack')]")private WebElement product1;
//    @FindBy(xpath = "//div[contains(text(),'Sauce Labs Bike Light')]")private WebElement product2;
//    @FindBy(xpath = "//div[contains(text(),'Sauce Labs Fleece Jacket')]")private WebElement product3;
//    @FindBy(xpath = "//div[contains(text(),'Sauce Labs Bolt T-Shirt')]")private WebElement product4;
//    @FindBy(xpath = "//div[contains(text(),'Sauce Labs Onesie')]")private WebElement product5;
//    @FindBy(xpath = "//div[contains(text(),'Test.allTheThings() T-Shirt (Red)')]")private WebElement product6;
//
//    
////	@FindBy(xpath = "//button[@id='remove-sauce-labs-backpack']") private WebElement backpackremove;
//	@FindBy(xpath = "//button[@id='remove-sauce-labs-bike-light']") private WebElement bikelightremove;
//	@FindBy(xpath = "//button[@id='remove-sauce-labs-fleece-jacket']") private WebElement jacketremove;
//	@FindBy(xpath = "//button[@id='remove-sauce-labs-bolt-t-shirt']") private WebElement tshirtremove;
//	@FindBy(xpath = "//button[@id='remove-sauce-labs-onesie']") private WebElement onesieremove;
//	@FindBy(xpath = "//button[@id='remove-test.allthethings()-t-shirt-(red)']") private WebElement tshirtredremove;

	@FindBy(xpath = "//button[@id='checkout']") private WebElement checkoutbtn;
	@FindBy(xpath = "//button[text()='Remove']") private WebElement removebackpack;
//	@FindBy(xpath = "(//button[text()='Remove'])[2]")private WebElement removebikelight;
    @FindBy(xpath = "//button[@id='react-burger-menu-btn']") private WebElement menubtn;
    @FindBy(xpath = "//span[text()='Your Cart']")private WebElement yourcarttext;	
    @FindBy(xpath = "//a[@id='about_sidebar_link']")private WebElement abouttext;
    @FindBy(xpath = "//span[text()='Checkout: Your Information']")private WebElement informationtext;        //4page xpath

    @FindBy(xpath = "//div[@class='app_logo']") private WebElement swaglogo;
	@FindBy(xpath = "//li[@class='social_twitter']") private WebElement twitterLogo;
	@FindBy(xpath = "//li[@class='social_facebook']") private WebElement facebookLogo;
	@FindBy(xpath = "//li[@class='social_linkedin']") private WebElement linkedlinLogo;
	@FindBy(xpath = "//a[@class='shopping_cart_link']") private WebElement cartlogo;
	@FindBy(xpath = "//img[@alt='Swag Bot Footer']") private WebElement bigLogo;
	@FindBy(xpath = "//div[@class='footer_copy']")private WebElement footerlabel;
    
	//constructor
	public page3Cart()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String clickmenubtn()
	{
		menubtn.click();
		return abouttext.getText();
	}

	public String verifyyourcarttext()
	{
		return yourcarttext.getText();
	}
	
	public void verifycheckoutbtn()
	{
		removebackpack.click();
		checkoutbtn.click();
	}
	
	public String verifyinformationtexttest()
	{
		return informationtext.getText();
	}
	

	public String verifyfooterlabel3()
	{
		return footerlabel.getText();
	}

	public boolean verifySwaglogo3()
	{
	return	swaglogo.isDisplayed();
	}
	
	public boolean verifybiglogo3()
	{
	return	bigLogo.isDisplayed();
	}
	
	public boolean verifycartlogo3()
	{
	return	cartlogo.isDisplayed();
	}
	
	public boolean verifytwitterlogo3()
	{
		return twitterLogo.isDisplayed();
	}
	
	public boolean verifyfacebooklogo3()
	{
		return facebookLogo.isDisplayed();
	}
	
	public boolean verifylinkedlinlogo3()
	{
		return linkedlinLogo.isDisplayed();
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
