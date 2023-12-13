package com.qa.techpanda.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.techpanda.Base.TestBase;

public class TestCase2 extends TestBase{
	@FindBy(xpath="//*[contains(text(),'Mobile')]")
	WebElement menubtn;
	
	@FindBy(xpath="//span[@id='product-price-1']/span")
	WebElement costOfSony;
	
	@FindBy(xpath="//img[@id='product-collection-image-1']")
	WebElement detailPage;
	
	@FindBy(xpath="//span[@id='product-price-1']/span")
	WebElement detailPagePrice;
	
	public TestCase2()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clickOnMobileOption()
	{
		menubtn.click();
	}
	
	public String costOfSonyProduct()
	{
		return costOfSony.getText();
	}
	
	public void clickOnItem()
	{
		detailPage.click();
	}
	
	public String detailPages()
	{
		return detailPagePrice.getText();
	}

}
