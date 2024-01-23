package stepdefinitions;


import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActor;

public class Hook {
    @Managed(driver = "Appium")
    public static WebDriver driver;

    @Before
    public void inicializar(){
        setTheStage(new OnlineCast());
        theActor("Robin");
    }

}
