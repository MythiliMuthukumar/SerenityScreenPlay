package demo.steps.enquiryDetails.insuranceHistorySteps;

import demo.userInterface.enquiryDetailsPage.CInsuranceHistorySectionLocators;
import io.cucumber.java.en.Then;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class CInsuranceHistoryAssertionSteps {
    @Then("he should see the below insurance history dropdown options")
    public void heShouldSeeTheBelowInsuranceHistoryDropdownOptions(List<String> years) {
        years.forEach(yearOption ->
            theActorInTheSpotlight().should(
                    seeThat(the(CInsuranceHistorySectionLocators.CONSECUTIVE_YEAR_OPTIONS.of(yearOption)), isVisible())
        )
        );
    }
}
