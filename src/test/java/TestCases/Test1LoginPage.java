package TestCases;

import java.io.File;
import org.apache.commons.logging.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Base.TestBase;
import Pages.page1Login;

public class Test1LoginPage extends TestBase{
	
	page1Login login;   
	
	@BeforeMethod 
	public void setup() throws Exception
	{
		initalization();
		login = new page1Login();
	}
	
	@Test (enabled = true)
	public void LoginToApp1Test() throws Exception
	{
		String label = login.LoginToApp1();
		Assert.assertEquals(label, "PRODUCTS");
	}
	
	@Test (enabled = true)
	public void LoginToApp2Test() throws Exception
	{
		Assert.assertEquals(login.LoginToApp2(),"https://www.saucedemo.com/inventory.html");
	}
		
	@Test (enabled = true)
	public void verifyTitleTest()
	{		
	String	title = login.verifyTitle();
	Assert.assertEquals(title, "Swag Labs");
	}

	@Test (enabled = true)
	public void verifyUrlTest()
	{
		String url = login.verifyUrl();
		Assert.assertEquals(url, "https://www.saucedemo.com/");
	}	
	
	@Test (enabled = true)
     public void verifylogo1()
     {
    	 boolean logo1 = login.verifyLoginLogo1();
    	 Assert.assertEquals(logo1, true);
     }
     
	@Test (enabled = true)
     public void verifylogo2()
     {
    	 boolean logo2 = login.verifyBotLogo2();
    	 Assert.assertEquals(logo2, true);
     }

	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
}
