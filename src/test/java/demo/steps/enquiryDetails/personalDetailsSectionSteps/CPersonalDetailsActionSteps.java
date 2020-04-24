package demo.steps.enquiryDetails.personalDetailsSectionSteps;

import demo.tasks.enquiryFormDetails.enterPersonalDetails.CEnterPersonalDetails;
import demo.tasks.navigation.CNavigateTo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CPersonalDetailsActionSteps {

    @Given("{string} is on the home insurance enquiry details page")
    public void actorisOnTheHomeInsuranceEnquiryDetailsPage(String actor) {
        theActorCalled(actor).attemptsTo(CNavigateTo.homeInsuranceEnquiryDetailsPage());
    }
    @When("he enters first name as {string}")
    public void actorEntersFirstNameAs(String firstName) {
        theActorInTheSpotlight().attemptsTo(CEnterPersonalDetails.enterFirstName(firstName));
    }

    @When("he click the first name field without entering value")
    public void heClickTheFirstNameFieldWithoutEnteringValue() {
        theActorInTheSpotlight().attemptsTo(CEnterPersonalDetails.enterWithoutFirstName());
    }

}
