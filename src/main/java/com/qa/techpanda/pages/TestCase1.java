package com.qa.techpanda.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.techpanda.Base.TestBase;

public class TestCase1 extends TestBase{
	@FindBy(xpath="//h2")
	WebElement title;
	
	@FindBy(xpath="//*[contains(text(),'Mobile')]")
	WebElement menubtn;
	
	@FindBy(xpath="//*[@class='sort-by']//select")
	WebElement menuOptions;
	
	public TestCase1()
	{
		PageFactory.initElements(driver,this);
	}
	
	public String verifyingTitle()
	{
		return title.getText();
	}
	
	public void clickOnMenu()
	{
		menubtn.click();
	}
	
	public void selectingOptions()
	{
		Select option=new Select(menuOptions);
		option.selectByVisibleText("Name");
		
	}

}
