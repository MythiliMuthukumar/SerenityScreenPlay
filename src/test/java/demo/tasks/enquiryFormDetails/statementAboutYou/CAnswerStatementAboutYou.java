package demo.tasks.enquiryFormDetails.statementAboutYou;

import demo.custom_Interactions.CElementsClick;
import demo.userInterface.enquiryDetailsPage.CStatementsAboutYouLocators;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

public class CAnswerStatementAboutYou {
    public static Performable agreeTheStatements( ) {
        return Task.where("{0} Agree the statements ",
                CElementsClick.on(CStatementsAboutYouLocators.I_AGREE_BUTTON,0)
        );
    }

    public static Performable disagreeTheStatements( ) {
        return Task.where("{0} Disagree the statements",
                CElementsClick.on(CStatementsAboutYouLocators.I_DISAGREE_BUTTON,0)
        );
    }
}
