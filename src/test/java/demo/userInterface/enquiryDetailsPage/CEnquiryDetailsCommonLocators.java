package demo.userInterface.enquiryDetailsPage;

import net.serenitybdd.screenplay.targets.Target;

public class CEnquiryDetailsCommonLocators {

    public static final Target HEADINGS = Target.the("'{0}' Headings").locatedBy(" //div[@role='heading' and text()='{0}']");
    public static final Target COMPARE_QUOTES_BUTTON = Target.the("Go to compare quotes button").locatedBy(".btn-success");
    public static final Target STAGES = Target.the("'{0}' Stage").locatedBy("//li[@class='crumb-stage']//span[contains(.,'{0}')]");
    public static final Target VALIDATION_MESSAGE = Target.the("Validation Message").locatedBy(".alert-warning");
    public static final Target QUESTION_LABEL = Target.the("'{0}' Question").locatedBy("//p[contains(.,'{0}')]");
    public static final Target DROPDOWN_OPTIONS = Target.the("'{0}' DropDown Option").locatedBy("//select[@class='form-control']//option[contains(.,'{0}')]");
}

