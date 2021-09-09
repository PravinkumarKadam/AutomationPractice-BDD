package stepDepinations;

import base.TestContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ChangeImageColor_StepDef extends TestContext {

	
	@When("user Select the category as T-Shirts")
	public void user_select_the_category_as_t_shirts() {
		changeImageColor_PageObject.select_category_t_shirts();
	}

	@When("Click on Color Blue link")
	public void click_on_color_blue_link() {
		changeImageColor_PageObject.click_on_color_blue();
	}

	@Then("Check the Image is changed")
	public void check_the_image_is_changed() {
		changeImageColor_PageObject.check_image_is_changed();
	}


}
