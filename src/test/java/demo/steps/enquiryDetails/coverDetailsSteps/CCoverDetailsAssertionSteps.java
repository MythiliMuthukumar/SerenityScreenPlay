package demo.steps.enquiryDetails.coverDetailsSteps;

import demo.enums.ETodayTomorrowOption;

import demo.exceptions.CEnquiryFormDetailsPageException;
import demo.userInterface.enquiryDetailsPage.CCoverDetailsLocators;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.ensure.Ensure;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;


public class CCoverDetailsAssertionSteps {

    @Then("he should see the cover start date {string} button")
    public void heShouldSeeTheCoverStartButton(String date) {
        switch (ETodayTomorrowOption.fromString(date)) {
            case TODAY:
                theActorInTheSpotlight().should(
                        seeThat(the(CCoverDetailsLocators.COVER_DATE_TODAY), isVisible()));
                break;
            case TOMORROW:
                theActorInTheSpotlight().should(
                        seeThat(the(CCoverDetailsLocators.COVER_DATE_TOMORROW), isVisible()));
                break;
            default:
                throw new CEnquiryFormDetailsPageException(String.format("Cover Start date button '%s' is missing", date));
        }
    }

    @Then("he should see {string} date in the cover start date field")
    public void heShouldSeeDateInTheCoverStartDateField(String date) {

        switch (ETodayTomorrowOption.fromString(date)) {
            case TODAY:
                LocalDate localDate = LocalDate.now();
                theActorInTheSpotlight().attemptsTo(
                        Ensure.that(CCoverDetailsLocators.COVER_DATE_FIELD).value().asADate().isEqualTo(localDate)
                );
                break;
            case TOMORROW:
                LocalDate tomorrow = LocalDate.from(new Date().toInstant()
                        .atZone(ZoneId.of("Europe/London")).plusDays(1));
                theActorInTheSpotlight().attemptsTo(
                        Ensure.that(CCoverDetailsLocators.COVER_DATE_FIELD).value().asADate().isEqualTo(tomorrow)
                );
                break;
            default:
                throw new CEnquiryFormDetailsPageException(String.format("Cover Start date is not correct. Expected :'%s'", date));
        }
    }

}
