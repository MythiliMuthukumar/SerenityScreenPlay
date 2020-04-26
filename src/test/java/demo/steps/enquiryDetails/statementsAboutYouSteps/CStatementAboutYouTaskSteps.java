package demo.steps.enquiryDetails.statementsAboutYouSteps;

import demo.tasks.enquiryFormDetails.statementAboutYou.CAnswerStatementAboutYou;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.withCurrentActor;

public class CStatementAboutYouTaskSteps {
    @When("he clicks {string} button in the statements about you section")
    public void heClicksButtonOnStatementsAboutYouSection(String agreeDisagreeButton) {
        switch (agreeDisagreeButton) {
            case "I agree":
                withCurrentActor(CAnswerStatementAboutYou.agreeTheStatements());
                break;
            case "I disagree":
                withCurrentActor(CAnswerStatementAboutYou.disagreeTheStatements());
                break;
        }
    }
}
