package demo.tasks.navigation;

import demo.DuckDuckGoHomePage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class CNavigateTo {
    public static Performable enquiryDetailsPage() {
        return Task.where("{0} opens the Enquiry Details page",
                Open.browserOn().the(DuckDuckGoHomePage.class)
        );
    }
}