package demo.userInterface.enquiryDetailsPage;

import net.serenitybdd.screenplay.targets.Target;

public class CSafetyAndSecuritySectionLocators {
    public static final Target WINDOWS_KEY_LOCKS_YES_BUTTON = Target.the("Windows Key Operated Yes button").locatedBy(".question-row-do-all-externally-ac .btn:nth-child(1)");
    public static final Target WINDOWS_KEY_LOCKS_NO_BUTTON = Target.the("Windows Key Operated No button").locatedBy(".question-row-do-all-externally-ac .btn:nth-child(2)");
    public static final Target DOOR_LOCKTYPE = Target.the("'{0}' Front door lock type").locatedBy("//span[contains(.,'{0}')]");
    public static final Target SELF_CONTAINED_YES_BUTTON = Target.the("Self_Contained Yes button").locatedBy(".question-row-is-your-property-sel .btn:nth-child(1)");
    public static final Target SELF_CONTAINED_NO_BUTTON = Target.the(" Self_Contained No button").locatedBy(".question-row-is-your-property-sel .btn:nth-child(2)");
    public static final Target SELF_CONTAINED_LOCK_IMAGES = Target.the(" '{0}'Self_Contained Lock type images").locatedBy(".panel:nth-child({0}) .img-responsive");
}

