package demo.userInterface.enquiryDetailsPage;

import net.serenitybdd.screenplay.targets.Target;

public class CEnquiryDetailsLocators {

    public static final Target HEADINGS = Target.the("'{0}' headings").locatedBy(" //div[@role='heading' and text()='{0}']");
    public static Target COMPARE_QUOTES_BUTTON = Target.the("Go to compare quotes button").locatedBy(".btn-success");
    public static Target STAGES = Target.the("Stage").locatedBy("//li[@class='crumb-stage']//span[contains(.,'{0}')]");
}
