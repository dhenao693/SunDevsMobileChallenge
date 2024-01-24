package interactions;

import lombok.AllArgsConstructor;
import models.User;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static userinterface.RegisterForm.*;

@AllArgsConstructor
public class FillFormNaturalPerson implements Interaction {
    private User user;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LBL_NAME),
                Enter.theValue(user.getName()).into(LBL_NAME),
                Click.on(LBL_LASTNAME),
                Enter.theValue(user.getLastName()).into(LBL_LASTNAME),
                Click.on(LBL_EMAIL),
                Enter.theValue(user.getEmail()).into(LBL_EMAIL),
                Click.on(LBL_RETRY_EMAIL),
                Enter.theValue(user.getEmail()).into(LBL_RETRY_EMAIL),
                Click.on(LBL_PHONE),
                Enter.theValue(user.getPhone()).into(LBL_PHONE),
                Click.on(LBL_ADDRESS),
                Enter.theValue(user.getAddress()).into(LBL_ADDRESS),
                Click.on(LST_GENDER),
                Click.on(BTN_OPTION_FROM_LIST.of(user.getGender())),
                //SelectBirthdate.of(user.getBirthdate()),
                Click.on(LST_DOCUMENT_TYPE),
                Click.on(BTN_OPTION_FROM_LIST.of(user.getPersonType()))

        );

    }

    public static FillFormNaturalPerson toRegister(User user) {
        return Tasks.instrumented(FillFormNaturalPerson.class,user);
    }
}
