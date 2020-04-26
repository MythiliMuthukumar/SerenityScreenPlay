package demo.steps.enquiryDetails.coverDetailsSteps;

import demo.enums.ETodayTomorrowOption;
import demo.exceptions.CEnquiryFormDetailsPageException;
import demo.tasks.enquiryFormDetails.coverDetails.CChooseCoverStartDate;

import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.withCurrentActor;

public class CCoverDetailsTaskSteps {
    @When("he clicks cover start date {string} button")
    public void heClicksCoverStartDateButton(String todayTomorrowbutton) {
        switch (ETodayTomorrowOption.fromString(todayTomorrowbutton)) {
            case TODAY:
                withCurrentActor(CChooseCoverStartDate.chooseTodayasStartDate());
                break;
            case TOMORROW:
                withCurrentActor(CChooseCoverStartDate.chooseTomorrowasStartDate());
                break;
            default:
                throw new CEnquiryFormDetailsPageException(String.format("Cover Start date button '%s' is missing", todayTomorrowbutton));
        }

    }
}
