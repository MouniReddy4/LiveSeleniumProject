package com.qa.techpanda.testScript;

import org.testng.annotations.*;

import com.qa.techpanda.Base.TestBase;
import com.qa.techpanda.pages.TestCase1;
import com.qa.techpanda.utility.TestUtility;

import junit.framework.Assert;

public class TestCase1Test extends TestBase{
	TestCase1 test1;
	TestUtility testutil;
	
	public TestCase1Test()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		intialization();
		test1=new TestCase1();
		testutil=new TestUtility();
	}
	
	@Test(priority=1)
	public void validatingTitle()
	{
		String actual_Title=test1.verifyingTitle();
		//Assert.assertEquals("THIS IS DEMO SITE FOR",actual_Title);
	}
	
	@Test(priority=2)
	public void validatingMenu()
	{
		test1.clickOnMenu();
		String actual_title=driver.getTitle();
		String excepted_title="Mobile";
		Assert.assertEquals("Title is matched",actual_title,excepted_title);
	}
	
	@Test
	public void selectingMenuOptions()
	{
		//test1.selectingOptions();
		testutil.takeScreenShots("SortedProducts");
	}
	
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
