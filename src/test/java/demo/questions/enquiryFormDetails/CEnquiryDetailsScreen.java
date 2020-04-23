package demo.questions.enquiryFormDetails;

import demo.userInterface.enquiryDetailsPage.CEnquiryDetailsLocators;

import java.util.List;
import java.util.stream.Collectors;

import net.serenitybdd.screenplay.Consequence;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class CEnquiryDetailsScreen {
    /**
     * Actor should see the enquiry details heading 8 sections
     * @param headings
     * @return
     */

    public static Consequence[] seeTheHeadings(List<String> headings) {
        return headings.stream().map(
                heading -> seeThat(the(CEnquiryDetailsLocators.HEADINGS.of(heading)), isVisible())
        ).collect(Collectors.toList()).toArray(new Consequence[]{});
    }

    public static  Consequence[] seeTheStages(List<String> stages) {
        return stages.stream().map(
                heading -> seeThat(the(CEnquiryDetailsLocators.STAGES.of(heading)), isVisible())
        ).collect(Collectors.toList()).toArray(new Consequence[]{});
    }
}
