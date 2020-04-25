package demo.steps.enquiryDetails;

import demo.userInterface.enquiryDetailsPage.CEnquiryDetailsCommonLocators;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CEnquiryDetailsActionSteps {
    @When("he scroll to the bottom of the page without entering any values")
    public void heScrollToTheBottomPage() {
        theActorInTheSpotlight().attemptsTo(Scroll.to(CEnquiryDetailsCommonLocators.COMPARE_QUOTES_BUTTON));
    }

    @And("he click the {string} submit button")
    public void heClickTheSubmitButton(String button) {
        theActorInTheSpotlight().attemptsTo(Click.on(CEnquiryDetailsCommonLocators.COMPARE_QUOTES_BUTTON));
    }
}
