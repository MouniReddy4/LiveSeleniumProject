package com.qa.techpanda.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qa.techpanda.Base.TestBase;

public class TestCase4 extends TestBase{
	@FindBy(xpath="//*[contains(text(),'Mobile')]")
	WebElement menubtn;
	
	
	@FindBy(xpath="//*[@id='top']/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[1]/div/div[3]/ul/li[2]/a")
	WebElement firstProduct;
	
	@FindBy(xpath="//*[@id='top']/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[3]/div/div[3]/ul/li[2]/a")
	WebElement sendProduct;
	
	@FindBy(xpath="//*[@title='Compare']")
	WebElement compareBtn;
	
	
	
	
	public TestCase4()
	{
		
	}

}
