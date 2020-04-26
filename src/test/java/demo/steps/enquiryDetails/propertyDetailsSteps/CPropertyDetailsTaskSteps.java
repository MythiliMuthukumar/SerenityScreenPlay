package demo.steps.enquiryDetails.propertyDetailsSteps;

import demo.tasks.enquiryFormDetails.propertyDetails.CEnterPropertyAddressDetails;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.withCurrentActor;

public class CPropertyDetailsTaskSteps {
    @When("he click the property address field without entering value")
    public void heClickThePropertyAddressFieldWithoutEnteringValue() {
        withCurrentActor(CEnterPropertyAddressDetails.enterWithoutPropertyAddress());
    }

    @When("he starts to enter the address {string} in the property address field")
    public void heStartsTypingTheAddressInThePropertyAddressField(String propertyAddress) {
        withCurrentActor(CEnterPropertyAddressDetails.startTypingPropertyAddress(propertyAddress));
    }
    @And("he click the {string} button")
    public void heClickTheButton(String arg0) {
    }
}
