package demo.userInterface.enquiryDetailsPage;

import net.serenitybdd.screenplay.targets.Target;

public class CCoverDetailsLocators {
    public static final Target COVER_DATE_TODAY = Target.the("Cover Start Date Today Button").locatedBy(".input-group-btn:nth-child(2) > .btn");
    public static final Target COVER_DATE_TOMORROW = Target.the("Cover Start Date Tomorrow Button").locatedBy(".input-group-btn:nth-child(3) > .btn");
    public static final Target COVER_DATE_FIELD = Target.the("Cover Start Date field").locatedBy(".rdt > .form-control");

}
