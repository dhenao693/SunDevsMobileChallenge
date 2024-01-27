package tasks.loadapp;

import interactions.waits.WaitPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;

import static userinterface.StartAppPage.BTN_ALLOW_GET_LOCATION;

public class LoadApp implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitPage.aSeconds(10),
                Check.whether(BTN_ALLOW_GET_LOCATION.isVisibleFor(actor))
                        .andIfSo(
                                Click.on(BTN_ALLOW_GET_LOCATION)
                        )
        );

        actor.attemptsTo(
                WaitPage.aSeconds(10));
    }

    public static LoadApp toStart() {
        return Tasks.instrumented(LoadApp.class);
    }
}
