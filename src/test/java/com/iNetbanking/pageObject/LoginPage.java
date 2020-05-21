package com.iNetbanking.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	

		WebDriver ldriver;
		
		public LoginPage(WebDriver rdriver)
		{
			ldriver=rdriver;
			PageFactory.initElements(rdriver, this);
		}
		
		@FindBy(name="uid")
		@CacheLookup
		WebElement txtUserName;
		
		@FindBy(name="password")
		@CacheLookup
		WebElement txtPassword;
		
		@FindBy(name="btnLogin")
		@CacheLookup
		WebElement btnLogIn;
		
		public void setUsername(String user)
		{
			txtUserName.sendKeys(user);
		}
		
		public void setPassword(String Password)
		{
			txtPassword.sendKeys(Password);
		}
		
		public void clickLogin()
		{
			btnLogIn.click();
		}
	}

