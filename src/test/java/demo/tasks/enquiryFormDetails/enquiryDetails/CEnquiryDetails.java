package demo.tasks.enquiryFormDetails.enquiryDetails;

import demo.userInterface.enquiryDetailsPage.CEnquiryDetailsCommonLocators;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

public class CEnquiryDetails {
    public static Performable scrollToBottomPage() {
        return Task.where("{0} Scroll to the bottom of the page ",
                Scroll.to(CEnquiryDetailsCommonLocators.COMPARE_QUOTES_BUTTON
                ));
    }

    public static Performable submitTheEnquiryForm() {
        return Task.where("{0} Click the Go to compare quote button ",
                Click.on(CEnquiryDetailsCommonLocators.COMPARE_QUOTES_BUTTON));
    }
}
