package demo.tasks.enquiryFormDetails.safetyAndSecuritySection;

import demo.userInterface.enquiryDetailsPage.CSafetyAndSecuritySectionLocators;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class CAnswerSafetySecurityDetails {
    public static Performable keyOperatedLocksYes() {
        return Task.where("{0} Answer Yes to the key-operated locks",
                Click.on(CSafetyAndSecuritySectionLocators.SELF_CONTAINED_YES_BUTTON)
        );
    }

    public static Performable keyOperatedLocksNo() {
        return Task.where("{0} Answer No to the key-operated locks",
                Click.on(CSafetyAndSecuritySectionLocators.SELF_CONTAINED_NO_BUTTON)
        );
    }
}
