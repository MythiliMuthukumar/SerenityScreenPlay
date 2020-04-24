package demo.custom_Interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.Tasks.instrumented;

/**
 * Custom Action using a low-level WebDriver API
 */
public class CElementsClick implements Interaction {

    private final By inputField;
    int id;

    public CElementsClick(By inputField, int id) {
        this.inputField = inputField;
        this.id = id;
    }

    public <T extends Actor> void performAs(T actor) {

        BrowseTheWeb.as(actor).findAll(inputField).get(id).click();
    }

    public static CElementsClick on(By inputField, int id) {
        return instrumented(CElementsClick.class, inputField, id);
    }
}
