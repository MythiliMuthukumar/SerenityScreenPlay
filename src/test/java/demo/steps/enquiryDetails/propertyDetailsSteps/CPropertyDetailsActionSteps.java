package demo.steps.enquiryDetails.propertyDetailsSteps;

import demo.tasks.enquiryFormDetails.enterPropertyDetails.CEnterPropertyAddressDetails;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CPropertyDetailsActionSteps {
    @When("he click the property address field without entering value")
    public void heClickThePropertyAddressFieldWithoutEnteringValue() {
        theActorInTheSpotlight().attemptsTo(CEnterPropertyAddressDetails.enterWithoutPropertyAddress());
    }

    @When("he starts to enter the address {string} in the property address field")
    public void heStartsTypingTheAddressInThePropertyAddressField(String propertyAddress) {
        theActorInTheSpotlight().attemptsTo(CEnterPropertyAddressDetails.startTypingPropertyAddress(propertyAddress));
    }
}
