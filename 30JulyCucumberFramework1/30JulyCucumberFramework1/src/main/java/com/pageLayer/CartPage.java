package com.pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
	 private WebDriver driver;
	 
	 public CartPage(WebDriver driver)
	 {
		 this.driver=driver;
	 }
	 
	// obj repository
	
	 private By proceed_checkout_btn =By.xpath("//span[contains(text(),'Proceed to Checkout')]");
	 
	//Action Method
	 
	 public void clickOnProceedToCheckOut()
	 {
		 driver.findElement(proceed_checkout_btn).click();
		 
	 }

}
