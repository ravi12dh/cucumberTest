package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.BasePage;

import page.techfiosAutoTestPage;

public class stepDefinations extends BasePage {

	WebDriver driver;
	techfiosAutoTestPage TestPage;

	@Before
	public void init() {

		initDriver();
		driver=BasePage.initDriver();
		TestPage = PageFactory.initElements(driver, techfiosAutoTestPage.class);

	}

	@Given("^Set SkyBlue Background$")
	public void set_SkyBlue_Background()  {
		
		TestPage.SetSkyBlueBackground();

}
	@When("^I click on the button$")
	public void i_click_on_the_button() {
		
		TestPage.clickOnBlueBackgroundButton();
	}
	@Then("^the background color will change to sky blue$")
	public void the_background_color_will_change_to_sky_blue() {
		TestPage.clickOnBlueBackgroundButton();
		TestPage.TheBackgroundColorChangeToSkyBlue();
	}

	@Given("^Set SkyWhite Background$")
	public void set_SkyWhite_Background() throws Throwable {
		TestPage.SetWhiteBackground();
	}

	@When("^I click on the skyblueBackground button$")
	public void i_click_on_the_skyblueBackground_button() throws Throwable {
		TestPage.clickOnWhiteBackgroundButton();

	}

	@Then("^the background color will change to white$")
	public void the_background_color_will_change_to_white() throws Throwable {
		TestPage.clickOnWhiteBackgroundButton();
		TestPage.TheBackgroundColorChangeToWhite();
	}
}
