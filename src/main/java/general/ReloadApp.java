package general;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;

import static userinterface.loadapp.DontLoadAppPage.BTN_REINTENTAR;
import static userinterface.loadapp.DontLoadAppPage.LBL_NO_CARGO_LA_APP;


public class ReloadApp implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Check.whether(LBL_NO_CARGO_LA_APP.resolveFor(actor).isVisible())
                        .andIfSo(Click.on(BTN_REINTENTAR))
        );
    }

    public static ReloadApp toContinue(){
        return Tasks.instrumented(ReloadApp.class);
    }
}
