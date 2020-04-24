package demo.steps.enquiryDetails.statementsAboutYouSteps;

import demo.custom_Interactions.CElementsClick;
import demo.userInterface.enquiryDetailsPage.CStatementsAboutYouLocators;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CStatementAboutYouActionSteps {
    @When("he clicks {string} button in the statements about you section")
    public void heClicksButtonOnStatementsAboutYouSection(String agreeDisagreeButton) {
        switch (agreeDisagreeButton) {
            case "I agree":
                theActorInTheSpotlight().attemptsTo( CElementsClick.on(CStatementsAboutYouLocators.I_AGREE_BUTTON,0));
                break;
            case "I disagree":
                theActorInTheSpotlight().attemptsTo( CElementsClick.on(CStatementsAboutYouLocators.I_DISAGREE_BUTTON,0));
                break;
        }
    }
}
