package cucumberdemo.steps;

import cucumberdemo.pages.AvivaIndiaPageObject;
import net.thucydides.core.annotations.Step;

public class AvivaIndiaSteps {

    AvivaIndiaPageObject avivaIndiaPage;
    
    @Step
    public void avivaHomePage()
    {
        avivaIndiaPage.open();
    }

    @Step
    public void clickExistingUserbutton() {
         avivaIndiaPage.userClicksExistingCustomer();
         }

    @Step
    public void clickPayPremium() {
    	avivaIndiaPage.userClicksPayPremium();
    }

    @Step
    public void clickSubmit() {
    	avivaIndiaPage.userClicksSubmit();
    }
    
    @Step
    public void validateErrorMsg(String error) {
    	avivaIndiaPage.validateError(error);
    }

}