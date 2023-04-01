package stepDefinitions;

import com.pageLayer.ProductDetailPage;

import driverFactory.DriverFactory;
import io.cucumber.java.en.When;

public class ProductdetailspageSD {
     public ProductDetailPage product_detail_obj;
	
	@When("select\\/ click on colour and size")
	public void select_click_on_colour_and_size() {
		product_detail_obj = new ProductDetailPage(DriverFactory.getDriver());
		product_detail_obj.clickColourBox();
		product_detail_obj.clickSizeBox();
		
	}
	@When("click on add to cart")
	public void click_on_add_to_cart() {
		product_detail_obj.clickOnAddToCard();
		product_detail_obj.clickOnShoppingCardLink();

	    
	}
}
