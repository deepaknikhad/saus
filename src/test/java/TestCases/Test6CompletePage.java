package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Base.TestBase;
import Pages.page1Login;
import Pages.page2Inventory;
import Pages.page3Cart;
import Pages.page4Checkoutyourinfo;
import Pages.page5Overview;
import Pages.page6Complete;

public class Test6CompletePage extends TestBase{

	page1Login loginT;
	page2Inventory inventT;
	page3Cart cartT;
	page4Checkoutyourinfo checkoutT;
	page5Overview overviewT;
	page6Complete completeT;
	
	@BeforeMethod
	public void Test6CompletePage() throws Exception
	{
		initalization();		
		loginT = new page1Login();
		inventT = new page2Inventory();
		cartT = new page3Cart();
		checkoutT = new page4Checkoutyourinfo();
		overviewT = new page5Overview();
		completeT = new page6Complete();
	}
	
	@Test(enabled = true)
	public void swaglabslogotest()
	{
		loginT.LoginToApp1();
		inventT.clickcartlogo();
		cartT.verifycheckoutbtn();
		checkoutT.clicktocontinuebtn();
		overviewT.clickfinishbtn();
		boolean value = completeT.verifyswaglabslogo6();
		Assert.assertEquals(value, true);
	}
	
	@Test (enabled = true)
	public void checkoutcompletelabeltest()
	{
		loginT.LoginToApp1();
		inventT.clickcartlogo();
		cartT.verifycheckoutbtn();
		checkoutT.clicktocontinuebtn();
		overviewT.clickfinishbtn();
		String value = completeT.verifycheckoutcompletelabel();
		Assert.assertEquals(value, "CHECKOUT: COMPLETE!");
	}
	
	@Test (enabled = true)
		public void thankyoulabeltest()
	{
			loginT.LoginToApp1();
			inventT.clickcartlogo();
			cartT.verifycheckoutbtn();
			checkoutT.clicktocontinuebtn();
			overviewT.clickfinishbtn();
			String value = completeT.verifythankyoulabel();
			Assert.assertEquals(value, "THANK YOU FOR YOUR ORDER");			
	}
	
	@Test (enabled = true)
	public void completelabeltest()
	{
		loginT.LoginToApp1();
		inventT.clickcartlogo();
		cartT.verifycheckoutbtn();
		checkoutT.clicktocontinuebtn();
		overviewT.clickfinishbtn();
	    String value1 = completeT.verifycompletelabel();
	    Assert.assertEquals(value1, "Your order has been dispatched, and will arrive just as fast as the pony can get there!");
	}
	

	@Test (enabled = true)
	public void ponylogotest()
	{
		loginT.LoginToApp1();
		inventT.clickcartlogo();
		cartT.verifycheckoutbtn();
		checkoutT.clicktocontinuebtn();
		overviewT.clickfinishbtn();
		boolean value = completeT.verifyvisibilityofponylogo();
		Assert.assertEquals(value, true);
	}
		
	@Test (enabled = true)
	public void burgerbtntest()
	{
		loginT.LoginToApp1();
		inventT.clickcartlogo();
		cartT.verifycheckoutbtn();
		checkoutT.clicktocontinuebtn();
		overviewT.clickfinishbtn();
		completeT.verifyburgerbtn();
	}
	
	@Test (enabled = true)
	public void logoutbtntest()
	{
		loginT.LoginToApp1();
		inventT.clickcartlogo();
		cartT.verifycheckoutbtn();
		checkoutT.clicktocontinuebtn();
		overviewT.clickfinishbtn();
		completeT.verifyburgerbtn();
		completeT.verifylogoutbtn();
	}
	
	@Test (enabled = true)
	public void verifyfooterlabeltest()
	{
		loginT.LoginToApp1();
		inventT.clickcartlogo();
		cartT.verifycheckoutbtn();
		checkoutT.clicktocontinuebtn();
		overviewT.clickfinishbtn();
		String value = completeT.verifyfooterlabel();
	//	Assert.assertEquals(value, "© "+"2022"+" Sauce Labs. All Rights Reserved. Terms of Service | Privacy Policy");		
		Assert.assertEquals(value, "© 2022 Sauce Labs. All Rights Reserved. Terms of Service | Privacy Policy");
     }
	
	@Test (enabled = true)
	public void verifytwitterLogoTest() throws Exception
	{
		loginT.LoginToApp1();
		inventT.clickcartlogo();
		cartT.verifycheckoutbtn();
		checkoutT.clicktocontinuebtn();
		overviewT.clickfinishbtn();
		boolean result = completeT.verifytwitterlogo6();
		Assert.assertEquals(result, true);
	}
	
	@Test(enabled = true)
	public void verifyfacebookLogoTest() throws Exception
	{
		loginT.LoginToApp1();
		inventT.clickcartlogo();
		cartT.verifycheckoutbtn();
		checkoutT.clicktocontinuebtn();
		overviewT.clickfinishbtn();
		boolean result = completeT.verifyfacebooklogo6();
		Assert.assertEquals(result, true);
	}
	
		
		
	@Test(enabled = true)
	public void verifylinkedlinlogo6() throws Exception
	{
		loginT.LoginToApp1();
		inventT.clickcartlogo();
		cartT.verifycheckoutbtn();
		checkoutT.clicktocontinuebtn();
		overviewT.clickfinishbtn();
		boolean result = completeT.verifylinkedlinlogo6();
		Assert.assertEquals(result, true);
	}
	
	@Test(enabled = true)
	public void verifyswaglogoTest() throws Exception
	{
		loginT.LoginToApp1();
		inventT.clickcartlogo();
		cartT.verifycheckoutbtn();
		checkoutT.clicktocontinuebtn();
		overviewT.clickfinishbtn();
		boolean result = completeT.verifySwaglogo6();
		Assert.assertEquals(result, true);
	}
	
	@Test(enabled = true)
	public void verifycartlogoTest() throws Exception
	{
		loginT.LoginToApp1();
		inventT.clickcartlogo();
		cartT.verifycheckoutbtn();
		checkoutT.clicktocontinuebtn();
		overviewT.clickfinishbtn();
		boolean result = completeT.verifycartlogo6();
		Assert.assertEquals(result, true);
	}	
	
	@Test(enabled = true)
	public void verifybiglogo6Test() throws Exception
	{
		loginT.LoginToApp1();
		inventT.clickcartlogo();
		cartT.verifycheckoutbtn();
		checkoutT.clicktocontinuebtn();
		overviewT.clickfinishbtn();
		boolean result = completeT.verifybiglogo6();
		Assert.assertEquals(result, true);
	}
	
	@AfterMethod
	public void closebrowser()
	{
		driver.close();
	}
		
}
	
	