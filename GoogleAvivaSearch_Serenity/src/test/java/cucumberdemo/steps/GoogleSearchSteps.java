package cucumberdemo.steps;

import cucumberdemo.pages.GoogleSearchPageObject;
import net.thucydides.core.annotations.Step;

public class GoogleSearchSteps {
 GoogleSearchPageObject googlePage;
 
 @Step
 public void openGoogle()
 {
	 googlePage.open();
 }
 
 @Step
 public void enterAvivaInSearchBar(String keyword)
 {
	 googlePage.enterAviva(keyword);
 }
 
 public void clickSearchButton()
 {
	 googlePage.clickSearchButton();
 }
 
 public void printLinkCount()
 {
	 googlePage.getLinkCount();
 }
 
 public void printtextOf3rdLink()
 {
	 googlePage.getLinkTextOf3rdLink();
 }
 
}
 