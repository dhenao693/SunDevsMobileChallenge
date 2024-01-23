package tasks.register;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static userinterface.HomePage.BTN_ALLOW_GET_LOCATION;
import static userinterface.HomePage.MENU_OPTION;

public class RegisterUser implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BTN_ALLOW_GET_LOCATION.of(MENU_OPTION)));
    }

    public static RegisterUser inApp(){
        return Tasks.instrumented(RegisterUser.class);
    }
}
