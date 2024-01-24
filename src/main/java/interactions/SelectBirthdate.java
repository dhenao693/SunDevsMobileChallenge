package interactions;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static userinterface.RegisterForm.BTN_BIRTHDATE;
import static userinterface.RegisterForm.BTN_EDIT_DATE;

@AllArgsConstructor
public class SelectBirthdate implements Interaction {
    private String date;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_BIRTHDATE),
                Click.on(BTN_EDIT_DATE),
                Enter.theValue(date).into(BTN_EDIT_DATE)
        );
    }

    public static SelectBirthdate of(String date){
        return Tasks.instrumented(SelectBirthdate.class,date);
    }
}
