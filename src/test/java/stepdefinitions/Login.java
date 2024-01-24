package stepdefinitions;

import interactions.GoToProfile;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import questions.SeeEmail;
import tasks.login.LoginUser;
import tasks.register.RegisterUser;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class Login {

    @When("he login in app")
    public void registerInApp(List<Map<String,String>> users) {
        theActorInTheSpotlight().attemptsTo(
                LoginUser.inApp(users)
        );
    }

    @When("see the profile")
    public void seeProfile() {
        theActorInTheSpotlight().attemptsTo(
                GoToProfile.inApp()
        );
    }

    @Then("see the correct email")
    public void seeEmail() {
        theActorInTheSpotlight().should(seeThat(SeeEmail.inProfile()));
    }
}
