package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Base.TestBase;

public class page2Inventory extends TestBase {
	

	@FindBy(xpath = "//div[@class='peek']") private WebElement smallLogo;
	@FindBy(xpath = "//img[@alt='Swag Bot Footer']") private WebElement bigLogo;
	@FindBy(xpath = "//select[@class='product_sort_container']") private WebElement sorterDropdown;
	
	@FindBy(xpath ="//button[@id='add-to-cart-sauce-labs-backpack']") private WebElement backpackProduct;
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bike-light']") private WebElement bikeLightProduct;
	@FindBy(xpath ="//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']") private WebElement tshirtBlackProduct16;
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-fleece-jacket']") private WebElement jacketProduct50;
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-onesie']") private WebElement tshirtProduct8;
	@FindBy(xpath = "//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']") private WebElement tshirtRedProduct16;
	
//	@FindBy(xpath = "//button[@id='remove-sauce-labs-backpack']") private WebElement backpackremove;
//	@FindBy(xpath = "//button[@id='remove-sauce-labs-bike-light']") private WebElement bikelightremove;
//	@FindBy(xpath = "//button[@id='remove-sauce-labs-fleece-jacket']") private WebElement jacketremove;
//	@FindBy(xpath = "//button[@id='remove-sauce-labs-bolt-t-shirt']") private WebElement tshirtremove;
//	@FindBy(xpath = "//button[@id='remove-sauce-labs-onesie']") private WebElement onesieremove;
//	@FindBy(xpath = "//button[@id='remove-test.allthethings()-t-shirt-(red)']") private WebElement tshirtredremove;
	
	
	@FindBy(xpath = "//span[@class='shopping_cart_badge']") private WebElement productCountIcon;
	
	@FindBy(xpath = "//li[@class='social_twitter']") private WebElement twitterLogo;
	@FindBy(xpath = "//li[@class='social_facebook']") private WebElement facebookLogo;
	@FindBy(xpath = "//li[@class='social_linkedin']") private WebElement linkedlinLogo;

	@FindBy(xpath = "//span[text()='Your Cart']")private WebElement yourcartlabel;
	@FindBy(xpath = "//a[@class='shopping_cart_link']") private WebElement cartlogo;



	//constructor
	public page2Inventory()
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifySmallLogo()
	{
	return smallLogo.isDisplayed();
	}
	
	public boolean verifyBigLogo()
	{
		return bigLogo.isDisplayed();
	}
		
	public boolean verifytwitterlogo()
	{
		return twitterLogo.isDisplayed();
	}
	
	public boolean verifyfacebooklogo()
	{
		return facebookLogo.isDisplayed();
	}
	
	public boolean verifylinkedlinlogo()
	{
		return linkedlinLogo.isDisplayed();
	}

	public void clickcartlogo()
	{
		backpackProduct.click();	
		bikeLightProduct.click();
		tshirtBlackProduct16.click();
		jacketProduct50.click();
		tshirtProduct8.click();
		tshirtRedProduct16.click();
		cartlogo.click();
	}
	
	public String verifylabelofcartpage()
	{
		return yourcartlabel.getText();
	}

	public String add6Product()
	{
		Select s = new Select(sorterDropdown);
		s.selectByVisibleText("Price (low to high)");
	    backpackProduct.click();
	    bikeLightProduct.click();
	    tshirtBlackProduct16.click();
	    tshirtProduct8.click();
	    tshirtRedProduct16.click();
	    jacketProduct50.click();
		String count1 = cartlogo.getText();
		return count1 ;			
	}
	
//	//methods to remove the products
//			public String removeproduct()
//			{
//				bikelightremove.click();
//				jacketremove.click();
//				tshirtremove.click();
//				onesieremove.click();
//				tshirtredremove.click();
//				String count2 = cartlogo.getText();
//				return count2;
//			}
	
	
	//GOING TO 3 PAGE
	public String LoginToApp3() throws Exception
	{
		LoginToApp3();                                                 
		return driver.getCurrentUrl();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
