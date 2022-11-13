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

public class Test5OverviewPage extends TestBase{
	
	page1Login loginT;
	page2Inventory inventT;
	page3Cart cartT;
	page4Checkoutyourinfo checkoutT;
	page5Overview overviewT;
	
	@BeforeMethod
	public void setup() throws Exception
	{
		initalization();		
		loginT = new page1Login();
		inventT = new page2Inventory();
		cartT = new page3Cart();
		checkoutT = new page4Checkoutyourinfo();
		overviewT = new page5Overview();
	}
	
	@Test (enabled = true)
	public void verifyoverviewtexttest()
	{
		loginT.LoginToApp1();
		inventT.clickcartlogo();
		cartT.verifycheckoutbtn();
		checkoutT.clicktocontinuebtn();
		String value = overviewT.verifyoverviewtext();
		Assert.assertEquals(value, "CHECKOUT: OVERVIEW");
	}
	
	@Test (enabled = true)
	public void clickfinishbtntest()
	{
		loginT.LoginToApp1();
		inventT.clickcartlogo();
		cartT.verifycheckoutbtn();
		checkoutT.clicktocontinuebtn();
		overviewT.clickfinishbtn();
	}
	
	@Test (enabled = true)
	public void verifycompletetextonlastpagetest()
	{
		loginT.LoginToApp1();
		inventT.clickcartlogo();
		cartT.verifycheckoutbtn();
		checkoutT.clicktocontinuebtn();
		overviewT.clickfinishbtn();
		String value = overviewT.verifycompletetextonlastpage();
		Assert.assertEquals(value, "CHECKOUT: COMPLETE!");
	}
	
	@Test (enabled = true)
	public void verifyquantitylabeltest()
	{
		loginT.LoginToApp1();
		inventT.clickcartlogo();
		cartT.verifycheckoutbtn();
		checkoutT.clicktocontinuebtn();
		String value = overviewT.verifyquantitylabel();
		Assert.assertEquals(value, "QTY");
		overviewT.clickfinishbtn();
	}
	
	@Test (enabled = true)
	public void verifydescriptionlabeltest()
	{
		loginT.LoginToApp1();
		inventT.clickcartlogo();
		cartT.verifycheckoutbtn();
		checkoutT.clicktocontinuebtn();
		String value = overviewT.verifydescriptionlabel();
		Assert.assertEquals(value, "DESCRIPTION");
		overviewT.clickfinishbtn();
	}
	
	@Test (enabled = true)
	public void paymentlabellabeltest()
	{
		loginT.LoginToApp1();
		inventT.clickcartlogo();
		cartT.verifycheckoutbtn();
		checkoutT.clicktocontinuebtn();
		String value = overviewT.paymentlabellabel();
		Assert.assertEquals(value, "Payment Information:");
		overviewT.clickfinishbtn();
	}
	
	@Test (enabled = true)
	public void verifysaucecardlabeltest()
	{
		loginT.LoginToApp1();
		inventT.clickcartlogo();
		cartT.verifycheckoutbtn();
		checkoutT.clicktocontinuebtn();
		String value = overviewT.verifysaucecardlabel();
		Assert.assertEquals(value, "SauceCard #31337");
		overviewT.clickfinishbtn();

	}
	
	@Test (enabled = true)
	public void verifyshippinglabeltest()
	{
		loginT.LoginToApp1();
		inventT.clickcartlogo();
		cartT.verifycheckoutbtn();
		checkoutT.clicktocontinuebtn();
		String value = overviewT.verifyshippinglabel();
		Assert.assertEquals(value, "Shipping Information:");
		overviewT.clickfinishbtn();
	}
	
	@Test (enabled = true)
	public void verifyfreeponyexpresslabeltest()
	{
		loginT.LoginToApp1();
		inventT.clickcartlogo();
		cartT.verifycheckoutbtn();
		checkoutT.clicktocontinuebtn();		
		String value = overviewT.verifyfreeponyexpresslabel();
		Assert.assertEquals(value, "FREE PONY EXPRESS DELIVERY!");
		overviewT.clickfinishbtn();
	}
		
	
	@Test (enabled = true)
	public void verifyfooterlabel5()
	{
		loginT.LoginToApp1();
		inventT.clickcartlogo();
		cartT.verifycheckoutbtn();
		checkoutT.clicktocontinuebtn();
		overviewT.clickfinishbtn();
		String value = overviewT.verifyfooterlabel5();
	//	Assert.assertEquals(value, "© "+"2022"+" Sauce Labs. All Rights Reserved. Terms of Service | Privacy Policy");		
		Assert.assertEquals(value, "© 2022 Sauce Labs. All Rights Reserved. Terms of Service | Privacy Policy");
     }
	
	@Test (enabled = true)
	public void verifytwitterlogo5() throws Exception
	{
		loginT.LoginToApp1();
		inventT.clickcartlogo();
		cartT.verifycheckoutbtn();
		checkoutT.clicktocontinuebtn();
		overviewT.clickfinishbtn();
		boolean result = overviewT.verifytwitterlogo5();
		Assert.assertEquals(result, true);
	}
	
	@Test(enabled = true)
	public void verifyfacebooklogo5() throws Exception
	{
		loginT.LoginToApp1();
		inventT.clickcartlogo();
		cartT.verifycheckoutbtn();
		checkoutT.clicktocontinuebtn();
		overviewT.clickfinishbtn();
		boolean result = overviewT.verifyfacebooklogo5();
		Assert.assertEquals(result, true);
	}
					
	@Test(enabled = true)
	public void verifylinkedlinlogo5() throws Exception
	{
		loginT.LoginToApp1();
		inventT.clickcartlogo();
		cartT.verifycheckoutbtn();
		checkoutT.clicktocontinuebtn();
		overviewT.clickfinishbtn();
		boolean result = overviewT.verifylinkedlinlogo5();
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
		boolean result = overviewT.verifySwaglogo5();
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
		boolean result = overviewT.verifycartlogo5();
		Assert.assertEquals(result, true);
	}	
	
	@Test(enabled = true)
	public void verifybiglogo5Test() throws Exception
	{
		loginT.LoginToApp1();
		inventT.clickcartlogo();
		cartT.verifycheckoutbtn();
		checkoutT.clicktocontinuebtn();
		overviewT.clickfinishbtn();
		boolean result = overviewT.verifybiglogo5();
		Assert.assertEquals(result, true);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@AfterMethod
	public void closebrowser()
	{
		driver.close();
	}
}
