package cucumberdemo.pages;

import net.thucydides.core.annotations.DefaultUrl;

import org.junit.Assert;

import utilities.Utility;
import net.serenitybdd.core.pages.WebElementFacade;

import net.serenitybdd.core.annotations.findby.FindBy;

import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.avivaindia.com/")
public class AvivaIndiaPageObject extends PageObject {

	@FindBy(xpath = "//b[@class='customerIcon exCus']")
	private WebElementFacade existingCustomerButtom;

	@FindBy(xpath = "//span[contains(text(),'Pay Premium')]")
	private WebElementFacade payPremiumButton;

	@FindBy(id = "ctl00_ContentPlaceHolder1_ancSubmit")
	private WebElementFacade submitButton;

	@FindBy(id = "ctl00_ContentPlaceHolder1_lblError")
	private WebElementFacade errorMessage;

	public void userClicksExistingCustomer() {
		getDriver().manage().window().maximize();
		existingCustomerButtom.click();
		Utility.waitPageLoad(getDriver());

	}

	public void userClicksPayPremium() {
		payPremiumButton.click();
		Utility.waitPageLoad(getDriver());
	}

	public void userClicksSubmit() {
		submitButton.click();
		Utility.waitPageLoad(getDriver());
	}
	
	public void validateError(String errorMsg)
	{
		Assert.assertEquals("Expected error message is "+errorMsg,errorMsg, errorMessage.getText());
		getDriver().quit();
	}
}