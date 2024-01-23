package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import static userinterface.FlujoBasicoPage.*;

public class Elegir implements Task {

    private String modoPedido;
    private String lugarPedido;
    private String producto;

    public Elegir(String modoPedido, String lugarPedido,String producto) {
        this.modoPedido = modoPedido;
        this.lugarPedido = lugarPedido;
        this.producto = producto;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_OPCION_PEDIDO.of(modoPedido), isEnabled()),
                Click.on(BTN_OPCION_PEDIDO.of(modoPedido)),
                WaitUntil.the(LBL_LOCAL.of(lugarPedido), isVisible()),
                Click.on(LBL_LOCAL.of(lugarPedido)));

        actor.attemptsTo(
                Check.whether(OTRO_PLATO.resolveFor(actor).isVisible()).andIfSo(
                        WaitUntil.the(OTRO_PLATO, isClickable()).forNoMoreThan(8000).milliseconds(),
                        Click.on(OTRO_PLATO),

                        WaitUntil.the(TAMANIO, isEnabled()),
                        Click.on(TAMANIO),
                        Click.on(BTN_SIGUIENTE)

                ).otherwise(
                        WaitUntil.the(ADICIONAR_PRODUCTO.of(producto), isVisible()),
                        Click.on(ADICIONAR_PRODUCTO.of(producto)),
                        Click.on(VER_CARRITO.of(lugarPedido)),
                        Click.on(BTN_METODO_PAGO)
                )
        );
    }


    public static Elegir unServicio(String modoPedido, String lugarPedido,String producto){

        return Tasks.instrumented(Elegir.class,modoPedido,lugarPedido,producto);
    }

}
