package demo.tasks.enquiryFormDetails.coverDetails;

import demo.userInterface.enquiryDetailsPage.CCoverDetailsLocators;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class CChooseCoverStartDate {

    public static Performable chooseTodayasStartDate( ) {
        return Task.where("{0} Choose Today as cover start date ",
                Click.on(CCoverDetailsLocators.COVER_DATE_TODAY)
        );
    }

    public static Performable chooseTomorrowasStartDate( ) {
        return Task.where("{0} Choose Tomorrow as cover start date ",
                Click.on(CCoverDetailsLocators.COVER_DATE_TOMORROW)
        );
    }
}
