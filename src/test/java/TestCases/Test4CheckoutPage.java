package TestCases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.page1Login;
import Pages.page2Inventory;
import Pages.page3Cart;
import Pages.page4Checkoutyourinfo;

public class Test4CheckoutPage extends TestBase {

	page1Login loginT;
	page2Inventory inventT;
	page3Cart cartT;
	page4Checkoutyourinfo checkoutT;
	
	@BeforeMethod
	public void setup() throws Exception
	{
		initalization();		
		loginT = new page1Login();
		inventT = new page2Inventory();
		cartT = new page3Cart();
		checkoutT = new page4Checkoutyourinfo();
	}
	
	@Test(enabled = true)
	public void clicktocontinuebtntest()
	{
		loginT.LoginToApp1();
		inventT.clickcartlogo();
		cartT.verifycheckoutbtn();
		checkoutT.clicktocontinuebtn();
	}
	
	@Test(enabled = true)
	public void verifycheckouttexttest()
	{
		loginT.LoginToApp1();
		inventT.clickcartlogo();
		cartT.verifycheckoutbtn();
		String value = checkoutT.verifycheckouttext();
		Assert.assertEquals(value, "CHECKOUT: YOUR INFORMATION");
	}
	
	@Test(enabled = true)
	public void verifycheckout2pagetexttest()
	{
		loginT.LoginToApp1();
		inventT.clickcartlogo();
		cartT.verifycheckoutbtn();
		checkoutT.clicktocontinuebtn();
		String value = checkoutT.verifycheckout2pagetext();
		Assert.assertEquals(value, "CHECKOUT: OVERVIEW");
	}

	@Test(enabled = true)
	public void verifyfooterlabel()
	{
		loginT.LoginToApp1();
		inventT.clickcartlogo();
		cartT.verifycheckoutbtn();
		checkoutT.clicktocontinuebtn();		
		String value = checkoutT.verifyfooterlabel();
	//	Assert.assertEquals(value, "© "+"2022"+" Sauce Labs. All Rights Reserved. Terms of Service | Privacy Policy");		
		Assert.assertEquals(value, "© 2022 Sauce Labs. All Rights Reserved. Terms of Service | Privacy Policy");
     }
	
	@Test (enabled = true)
	public void verifytwitterlogo4test() throws Exception
	{
		loginT.LoginToApp1();
		inventT.clickcartlogo();
		cartT.verifycheckoutbtn();
		checkoutT.clicktocontinuebtn();
		boolean result = checkoutT.verifytwitterlogo4();
		Assert.assertEquals(result, true);
	}
	
	@Test(enabled = true)
	public void verifyfacebooklogo4test() throws Exception
	{
		loginT.LoginToApp1();
		inventT.clickcartlogo();
		cartT.verifycheckoutbtn();
		checkoutT.clicktocontinuebtn();
		boolean result = checkoutT.verifyfacebooklogo4();
		Assert.assertEquals(result, true);
	}
					
	@Test(enabled = true)
	public void verifylinkedlinlogo4test() throws Exception
	{
		loginT.LoginToApp1();
		inventT.clickcartlogo();
		cartT.verifycheckoutbtn();
		checkoutT.clicktocontinuebtn();
		boolean result = checkoutT.verifylinkedlinlogo4();
		Assert.assertEquals(result, true);
	}
	
	@Test(enabled = true)
	public void verifySwaglogo4Test() throws Exception
	{
		loginT.LoginToApp1();
		inventT.clickcartlogo();
		cartT.verifycheckoutbtn();
		checkoutT.clicktocontinuebtn();
		boolean result = checkoutT.verifySwaglogo4();
		Assert.assertEquals(result, true);
	}
	
	@Test(enabled = true)
	public void verifycartlogo4Test() throws Exception
	{
		loginT.LoginToApp1();
		inventT.clickcartlogo();
		cartT.verifycheckoutbtn();
		checkoutT.clicktocontinuebtn();
		boolean result = checkoutT.verifycartlogo4();
		Assert.assertEquals(result, true);
	}	
	
	@Test(enabled = true)
	public void verifyfooterlabelTest() throws Exception
	{
		loginT.LoginToApp1();
		inventT.clickcartlogo();
		cartT.verifycheckoutbtn();
		checkoutT.clicktocontinuebtn();
		boolean result = checkoutT.verifybiglogo4();
		Assert.assertEquals(result, true);
	}
		
	@Test(enabled = true)
	public void closeBrowser()
	{
		driver.close();
	}	
}
