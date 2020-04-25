package demo.userInterface.enquiryDetailsPage;

import net.serenitybdd.screenplay.targets.Target;

public class CJointPolicyHoldersLocators {
    public static final Target POLICY_HOLDERS_YES_BUTTON = Target.the("Joint policyholders Yes button").locatedBy(".question-row-would-you-like-to-ad .btn:nth-child(1)");
    public static final Target POLICY_HOLDERS_NO_BUTTON = Target.the("Joint policyholders No button").locatedBy(".question-row-would-you-like-to-ad .btn:nth-child(2)");
}
