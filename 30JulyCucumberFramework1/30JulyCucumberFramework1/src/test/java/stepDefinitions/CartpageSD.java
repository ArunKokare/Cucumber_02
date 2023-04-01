package stepDefinitions;

import com.pageLayer.CartPage;

import driverFactory.DriverFactory;
import io.cucumber.java.en.When;

public class CartpageSD {

	@When("Click on cart button")
	public void click_on_cart_button() {
	    
	}
	@When("click on proceed to checkout")
	public void click_on_proceed_to_checkout() {
		CartPage card_obj = new CartPage(DriverFactory.getDriver());
		card_obj.clickOnProceedToCheckOut();
	   
	}
}
