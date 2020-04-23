package demo.userInterface.enquiryDetailsPage;

import net.serenitybdd.screenplay.targets.Target;

public class CEnquiryDetails {

    public static final Target HEADINGS = Target.the("'{0}' headings").locatedBy(" //div[@role='heading' and text()='{0}']");
    public static Target COMPARE_QUOTES_BUTTON = Target.the("Go to compare quotes button").locatedBy(".btn-success");
}
