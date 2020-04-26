package demo.steps.enquiryDetails.safetyAndSecuritySteps;

import demo.enums.EYesNoOption;
import demo.exceptions.CEnquiryFormDetailsPageException;
import demo.tasks.enquiryFormDetails.safetyAndSecuritySection.CAnswerSafetySecurityDetails;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.withCurrentActor;

public class CSafetyAndSecurityTaskSteps {

    @When("he clicks self-contained {string} button")
    public void heClicksSelfContainedButton(String yesNobutton) {
        switch (EYesNoOption.fromString(yesNobutton)) {
            case YES:
                withCurrentActor(
                        CAnswerSafetySecurityDetails.keyOperatedLocksYes());
                break;
            case NO:
                withCurrentActor(
                        CAnswerSafetySecurityDetails.keyOperatedLocksNo());
                break;
            default:
                throw new CEnquiryFormDetailsPageException(String.format("Key-Operated Lock button '%s' is missing", yesNobutton));
        }
    }
}
