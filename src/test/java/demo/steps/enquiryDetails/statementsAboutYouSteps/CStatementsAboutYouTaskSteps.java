package demo.steps.enquiryDetails.statementsAboutYouSteps;

import demo.tasks.enquiryFormDetails.statementsAboutYou.CAnswerStatementsAboutYou;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.withCurrentActor;

public class CStatementsAboutYouTaskSteps {
    @When("he clicks {string} button in the statements about you section")
    public void heClicksButtonOnStatementsAboutYouSection(String agreeDisagreeButton) {
        switch (agreeDisagreeButton) {
            case "I agree":
                withCurrentActor(CAnswerStatementsAboutYou.agreeTheStatements());
                break;
            case "I disagree":
                withCurrentActor(CAnswerStatementsAboutYou.disagreeTheStatements());
                break;
        }
    }
}
