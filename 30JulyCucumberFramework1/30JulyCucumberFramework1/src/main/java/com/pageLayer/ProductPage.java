package com.pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
 private WebDriver driver;
 
	 public ProductPage(WebDriver driver)
	 {
		 this.driver=driver;
	 }
	
	 //obj repository
	 
	 private By product1 = By.xpath("//li[@class='item product product-item']");
	 
	 
	 //Action Method
	 
	 public void clickOnProduct()
	 {
		 driver.findElement(product1).click();
	 }
	 
	 
	 

}

