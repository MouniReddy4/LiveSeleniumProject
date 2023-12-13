package com.qa.techpanda.testScript;

import org.openqa.selenium.By;
import org.testng.annotations.*;

import com.qa.techpanda.Base.TestBase;
import com.qa.techpanda.pages.TestCase3;
import com.qa.techpanda.utility.TestUtility;

import junit.framework.Assert;

public class TestCase3Test extends TestBase{
	TestCase3 test3;
	TestUtility testutil;
	
	public TestCase3Test()
	{
		super();
	}

	@BeforeMethod
	public void setUp() {
		intialization();
		test3=new TestCase3();
		testutil=new TestUtility();
		test3.clickOnMenuOption();
		
	}
	
	@Test(priority=1)
	public void clickCart(){
		test3.clickOnCart();
		//String title=driver.getTitle();
		//Assert.assertEquals("Title is matched","Sony Xperia was added to your shopping cart.",driver.findElement(By.xpath("//*[@class='success-msg']//span")).getText());
	}
	@Test(priority=2)
	public void updatingQuantity()
	{
		test3.clickOnCart();
		test3.settingQuantity("1000");
		test3.clickOnUpdatingbtn();
		String text=test3.verifyingErrorMsg();
		Assert.assertEquals("Error message shown",text,"* The maximum quantity allowed for purchase is 500.");
	}
	
	@Test(priority=3)
	public void validatingEmptybtn()
	{
		test3.clickOnCart();
		test3.settingQuantity("1000");
		test3.clickOnUpdatingbtn();
		test3.clickOnEmptyCart();
		String empty=test3.verifyingEmptyCartpage();
		Assert.assertEquals("Message shown",empty,"SHOPPING CART IS EMPTY");
	}
	
	
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
}
