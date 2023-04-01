package com.utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UtilClass {
	
	public WebElement waitForElement(WebDriver driver,WebElement ref)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		WebElement xyz = wait.until(ExpectedConditions.elementToBeClickable(ref));
		return xyz;
	}

}
