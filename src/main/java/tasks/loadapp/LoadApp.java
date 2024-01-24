package tasks.loadapp;

import interactions.WaitApp;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;

import static userinterface.StartAppPage.BTN_ALLOW_GET_LOCATION;

public class LoadApp implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actor.attemptsTo(
                //WaitApp.forSeconds(10),
                Check.whether(BTN_ALLOW_GET_LOCATION.isVisibleFor(actor))
                        .andIfSo(
                                Click.on(BTN_ALLOW_GET_LOCATION)
                        )
        );
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       // actor.attemptsTo(WaitApp.forSeconds(10));
    }

    public static LoadApp toStart() {
        return Tasks.instrumented(LoadApp.class);
    }
}
