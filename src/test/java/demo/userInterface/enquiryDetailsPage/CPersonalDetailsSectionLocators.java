package demo.userInterface.enquiryDetailsPage;

import net.serenitybdd.screenplay.targets.Target;


public class CPersonalDetailsSectionLocators {

    public static final Target TITLE = Target.the("Title").locatedBy(".question-row-title .form-control");
    public static final Target FIRST_NAME = Target.the("First Name").locatedBy(".question-row-first-name .form-control");
    public static final Target LAST_NAME = Target.the("Last Name").locatedBy(".question-row-last-name .form-control");
    public static final Target MARITAL_STATUS = Target.the("Marital Status").locatedBy(".question-row-what-is-your-marital .form-control");
    public static final Target DOB_DAY = Target.the("DOB Day").locatedBy(".col-xs-4:nth-child(1) > .form-control");
    public static final Target DOB_MONTH = Target.the("DOB Month").locatedBy(".col-xs-4:nth-child(2) > .form-control");
    public static final Target DOB_YEAR = Target.the("DOB Year").locatedBy(".col-xs-4:nth-child(3) > .form-control");
    public static final Target OCCUPATION = Target.the("Occupation").locatedBy(".questionset-input > .lookup > .form-control");
    public static final Target TELEPHONE_NUMBER = Target.the("Telephone Number").locatedBy(".question-row-main-telephone-numbe .form-control");
    public static final Target EMAIL = Target.the("Email").locatedBy(".question-row-what-is-your-e-mail .form-control");
    public static final Target ANYBODY_SMOKE_YES_BUTTON = Target.the("Anbody Smoke-Yes").locatedBy(".question-row-does-anybody-living .btn:nth-child(1)");
    public static final Target ANYBODY_SMOKE_NO_BUTTON = Target.the("Anbody Smoke-No").locatedBy(".question-row-does-anybody-living .btn:nth-child(2)");
    public static final Target OCCUPATION_DROPDOWN = Target.the("Occupation suggestion dropdown").locatedBy(".question-row-does-anybody-living .btn:nth-child(2)");

    //Help Buttons
    public static final Target TITLE_HELP_BUTTON = Target.the("Title Help Button").locatedBy(".question-row-title .btn");
    public static final Target FIRST_NAME_HELP_BUTTON = Target.the("First Name Help Button").locatedBy(".question-row-first-name .btn");
    public static final Target LAST_NAME_HELP_BUTTON = Target.the("Last Name Help Button").locatedBy(".question-row-last-name .btn");
    public static final Target DATE_OF_BIRTH_HELP_BUTTON = Target.the("Date Of Birth Help Button").locatedBy(".question-row-what-is-your-date-of .btn");
    public static final Target OCCUPATION_HELP_BUTTON = Target.the("Occupation Help Button").locatedBy(".question-row-what-is-your-occupat .btn");
    public static final Target ANYBODY_SMOKE_HELP_BUTTON = Target.the("Anbody Smoke Help Button").locatedBy(".question-row-does-anybody-living > .col-xs-2 .btn");
    public static final Target EMAIL_HELP_BUTTON = Target.the("Email Help Button").locatedBy(".question-row-what-is-your-e-mail .btn");


}
