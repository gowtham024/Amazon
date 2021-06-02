package org.usa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage extends Base {
	public Loginpage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@type=\"email\"]")
	private WebElement textusername;
	
	public WebElement getTextusername() {
		return textusername;
	}

	public WebElement getContinu() {
		return continu;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getSignin() {
		return signin;
	}

	@FindBy(xpath ="//input [@id=\"continue\"]")
	private WebElement continu;
	
	@FindBy(xpath = "//input[@type=\"password\"]")
	private WebElement pass;
	
	@FindBy (id ="signInSubmit")
	private WebElement signin;
}
