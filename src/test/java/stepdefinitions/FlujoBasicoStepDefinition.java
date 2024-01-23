package stepdefinitions;


import io.cucumber.java.es.Cuando;
import tasks.Elegir;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FlujoBasicoStepDefinition {


    @Cuando("^El usuario elige el producto (.*) la manera de entrega (.*) y la tienda de preferencia (.*)$" )
    public void elUsuarioEligeComoYDondeQuiereElPedidoConLosSiguientesDatos(String producto, String modoPedido, String lugarPedido) throws Exception {
        theActorInTheSpotlight().attemptsTo(Elegir.unServicio(modoPedido,lugarPedido,producto));
        Thread.sleep(5000);
    }
}