package com.qa.techpanda.testScript;

import org.testng.annotations.*;

import com.qa.techpanda.Base.TestBase;
import com.qa.techpanda.pages.TestCase2;
import com.qa.techpanda.utility.TestUtility;

import junit.framework.Assert;

public class TestCase2Test extends TestBase {
	TestCase2 test2;
	TestUtility testutil;
	String price;
	public TestCase2Test()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		intialization();
		test2=new TestCase2();
		testutil=new TestUtility();
	}
	
	@Test(priority=1)
	public void clickOnMenuOption()
	{
		test2.clickOnMobileOption();
		String title=driver.getTitle();
		Assert.assertEquals("Title is matche",title,"Mobile");
	}
	@Test(priority=2)
	public void validatingingCostOfSony()
	{
		test2.clickOnMobileOption();
		price=test2.costOfSonyProduct();
		System.out.println(price);
	}
	@Test(priority=3)
	public void clickOnMobile()
	{
		test2.clickOnMobileOption();
		test2.clickOnItem();
		String actual_title=driver.getTitle();
		Assert.assertEquals("Title is matched", actual_title,"Sony Xperia - Mobile");
	}
	@Test(priority=4)
	public void validatingPrice(){
		test2.clickOnMobileOption();
		String pricePage=test2.detailPages();
		System.out.println(pricePage);
		Assert.assertEquals("Price Matched",pricePage,price);
	}
	
	
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}
