package demo.tasks.navigation;

import demo.userInterface.CHomeInsuranceEnquiryDetailsPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class CNavigateTo {

    public static Performable homeInsuranceEnquiryDetailsPage() {
        return Task.where("{0} opens the home enquiry details page",
                Open.browserOn().the(CHomeInsuranceEnquiryDetailsPage.class)
        );
    }
}
