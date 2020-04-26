package demo.steps.enquiryDetails.propertyDetailsSteps;

import demo.exceptions.CEnquiryFormDetailsPageException;
import demo.userInterface.enquiryDetailsPage.CPropertyDetailsLocators;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.ensure.Ensure;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class CPropertyDetailsAssertionSteps {

    @Then("he should see {string} text in the address of property field")
    public void heShouldSeeTextInTheAddressOfPropertyField(String placeholderText) {
        theActorInTheSpotlight().attemptsTo(Ensure.that(CPropertyDetailsLocators.PROPERTY_ADDRESS)
                .attribute("placeholder").isEqualTo(placeholderText));
    }

    @Then("he should see the {string} button")
    public void heShouldSeeTheButton(String manualbutton) {
        theActorInTheSpotlight().should(
                seeThat(the(CPropertyDetailsLocators.MANUAL_ADDRESS_BUTTON),isPresent()
                ).orComplainWith(CEnquiryFormDetailsPageException.class,
                        String.format("Missing Button '%s'", manualbutton)));
    }

    @Then("he should see the address suggestion dropdown")
    public void heShouldSeeTheAddressSuggestionDropdown() {
        theActorInTheSpotlight().should(
                seeThat(the(CPropertyDetailsLocators.ADDRESS_SUGGESTION_DROPDOWN),isPresent()
                ).orComplainWith(CEnquiryFormDetailsPageException.class,
                        ("Missing Property Address suggestion dropdown")));
    }

    @Then("he should see the label and empty field for {string}")
    public void heShouldSeeTheLabelAndEmptyFieldFor(String arg0) {
    }

    @Then("he should see the address section {string} button")
    public void heShouldSeeTheAddressSectionButton(String arg0) {
    }
}
