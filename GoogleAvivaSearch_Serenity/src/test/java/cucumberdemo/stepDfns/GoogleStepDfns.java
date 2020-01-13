package cucumberdemo.stepDfns;

import net.thucydides.core.annotations.Steps;
import cucumberdemo.steps.GoogleSearchSteps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class GoogleStepDfns {

    @Steps
    GoogleSearchSteps googleSteps;

    @Given("the User is on Google search Page")
    public void theUserisonGooglesearhPage() {
    	googleSteps.openGoogle();
    }

    @When("the User Enters '(.*)' in search bar")
    public void theUserEntersAvivainsearchbar(String keyword) {
    	googleSteps.enterAvivaInSearchBar(keyword);
    }

    @And("the user clicks on search button")
    public void theuserclicksonsearchbutton() {
    	googleSteps.clickSearchButton();
    }
    
    @Then("the User gets the links count on search page")
    public void theUsergetsthelinkscountonsearchpage()
    {
    	googleSteps.printLinkCount();
    }
    
    @Then("the user prints the text of 3rd link in the search result")
    public void theuserprintsthetextof5thlinkinthesearchresult()
    {
    	googleSteps.printtextOf3rdLink();
    }

}
