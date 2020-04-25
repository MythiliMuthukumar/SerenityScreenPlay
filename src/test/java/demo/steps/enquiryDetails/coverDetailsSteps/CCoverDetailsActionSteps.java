package demo.steps.enquiryDetails.coverDetailsSteps;

import demo.enums.ETodayTomorrowOption;
import demo.exceptions.CEnquiryFormDetailsPageException;
import demo.userInterface.enquiryDetailsPage.CCoverDetailsLocators;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class CCoverDetailsActionSteps {
    @When("he clicks cover start date {string} button")
    public void heClicksCoverStartDateButton(String todayTomorrowbutton) {
        switch (ETodayTomorrowOption.fromString(todayTomorrowbutton)) {
            case TODAY:
                theActorInTheSpotlight().attemptsTo(Click.on(CCoverDetailsLocators.COVER_DATE_TODAY));
                break;
            case TOMORROW:
                theActorInTheSpotlight().attemptsTo(Click.on(CCoverDetailsLocators.COVER_DATE_TOMORROW));
                break;
            default:
                throw new CEnquiryFormDetailsPageException(String.format("Cover Start date button '%s' is missing", todayTomorrowbutton));
        }

    }
}
