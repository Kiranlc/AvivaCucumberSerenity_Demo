package cucumberdemo.pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.Utility;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.google.com")

public class GoogleSearchPageObject extends PageObject {

	@FindBy(name = "q")
	private WebElementFacade searchBar;

	@FindBy(name = "btnK")
	private WebElementFacade SearchButton;

	public void enterAviva(String keyword) {
		getDriver().manage().window().maximize();
		getDriver().manage().deleteAllCookies();
		searchBar.sendKeys(keyword);
	}

	public void clickSearchButton() {
		SearchButton.click();
		Utility.waitPageLoad(getDriver());
	}

	public void getLinkCount() {
		List<WebElement> links = getDriver().findElements(By.xpath("//a/h3"));
		Assert.assertTrue(links.size() > 0);
		System.out.println("Total Links displayed in search result are - "+links.size());
	}

	public void getLinkTextOf3rdLink() {
		List<WebElement> links = getDriver().findElements(By.xpath("//a/h3"));
		String text = links.get(2).getText();				
		System.out.println(text);
	}

}
