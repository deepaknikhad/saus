package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Base.TestBase;
import Pages.page1Login;
import Pages.page2Inventory;
import Pages.page3Cart;

public class Test3CartPage extends TestBase{

	page1Login loginT;
	page2Inventory inventT;
	page3Cart cartT;
	
	@BeforeMethod
	public void setup() throws Exception
	{
		initalization();		
		loginT = new page1Login();
		inventT = new page2Inventory();
		cartT = new page3Cart();
	}
	
	@Test (enabled = false)
	public void clickcheckoutbtntest()
	{
		loginT.LoginToApp1();
		inventT.clickcartlogo();
		cartT.verifycheckoutbtn();
	}
	
	@Test (enabled = true)
	public void clickmenubtntest() throws Exception
	{
		loginT.LoginToApp1();
		inventT.clickcartlogo();
		String text = cartT.clickmenubtn();
		Assert.assertEquals(text, "");
	}
		
	@Test (enabled = false)
	public void verifyinformationtexttest()
	{
		loginT.LoginToApp1();
		inventT.clickcartlogo();
		cartT.verifycheckoutbtn();
		String value = cartT.verifyinformationtexttest();
		Assert.assertEquals(value, "CHECKOUT: YOUR INFORMATION");
	}
	
	@Test (enabled = false)
	public void verifyyourcarttexttest()
	{
		loginT.LoginToApp1();
		inventT.clickcartlogo();
		String value = cartT.verifyyourcarttext();
		Assert.assertEquals(value, "YOUR CART");
	}
	
//	@Test // (enabled=false)
//	public void verifynoofproducts() throws Exception
//	{
//	//	login.LoginPage1();
//	//	invent.LoginToApp3();
//		int value = cartT.verifynoofproduct();
//		Assert.assertEquals(value, 6);
//	}
//	
//	@Test  //(enabled=false)
//	public void verifyremovalof5producttest() throws Exception
//	{
////        	login.LoginPage1();
////			invent.LoginToApp3();
//		String value = cartT.removeproduct();
//		Assert.assertEquals(value, "5");
//	}
//	
//	@Test  //(enabled=false)
//    public void verifyproduct1nametest() throws Exception
//    {
////		login.LoginPage1();
////		invent.LoginToApp3();
//		String result = cartT.product1();
//		Assert.assertEquals(result, "Sauce Labs Backpack");
//    }
//	
//	@Test // (enabled=false)
//    public void verifyproduct2nametest() throws Exception
//    {
////		login.LoginPage1();
////		invent.LoginToApp3();
//		String result = cartT.product2();
//		Assert.assertEquals(result,"Sauce Labs Bike Light");
//    }
//	
//	@Test  //(enabled=false)
//    public void verifyproduct3nametest() throws Exception
//    {
////		login.LoginPage1();
////		invent.LoginToApp3();
//		String result = cartT.product3();
//		Assert.assertEquals(result,"Sauce Labs Fleece Jacket");
//    }
//	
//	@Test  //(enabled=false)
//    public void verifyproduct4nametest() throws Exception
//    {
////		login.LoginPage1();
////		invent.LoginToApp3();
//		String result = cartT.product4();
//		Assert.assertEquals(result,"Sauce Labs Bolt T-Shirt')]");
//    }
//	
//	@Test  //(enabled=false)
//    public void verifyproduct5nametest() throws Exception
//    {
////		login.LoginPage1();
////		invent.LoginToApp3();
//		String result = cartT.product5();
//		Assert.assertEquals(result,"Sauce Labs Onesie");
//    }
//	
//	@Test  //(enabled=false)
//    public void verifyproduct6nametest() throws Exception
//    {
////		login.LoginPage1();
////		invent.LoginToApp3();
//		String result = cartT.product6();
//		Assert.assertEquals(result,"Test.allTheThings() T-Shirt (Red)");
//    }
	   
	@AfterMethod
	public void close()
	{
		driver.close();
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
