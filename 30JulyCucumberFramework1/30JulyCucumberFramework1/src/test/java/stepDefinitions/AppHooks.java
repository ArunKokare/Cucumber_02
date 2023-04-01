package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import com.utilities.ReadConfig;

import driverFactory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class AppHooks {

	private WebDriver driver;
	private ReadConfig readconfig;
	private DriverFactory driver_factory;

	@Before
	public void setUp()
	{
		readconfig = new ReadConfig();
		driver_factory = new DriverFactory();
	//
		driver = driver_factory.initBrowser(readconfig.getBrowserName());
		driver.get(readconfig.getApplicationUrl());
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@After
	public void tearDown()
	{
//		driver.quit();
	}
}
