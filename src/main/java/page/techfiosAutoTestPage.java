package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import junit.framework.Assert;

import org.openqa.selenium.WebDriver;

public class techfiosAutoTestPage {

	WebDriver driver;

	public techfiosAutoTestPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//span[@id=\"extra\"]/button[1]")
	WebElement SET_SKYBLUE_BACKGROUND;
	@FindBy(how = How.XPATH, using = "//button[@onclick='myFunctionWhite()']")
	WebElement SET_WHITE_BACKGROUND;
	@FindBy(how = How.XPATH, using = "//body[@style = 'background-color: skyblue;']")
	WebElement SKYBLUE_BACKGROUND_ELEMENT;
	@FindBy(how = How.XPATH, using = "//body[@style = 'background-color: white;']")
	WebElement WHITE_BACKGROUND_ELEMENT;

	public void SetSkyBlueBackground() {
		Assert.assertEquals(SET_SKYBLUE_BACKGROUND.getText(), "Set SkyBlue Background");

	}

	public void clickOnBlueBackgroundButton() {
		SET_SKYBLUE_BACKGROUND.click();

	}

	public void TheBackgroundColorChangeToSkyBlue() {
		SKYBLUE_BACKGROUND_ELEMENT.getCssValue("background-color: skyblue;");
	}

	public void SetWhiteBackground() {
		Assert.assertEquals(SET_WHITE_BACKGROUND.getText(), "Set White Background");
	}

	public void clickOnWhiteBackgroundButton() {
		SET_WHITE_BACKGROUND.click();
	}

	public void TheBackgroundColorChangeToWhite() {
		SKYBLUE_BACKGROUND_ELEMENT.getCssValue("background-color: white;");
	}

}
