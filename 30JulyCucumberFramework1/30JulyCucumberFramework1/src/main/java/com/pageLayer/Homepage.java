package com.pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

	private WebDriver driver;
	public Homepage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//----------- Obj repo ---------------------------
	private By men_link = By.xpath("//span[contains(text(),'Men')]");
	private By men_top_link = By.xpath("//a[@id='ui-id-17']");
	private By men_top_jacket_link = By.xpath("//a[@id='ui-id-19']");
	
	
	//-------------- Action method -----------------------------
	public void clickOnJacket()
	{
		WebElement men = driver.findElement(men_link);
		WebElement top = driver.findElement(men_top_link);
		WebElement jacket = driver.findElement(men_top_jacket_link);
		
		Actions act = new Actions(driver);
		act.moveToElement(men).moveToElement(top).moveToElement(jacket).click().build().perform();
	}
	
}
