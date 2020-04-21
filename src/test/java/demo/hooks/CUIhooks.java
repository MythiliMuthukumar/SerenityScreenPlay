package demo.hooks;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class CUIhooks {
    @Before(value = "@ui", order = 0)
    public void initializeUI() {
        OnStage.setTheStage(new OnlineCast());
    }
}
