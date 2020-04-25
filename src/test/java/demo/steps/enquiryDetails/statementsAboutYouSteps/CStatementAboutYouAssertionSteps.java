package demo.steps.enquiryDetails.statementsAboutYouSteps;

import demo.exceptions.CEnquiryFormDetailsPageException;
import demo.userInterface.enquiryDetailsPage.CStatementsAboutYouLocators;

import io.cucumber.java.en.Then;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class CStatementAboutYouAssertionSteps {

    @Then("he should see {string} button is selected")
    public void heShouldSeeAgreeDisagreeButtonIsSelected(String agreeDisagreeButton) {

        switch (agreeDisagreeButton) {
            case "I agree":
                theActorInTheSpotlight().should(
                        seeThat(the(CStatementsAboutYouLocators.SELECTED_I_AGREE_BUTTON), isPresent()));
                break;
            case "I disagree":
                theActorInTheSpotlight().should(
                        seeThat(the(CStatementsAboutYouLocators.SELECTED_I_DISAGREE_BUTTON), isPresent()));
                break;
            default:
                throw new CEnquiryFormDetailsPageException(String.format("Statement About you section button '%s' is missing" , agreeDisagreeButton));
        }
    }

    @Then("he should see the listed group statements")
    public void heShouldSeeTheListedGroupStatements() {
    }

}


