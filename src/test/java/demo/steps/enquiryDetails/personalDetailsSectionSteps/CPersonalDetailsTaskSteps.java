package demo.steps.enquiryDetails.personalDetailsSectionSteps;

import demo.tasks.enquiryFormDetails.personalDetails.CEnterPersonalDetails;

import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class CPersonalDetailsTaskSteps {

    @When("he enters first name as {string}")
    public void actorEntersFirstNameAs(String firstName) {
        withCurrentActor(CEnterPersonalDetails.enterFirstName(firstName));
    }

    @When("he click the first name field without entering value")
    public void heClickTheFirstNameFieldWithoutEnteringValue() {
        withCurrentActor(CEnterPersonalDetails.enterWithoutFirstName());
    }

    @When("he select {string} from title dropdown")
    public void heSelectFromTitleDropdown(String titleOption) {
        withCurrentActor(CEnterPersonalDetails.selectTitleFromDropDown(titleOption));
    }

}
