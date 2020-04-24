package demo.userInterface.enquiryDetailsPage;

import net.serenitybdd.screenplay.targets.Target;


public class CPersonalDetailsSectionLocators {

    public static final Target FIRST_NAME = Target.the("First Name").locatedBy(".question-row-first-name .form-control");
    public static final Target LAST_NAME = Target.the("Last Name").locatedBy(".question-row-last-name .form-control");

   //Help Buttons
    public static final Target TITLE_HELP_BUTTON = Target.the("Title Help Button").locatedBy(".question-row-title .btn");
    public static final Target FIRST_NAME_HELP_BUTTON = Target.the("First Name Help Button").locatedBy(".question-row-first-name .btn");
    public static final Target LAST_NAME_HELP_BUTTON = Target.the("Last Name Help Button").locatedBy(".question-row-last-name .btn");
    public static final Target DATE_OF_BIRTH_HELP_BUTTON = Target.the("Date Of Birth Help Button").locatedBy(".question-row-what-is-your-date-of .btn");
    public static final Target OCCUPATION_HELP_BUTTON = Target.the("Occupation Help Button").locatedBy(".question-row-what-is-your-occupat .btn");
    public static final Target ANYBODY_SMOKE_HELP_BUTTON = Target.the("Anbody Smoke Help Button").locatedBy(".question-row-does-anybody-living > .col-xs-2 .btn");
    public static final Target EMAIL_HELP_BUTTON = Target.the("Email Help Button").locatedBy(".question-row-what-is-your-e-mail .btn");


}
