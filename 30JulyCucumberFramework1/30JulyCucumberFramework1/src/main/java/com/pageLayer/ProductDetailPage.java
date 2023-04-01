package com.pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage {
	
	private WebDriver driver;
	 
	 public ProductDetailPage(WebDriver driver)
	 {
		 this.driver=driver;
	 }
	
	 //obj repository
	 
	 private By size_box = By.xpath("//div[@id='option-label-size-143-item-166']");
	 private By colour_box = By.xpath("//div[@id='option-label-color-93-item-50']");
	 private By add_to_card_btn = By.xpath("//span[contains(text(),'Add to Cart')]");
	 private By shopping_card_link = By.xpath("//a[contains(text(),'shopping cart')]");

	 
	 //Action Method
	 
	 public void clickSizeBox()
	 {
		 driver.findElement(size_box).click();
	 }
	 
	 public void clickColourBox()
	 {
		 driver.findElement(colour_box).click();
	 }
	 
	 public void clickOnAddToCard()
	 {
		 driver.findElement(add_to_card_btn).click();
	 }
	 public void clickOnShoppingCardLink()
	 {
		 driver.findElement(shopping_card_link).click();
	 }
}
