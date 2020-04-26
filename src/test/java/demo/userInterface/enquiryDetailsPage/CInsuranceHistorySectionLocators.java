package demo.userInterface.enquiryDetailsPage;

import net.serenitybdd.screenplay.targets.Target;

public class CInsuranceHistorySectionLocators {
    public static final Target CONSECUTIVE_YEAR_OPTIONS = Target.the("'{0}'Insurance History").locatedBy("//select[@class='form-control']//option[contains(.,'{0}')]");
}
