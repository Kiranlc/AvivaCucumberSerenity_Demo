package cucumberdemo.stepDfns;

import cucumberdemo.steps.AvivaIndiaSteps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class AvivaStepDfns {

	@Steps
	AvivaIndiaSteps avivaSteps;
	
	@Given("the user is on Aviva India Page")
	
	public void theuserisonAvivaIndiaPage()
	{
		avivaSteps.avivaHomePage();
	}
	
	@And("the User Clicks on Existing User")
	
	public void theUserClicksonExistingUser()
	{
		avivaSteps.clickExistingUserbutton();
	}
	
	@Then("the user clicks on pay premium")
	
	public void theuserclicksonpaypremium()
	{
		avivaSteps.clickPayPremium();
	}
	
    @Then("user clicks on submit without entering policyNumber and Date of birth")
	
	public void userclicksonsubmitwithoutenteringpolicyNumberandDateofbirth()
	{
		avivaSteps.clickSubmit();
	}
    
     @Then("user should see '(.*)'")
	
	public void usershouldseeerrorMsg(String error)
	{
		avivaSteps.validateErrorMsg(error);
	}

}
