package stepdefinitions;


import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import tasks.loadapp.LoadApp;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActor;

public class Hook {
    @Managed(driver = "Appium")
    public static WebDriver driver;

    @Before
    public void initializer() {
        setTheStage(new OnlineCast());
        theActor("Default");
    }

    @Given("{string} is on cinemark app")
    public void isOnCinemarkApp(String actorName) {
        theActor(actorName).attemptsTo(
                LoadApp.toStart()
        );
    }
}
