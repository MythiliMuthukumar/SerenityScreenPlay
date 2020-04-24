package demo.userInterface.enquiryDetailsPage;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CStatementsAboutYouLocators {

    public static final By I_AGREE_BUTTON = By.xpath("//button[contains(.,'I agree')]");
    public static final By I_DISAGREE_BUTTON = By.xpath("//button[contains(.,'I disagree')]");
    public   static final Target SELECTED_I_AGREE_BUTTON = Target.the("I agree button selected").locatedBy("//div[contains(@class,'row question-row-do-you-agree-with-th')]//button[contains(@class,'btn-default-selected') and contains(.,'I agree')]");
    public   static final Target SELECTED_I_DISAGREE_BUTTON = Target.the("I disagree question section").locatedBy("//div[@class='row question-row-your-property-is-not']");

}
