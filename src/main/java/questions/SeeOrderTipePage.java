package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static userinterface.FlujoBasicoPage.LBL_COMO_QUIERES_TU_PEDIDO;

public class SeeOrderTipePage implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return LBL_COMO_QUIERES_TU_PEDIDO.resolveFor(actor).isPresent();
    }

    public static SeeOrderTipePage inApp(){
        return new SeeOrderTipePage();
    }
}
