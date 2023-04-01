package driverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
	
	public static ThreadLocal<WebDriver> tl = new ThreadLocal<WebDriver>();

	private WebDriver driver;
	
	public WebDriver initBrowser(String br)
	{
		if(br.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
			tl.set(driver);
		}
		else if(br.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
			tl.set(driver);
		}
		else if(br.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
			tl.set(driver);
		}
		else
		{
			System.out.println("Provide correct browser name");
		}
		
		return getDriver();
	}

	public static synchronized  WebDriver getDriver() {
		// TODO Auto-generated method stub
		return tl.get();
	}
	
}
