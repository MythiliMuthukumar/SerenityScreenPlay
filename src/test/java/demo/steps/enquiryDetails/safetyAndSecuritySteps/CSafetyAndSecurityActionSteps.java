package demo.steps.enquiryDetails.safetyAndSecuritySteps;

import demo.enums.EYesNoOption;
import demo.exceptions.CEnquiryFormDetailsPageException;
import demo.userInterface.enquiryDetailsPage.CSafetyAndSecuritySectionLocators;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class CSafetyAndSecurityActionSteps {

    @When("he clicks self-contained {string} button")
    public void heClicksSelfContainedButton(String yesNobutton) {
        switch (EYesNoOption.fromString(yesNobutton)) {
            case YES:
                theActorInTheSpotlight().attemptsTo(
                        Click.on(CSafetyAndSecuritySectionLocators.SELF_CONTAINED_YES_BUTTON));
                break;
            case NO:
                theActorInTheSpotlight().attemptsTo(
                        Click.on(CSafetyAndSecuritySectionLocators.SELF_CONTAINED_NO_BUTTON));
                break;
            default:
                throw new CEnquiryFormDetailsPageException(String.format("Joint policyholder button '%s' is missing" , yesNobutton));
        }
    }
}
