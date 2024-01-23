package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import tasks.register.RegisterUser;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class Register {
    @Given("he registers in the app")
    public void registerInApp() {
        theActorInTheSpotlight().attemptsTo(
                RegisterUser.inApp()
        );
    }

    @Then("see register confirmation")
    public void seeRegisterConfirmation() {
        theActorInTheSpotlight().should(
                //GivenWhenThen.seeThat(true,true)
        );
    }
}
