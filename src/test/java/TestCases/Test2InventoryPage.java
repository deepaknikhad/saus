package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Base.TestBase;

import Pages.page1Login;
import Pages.page2Inventory;

public class Test2InventoryPage extends TestBase {
	
	private static final String enabled = null;
	page1Login login;
	page2Inventory invent;
	
	
	@BeforeMethod
	public void setup() throws Exception
	{
		initalization();
		login = new page1Login();
		invent = new page2Inventory();
	}
	
	@Test (enabled = true)
	public void verifySmallLogo() throws Exception
	{
		login.LoginToApp1();
		boolean result = invent.verifySmallLogo();
		Assert.assertEquals(result, true);
	}
	
	@Test (enabled = true)
	public void verifyBogLogo() throws Exception
	{
		login.LoginToApp1();
		boolean result = invent.verifyBigLogo();
		Assert.assertEquals(result, true);
	}
		
	@Test (enabled = true)
	public void add6ProductTest() throws Exception
	{
		login.LoginToApp1();
		 Object result = invent.add6Product();
		Assert.assertEquals(result, "6");
	}
	
	@Test (enabled = true)
	public void verifytwitterLogoTest() throws Exception
	{
		login.LoginToApp1();
		boolean result = invent.verifytwitterlogo();
		Assert.assertEquals(result, true);
	}
	
	@Test (enabled = true)
	public void verifyfacebookLogoTest() throws Exception
	{
		login.LoginToApp1();
		boolean result = invent.verifyfacebooklogo();
		Assert.assertEquals(result, true);
	}
	
	@Test (enabled = true)
	public void verifylinkedinLogoTest() throws Exception
	{
		login.LoginToApp1();
		boolean result = invent.verifylinkedlinlogo();
		Assert.assertEquals(result, true);
	}
	
	@Test (enabled = true)
	public void LoginToApp3Test() throws Exception
	{
		Assert.assertEquals(login.LoginToApp2(),"https://www.saucedemo.com/inventory.html");
	}
	
	@Test (enabled = true)
	public void clickcartlogotest()
	{
		login.LoginToApp1();
		invent.clickcartlogo();
	}
		
	@Test (enabled = true)
	public void verifylabelofcartpagetest()
	{
		login.LoginToApp1();
		invent.clickcartlogo();
		String cartlabel = invent.verifylabelofcartpage();
		Assert.assertEquals(cartlabel, "YOUR CART");
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}

}