package com.qa.techpanda.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.techpanda.Base.TestBase;

public class TestCase3 extends TestBase{
	
	@FindBy(xpath="//*[contains(text(),'Mobile')]")
	WebElement menubtn;
	
	@FindBy(xpath="//*[@class='item last'][3]//button")
	WebElement cartbtn;
	
	@FindBy(xpath="//input[@title='Qty']")
	WebElement quantity;
	
	@FindBy(xpath="//*[@title='Update']")
	WebElement updateBtn;
	
	@FindBy(xpath="//*[@class='product-cart-info']//p")
	WebElement errormsg;
	
	@FindBy(xpath="//*[@title='Empty Cart']")
	WebElement emptycartBtn;
	
	@FindBy(xpath="//*[@class='main-container col1-layout']//h1")
	WebElement cartEmptymessage;
	
	public TestCase3()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnMenuOption()
	{
		menubtn.click();
	}
	
	public void clickOnCart()
	{
		cartbtn.click();
	}
	public void settingQuantity(String qtyprd)
	{
		quantity.sendKeys(qtyprd);
	}
		
	public void clickOnUpdatingbtn()
	{
		updateBtn.click();
	}

	public String verifyingErrorMsg()
	{
		return errormsg.getText();
	}
	
	public void clickOnEmptyCart()
	{
		emptycartBtn.click();
	}
	
	public String verifyingEmptyCartpage()
	{
		return cartEmptymessage.getText();
	}

}
