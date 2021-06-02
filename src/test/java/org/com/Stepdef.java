package org.com;

import java.awt.event.WindowStateListener;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.usa.Base;
import org.usa.Loginpage;
import org.usa.Productspage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdef extends Base {
Loginpage l;
Productspage p;

@Given("user open the Login page")
public void user_open_the_Login_page() {
	lanuchbrowser();
	url("https://www.amazon.in/ap/signin?_encoding=UTF8&openid.assoc_handle=inflex&openid.claimed_id=h"
			+ "ttp%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2"
			+ "F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.n"
			+ "s=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2"
			+ "Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhom"
			+ "e%3Fie%3DUTF8%26action%3Dsign-out%26path%3D%252Fgp%252Fyourstore%252Fhome%26ref_%3Dnav"
			+ "_AccountFlyout_signout%26signIn%3D1%26useRedirectOnSuccess%3D1");
	
    }

@When("user logging into page wth valid username and password")
public void user_logging_into_page_wth_valid_username_and_password() {
	Loginpage l=new Loginpage();
	
	WebElement textusername = l.getTextusername();
	type(textusername, "8870161792");
    WebElement textusername2 = l.getContinu();
    click(textusername2);
    
    WebElement pass = l.getPass();
	type(pass, "preneetha20");
	WebElement signin = l.getSignin();
	click(signin);
    }

@When("user adding a product to cart")
public void user_adding_a_product_to_cart() throws InterruptedException {
	Productspage p=new Productspage();
	WebElement searchbox = p.getSearchbox();
	type(searchbox,"oneplus 8t");
	
	WebElement searchclick = p.getSearchclick();
	click(searchclick);
	Thread.sleep(3000);

	WebElement phone = p.getPhone();
	click(phone);
	Thread.sleep(3000);

	String parentwindow = driver.getWindowHandle();
	System.out.println(parentwindow);
	Set<String> allwindow = driver.getWindowHandles();
	System.out.println(allwindow);
		for (String eachwindow : allwindow) {
			if(!eachwindow.equals(parentwindow)) {
				driver.switchTo().window(eachwindow);
				
				
			}
		}
	
	

	WebElement element = p.getClick();
	element.click();
	
	
   }

@Then("user is able to add the prodcut to cart or not")
public void user_is_able_to_add_the_prodcut_to_cart_or_not() {
	System.out.println("user able to add product to the cart");
	
    }


}
