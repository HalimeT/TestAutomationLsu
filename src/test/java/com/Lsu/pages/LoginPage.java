package com.Lsu.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Lsu.utils.BaseClass;

public class LoginPage extends BaseClass{
	@FindBy(id="txtUsername")
	public WebElement username;
	
	
	@FindBy(name="txtPassword")
	public WebElement password;
	
	@FindBy(id="btnLogin")
	public WebElement btnLogin;
	
	@FindBy(css="img[src*='logo.png']")
	public WebElement logo;
	
	@FindBy(xpath="//div[@class='toast-message']   ")
	public WebElement message;
	
	
	//initialize all of our variables
	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
	public void enterUsername() {
		
	}

}
