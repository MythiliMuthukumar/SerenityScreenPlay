package demo.userInterface.enquiryDetailsPage;

import net.serenitybdd.screenplay.targets.Target;

public class CPropertyDetailsLocators {
    public   static final Target PROPERTY_ADDRESS = Target.the("Property Address").locatedBy("div:nth-child(1) > .lookup > .form-control");
    public   static final Target CORRESPONDENCE_ADDRESS = Target.the("Correspondence Address").locatedBy(".question-row-is-this-the-same-as > .col-xs-10");
    public   static final Target MANUAL_ADDRESS_BUTTON = Target.the("Manual Address").locatedBy(".manual-button > .btn");
    public   static final Target ADDRESS_SUGGESTION_DROPDOWN = Target.the("Address Suggestion dropdown").locatedBy("//ul[@class='list-group']");

}
