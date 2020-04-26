package demo.tasks.enquiryFormDetails.personalDetails;

import demo.userInterface.enquiryDetailsPage.CPersonalDetailsSectionLocators;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.actions.Enter;

import static org.openqa.selenium.Keys.RETURN;

public class CEnterPersonalDetails {

    public static Performable enterFirstName(String firstName) {
        return Task.where("{0} Enter his First Name #firstName",
                Clear.field(CPersonalDetailsSectionLocators.FIRST_NAME),
                Enter.theValue(firstName).into(CPersonalDetailsSectionLocators.FIRST_NAME).thenHit(RETURN)
        ).with("firstName").of(firstName);
    }

    public static Performable enterWithoutFirstName() {
        return Task.where("{0} Clicks another field without entering his first name ",
                Clear.field(CPersonalDetailsSectionLocators.FIRST_NAME),
                Click.on(CPersonalDetailsSectionLocators.FIRST_NAME),
                Click.on(CPersonalDetailsSectionLocators.LAST_NAME)
        );
    }
    public static Performable selectTitleFromDropDown(String titleOption) {
        return Task.where("{0} Select title from dropdown ",
                SelectFromOptions.byVisibleText(titleOption)
                        .from(CPersonalDetailsSectionLocators.TITLE));
    }
}
