package demo.steps.enquiryDetails;

import demo.tasks.enquiryFormDetails.enquiryDetails.CEnquiryDetails;
import demo.tasks.navigation.CNavigateTo;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class CEnquiryDetailsTaskSteps {

    @Given("{string} is on the home insurance enquiry details page")
    public void actorisOnTheHomeInsuranceEnquiryDetailsPage(String actor) {
        theActorCalled(actor).attemptsTo(CNavigateTo.homeInsuranceEnquiryDetailsPage());
    }
    @When("he scroll to the bottom of the page without entering any values")
    public void heScrollToTheBottomPage() {
        withCurrentActor(CEnquiryDetails.scrollToBottomPage());
    }

    @And("he click the {string} submit button")
    public void heClickTheSubmitButton(String button) {
        withCurrentActor(CEnquiryDetails.submitTheEnquiryForm());
    }
}
