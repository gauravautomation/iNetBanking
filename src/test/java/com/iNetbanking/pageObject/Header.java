package com.iNetbanking.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Header {
	
	WebDriver ldriver;
	public Header(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(className="desktopLogo")
	@CacheLookup
	WebElement primaryLogo;
	
	@FindBy(xpath="//*[@id=\"logosCont\"]/div[1]/a/img")
	@CacheLookup
	WebElement SecLogo1;
	
	@FindBy(xpath="//*[@id=\"logosCont\"]/div[2]/a/img")
	@CacheLookup
	WebElement SecLogo2;
	
	@FindBy(xpath="//*[@id=\"logosCont\"]/div[3]/a/img")
	@CacheLookup
	WebElement SecLogo3;
	
	@FindBy(xpath="//*[@id=\"logosCont\"]/div[4]/a/img")
	@CacheLookup
	WebElement SecLogo4;
	
	@FindBy(xpath="//*[@id=\"logosCont\"]/div[5]/a/img")
	@CacheLookup
	WebElement SecLogo5;
	
	
	public boolean primaryLogo()
	{
		return primaryLogo.isDisplayed();
	}
	
	public boolean secLogo1()
	{
		return SecLogo1.isDisplayed();
	}
	
	public boolean secLogo2()
	{
		return SecLogo2.isDisplayed();
	}
	
	public boolean secLogo3()
	{
		return SecLogo3.isDisplayed();
	}
	
	public boolean secLogo4()
	{
		return SecLogo4.isDisplayed();
	}
	
	public boolean secLogo5()
	{
		return SecLogo5.isDisplayed();
	}

}
