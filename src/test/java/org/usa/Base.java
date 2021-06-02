package org.usa;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	public static WebDriver driver;
	
	public void lanuchbrowser () {
	System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\LeafTest\\lib\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();


		
	}
	public void url(String url) {
		driver.get(url);
		
	}
	
	public void type(WebElement ele,String aa) {
		
		ele.sendKeys(aa);
		
	}
public void click(WebElement qlq) {
	qlq.click();
	
	
	
}
private void windowshand() {
	

}
}

