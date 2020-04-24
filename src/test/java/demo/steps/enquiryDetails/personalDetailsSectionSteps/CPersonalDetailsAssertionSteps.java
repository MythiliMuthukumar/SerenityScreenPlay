package demo.steps.enquiryDetails.personalDetailsSectionSteps;

import demo.userInterface.enquiryDetailsPage.CEnquiryDetailsLocators;
import demo.userInterface.enquiryDetailsPage.CPersonalDetailsSectionLocators;

import io.cucumber.java.en.Then;

import java.util.List;

import static demo.questions.enquiryFormDetails.CEnquiryDetailsScreen.seeTheHeadings;
import static demo.questions.enquiryFormDetails.CEnquiryDetailsScreen.seeTheStages;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import net.serenitybdd.screenplay.ensure.Ensure;

import io.cucumber.java.en.When;


public class CPersonalDetailsAssertionSteps {

    @Then("he should see the {string} in the first name field")
    public void heShouldSeeTheInTheFirstNameField(String firstName) {
        theActorInTheSpotlight().attemptsTo(Ensure.that(CPersonalDetailsSectionLocators.FIRST_NAME).value().isEqualTo(firstName));
    }

    @Then("he should see the {string} validation message")
    public void heShouldSeeTheValidationMessage(String validationMessage) {
        theActorInTheSpotlight().attemptsTo(Ensure.that(CEnquiryDetailsLocators.VALIDATION_MESSAGE).text().isEqualTo(validationMessage));
    }

    @Then("he should see all the available personal details help button")
    public void heShouldSeeAllTheAvailablePersonalDetailsHelpButton() {
        theActorInTheSpotlight().should(
                seeThat(the(CPersonalDetailsSectionLocators.TITLE_HELP_BUTTON), isPresent()),
                seeThat(the(CPersonalDetailsSectionLocators.FIRST_NAME_HELP_BUTTON), isPresent()),
                seeThat(the(CPersonalDetailsSectionLocators.LAST_NAME_HELP_BUTTON), isPresent()),
                seeThat(the(CPersonalDetailsSectionLocators.DATE_OF_BIRTH_HELP_BUTTON), isPresent()),
                seeThat(the(CPersonalDetailsSectionLocators.OCCUPATION_HELP_BUTTON), isPresent()),
                seeThat(the(CPersonalDetailsSectionLocators.ANYBODY_SMOKE_HELP_BUTTON), isPresent()),
                seeThat(the(CPersonalDetailsSectionLocators.EMAIL_HELP_BUTTON), isPresent())
        );

    }

}
