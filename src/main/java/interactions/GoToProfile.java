package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static userinterface.HomePage.MENU;
import static userinterface.MenuOptionsPage.BTN_PROFILE;

public class GoToProfile implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(MENU),
                Click.on(BTN_PROFILE));
    }

    public static GoToProfile inApp() {
        return Tasks.instrumented(GoToProfile.class);
    }
}
