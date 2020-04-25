package demo.steps.enquiryDetails;

import demo.exceptions.CEnquiryFormDetailsPageException;
import demo.userInterface.enquiryDetailsPage.CEnquiryDetailsCommonLocators;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.ensure.Ensure;

import java.util.List;

import static demo.questions.enquiryFormDetails.CEnquiryDetailsScreen.seeTheHeadings;
import static demo.questions.enquiryFormDetails.CEnquiryDetailsScreen.seeTheStages;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class CEnquiryDetailsAssertionSteps {

    @Then("he should see the page title {string}")
    public void actorShouldSeeThePageTitle(String pageTitle) {
        theActorInTheSpotlight().attemptsTo(Ensure.thatTheCurrentPage().title().isEqualTo(pageTitle));
    }

    @Then("he should see the following stages are disabled")
    public void actorShouldSeeTheFollowingStagesAreDisabled(List<String> disabledStages) {
        theActorInTheSpotlight().should(
                seeTheStages(disabledStages)
        );
    }

    @Then("he should see the following section headings")
    public void actorShouldSeeTheFollowingSectionHeadings(List<String> headings) {
        theActorInTheSpotlight().should(
                seeTheHeadings(headings)
        );
    }

    @Then("he should see the {string} validation message")
    public void heShouldSeeTheValidationMessage(String validationMessage) {
        theActorInTheSpotlight().attemptsTo(Ensure.that(CEnquiryDetailsCommonLocators.VALIDATION_MESSAGE).text().isEqualTo(validationMessage));
    }
    @Then("he should see {string} button")
    public void actorShouldSeeButton(String compareQuoteButton) {
        theActorInTheSpotlight().should(
                seeThat(the(CEnquiryDetailsCommonLocators.COMPARE_QUOTES_BUTTON),isPresent()
                ).orComplainWith(CEnquiryFormDetailsPageException.class,
                        String.format("Missing Button '%s'", compareQuoteButton)));
    }

    @Then("he should see the validation messages for {int} fields")
    public void heShouldSeeTheValidationMessagesForFields(int noOfValidationMessage) {
        theActorInTheSpotlight().attemptsTo(
                Ensure.thatTheSetOf(CEnquiryDetailsCommonLocators.VALIDATION_MESSAGE)
                        .hasSize(noOfValidationMessage)
        );
    }

    @Then("he should see the {string} question")
    public void heShouldSeeQuestion(String policyHolderquestion) {
        theActorInTheSpotlight().should(
                seeThat(the(CEnquiryDetailsCommonLocators.QUESTION_LABEL.of(policyHolderquestion)), isVisible()));
    }
}
