package interactions;

import lombok.AllArgsConstructor;
import models.User;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

@AllArgsConstructor
public class FillFormJuridicPerson implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo();
    }

    public static FillFormJuridicPerson toRegister(User user) {
        return Tasks.instrumented(FillFormJuridicPerson.class, user);
    }
}
