package stepDefinitions;

import com.pageLayer.ProductPage;

import driverFactory.DriverFactory;
import io.cucumber.java.en.When;

public class ProductpageSD {

	@When("click on any of the product")
	public void click_on_any_of_the_product() {
		
		ProductPage product_obj = new ProductPage(DriverFactory.getDriver());
		product_obj.clickOnProduct();
		
	 
	}
}
