package org.usa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Productspage extends Base {
	public Productspage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="twotabsearchtextbox")
     private WebElement searchbox;
	
	@FindBy(id="nav-search-submit-button")
	private WebElement searchclick;
	
	@FindBy(xpath="//span[@class=\"a-size-medium a-color-base a-text-normal\"][1]")
	private WebElement phone;
	
	@FindBy(id="add-to-cart-button")
	private WebElement click1;

	public WebElement getSearchbox() {
		return searchbox;
	}

	public WebElement getSearchclick() {
		return searchclick;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getClick() {
		return click1;
	}
	

}
