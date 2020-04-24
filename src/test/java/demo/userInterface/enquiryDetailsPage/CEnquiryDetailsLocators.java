package demo.userInterface.enquiryDetailsPage;

import net.serenitybdd.screenplay.targets.Target;

public class CEnquiryDetailsLocators {

    public static final Target HEADINGS = Target.the("'{0}' Headings").locatedBy(" //div[@role='heading' and text()='{0}']");
    public static final Target COMPARE_QUOTES_BUTTON = Target.the("Go to compare quotes button").locatedBy(".btn-success");
    public static final Target STAGES = Target.the("'{0}' Stage").locatedBy("//li[@class='crumb-stage']//span[contains(.,'{0}')]");
    public static final Target VALIDATION_MESSAGE = Target.the("Validation Message").locatedBy(".alert-warning");

}
