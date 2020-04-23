package demo.stepDefinitions;

import demo.tasks.navigation.CNavigateTo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.ensure.Ensure;

import java.util.List;

import static demo.questions.enquiryFormDetails.CEnquiryDetailsScreen.seeTheHeadings;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class CEnquiryFormPersonalDetailsStepDefinitions {

    @Given("{string} is on the home insurance enquiry details page")
    public void actorisOnTheHomeInsuranceEnquiryDetailsPage(String actor) {
        theActorCalled(actor).attemptsTo(CNavigateTo.homeInsuranceEnquiryDetailsPage());
    }

    @Then("He should see the page title {string}")
    public void actorShouldSeeThePageTitle(String pageTitle) {
        theActorInTheSpotlight().attemptsTo(Ensure.thatTheCurrentPage().title().isEqualTo(pageTitle));
    }

    @Then("He should see the following stages are disabled")
    public void actorShouldSeeTheFollowingStagesAreDisabled(List<String> disabledStages) {
    }

    @Then("He should see the following section headings")
    public void actorShouldSeeTheFollowingSectionHeadings(List<String> headings) {
        theActorInTheSpotlight().should(
                seeTheHeadings(headings)
        );
    }

    @Then("He should see {string} button")
    public void actorShouldSeeButton(String arg0) {
    }

    @When("He enters first name as {string}")
    public void heEntersFirstNameAs(String firstName) {
    }

    @Then("He should see the {string} in the first name field")
    public void heShouldSeeTheInTheFirstNameField(String firstName) {
    }
}
