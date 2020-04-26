package demo.steps.enquiryDetails.safetyAndSecuritySteps;

import demo.enums.EYesNoOption;
import demo.exceptions.CEnquiryFormDetailsPageException;
import demo.userInterface.enquiryDetailsPage.CSafetyAndSecuritySectionLocators;
import io.cucumber.java.en.Then;


import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class CSafetyAndSecurityAssertionSteps {
    @Then("he should see the accessible windows question {string} button")
    public void heShouldSeeTheAccessibleWindowsButton(String yesNobutton) {
        switch (EYesNoOption.fromString(yesNobutton)) {
            case YES:
                theActorInTheSpotlight().should(
                        seeThat(the(CSafetyAndSecuritySectionLocators.WINDOWS_KEY_LOCKS_YES_BUTTON), isPresent()));
                break;
            case NO:
                theActorInTheSpotlight().should(
                        seeThat(the(CSafetyAndSecuritySectionLocators.WINDOWS_KEY_LOCKS_NO_BUTTON), isPresent()));
                break;
            default:
                throw new CEnquiryFormDetailsPageException(String.format("Accessible windows question '%s' is missing", yesNobutton));
        }
    }

    @Then("he should see the following lock options and its image")
    public void heShouldSeeTheFollowingOptionAndItsImage(List<String> lockTypes) {
        AtomicInteger i = new AtomicInteger(0);
        lockTypes.forEach(lockType -> {
            i.getAndIncrement();
            theActorInTheSpotlight().should(
                    seeThat(the(CSafetyAndSecuritySectionLocators.DOOR_LOCKTYPE.of(lockType)), isVisible()),
                    seeThat(the(CSafetyAndSecuritySectionLocators.SELF_CONTAINED_LOCK_IMAGES.of(String.valueOf(i.get()))), isVisible())
            );
        });
    }

    @Then("he should see the Self-contained question {string} button")
    public void heShouldSeeTheSelfContainedQuestionButton(String arg0) {
    }
}
