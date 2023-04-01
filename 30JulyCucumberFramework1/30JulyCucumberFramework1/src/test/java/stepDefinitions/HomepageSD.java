package stepDefinitions;

import com.pageLayer.Homepage;

import driverFactory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class HomepageSD {


	@Given("user is on homepage")
	public void user_is_on_homepage() {
	  
		System.out.println("User us on homepage");
	}
	

	@When("user mouse hover on Men and Top and Jackets and click here")
	public void user_mouse_hover_on_men_and_top_and_jackets_and_click_here() {
		
		Homepage homepage_obj = new Homepage(DriverFactory.getDriver());
		homepage_obj.clickOnJacket();
	}
}
