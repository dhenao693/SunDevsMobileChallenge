package stepdefinitions;


import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import questions.SeeOrderTipePage;
import tasks.loadapp.LoadApp;

import static net.serenitybdd.screenplay.actors.OnStage.theActor;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CargarAplicacionStepDefinition {

    @Dado("^que (.*) se encuentra en la aplicacion de robinfood en la ciudad de (.*) en (.*)$")
    public void queDanielSeEncuentraEnLaAplicacionDeRobinfoodEnLaCiudadDeMedellinEnColombia(String actorName,String city, String country ) {
        theActor(actorName).attemptsTo(LoadApp.toStartThePurchaseIn(country, city));
    }

    @Entonces("^debe visualizar el menu de tipos de compra$")
    public void debeVisualizarElMenuDeTiposDeCompra() {
        theActorInTheSpotlight().should(seeThat(SeeOrderTipePage.inApp()));
    }

}
