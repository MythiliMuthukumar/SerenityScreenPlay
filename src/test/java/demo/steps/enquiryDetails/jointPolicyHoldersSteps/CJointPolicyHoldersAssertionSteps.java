package demo.steps.enquiryDetails.jointPolicyHoldersSteps;

import demo.enums.EYesNoOption;
import demo.exceptions.CEnquiryFormDetailsPageException;
import demo.userInterface.enquiryDetailsPage.CJointPolicyHoldersLocators;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class CJointPolicyHoldersAssertionSteps {

    @Then("he should see the policyholder question {string} button")
    public void heShouldSeePolicyholderButton(String yesNobutton) {
        switch (EYesNoOption.fromString(yesNobutton)) {
            case YES:
                theActorInTheSpotlight().should(
                        seeThat(the(CJointPolicyHoldersLocators.POLICY_HOLDERS_YES_BUTTON), isPresent()));
                break;
            case NO:
                theActorInTheSpotlight().should(
                        seeThat(the(CJointPolicyHoldersLocators.POLICY_HOLDERS_NO_BUTTON), isPresent()));
                break;
            default:
                throw new CEnquiryFormDetailsPageException(String.format("Joint policyholder button '%s' is missing" , yesNobutton));
        }

    }

    @Then("he should see the {string} dialog screen")
    public void heShouldSeeTheDialogScreen(String arg0) {
    }

    @Then("he should see Add Details screen {string} option")
    public void heShouldSeeAddDetailsScreenOption(String arg0) {
    }

    @Then("he should see the Add Details screen {string} button")
    public void heShouldSeeTheAddDetailsScreenButton(String arg0) {
    }


    @Then("he should see the Add Joint policyholders button")
    public void heShouldSeeTheAddJointPolicyholdersButton() {
    }

}
