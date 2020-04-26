package demo.tasks.enquiryFormDetails.propertyDetails;


import demo.userInterface.enquiryDetailsPage.CPropertyDetailsLocators;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static org.openqa.selenium.Keys.RETURN;

public class CEnterPropertyAddressDetails {
    public static Performable enterWithoutPropertyAddress() {
        return Task.where("{0} Click on another field without entering his property address ",
                Clear.field(CPropertyDetailsLocators.PROPERTY_ADDRESS),
                Click.on(CPropertyDetailsLocators.PROPERTY_ADDRESS),
                Click.on(CPropertyDetailsLocators.CORRESPONDENCE_ADDRESS)
        );
    }

    public static Performable startTypingPropertyAddress(String propertyAddress) {
        return Task.where("{0} Start Typing his property address #propertyAddress",
                Clear.field(CPropertyDetailsLocators.PROPERTY_ADDRESS),
                Enter.theValue(propertyAddress).into(CPropertyDetailsLocators.PROPERTY_ADDRESS).thenHit(RETURN)
        ).with("propertyAddress").of(propertyAddress);
    }
}
