package demo.custom_Interactions;

import demo.userInterface.enquiryDetailsPage.CStatementsAboutYouLocators;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;

import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;

public class CWaitUntilElementVisible {
    public static Performable isSelected() {
        return Interaction.where("{0} waits until the elements  are visible",

               WaitUntil.the(CStatementsAboutYouLocators.I_AGREE_BUTTON,isCurrentlyVisible()));

    }
}