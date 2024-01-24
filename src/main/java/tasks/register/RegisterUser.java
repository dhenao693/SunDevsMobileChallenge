package tasks.register;

import interactions.FillFormJuridicPerson;
import interactions.FillFormNaturalPerson;
import lombok.AllArgsConstructor;
import models.User;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;

import java.util.List;
import java.util.Map;

import static userinterface.HomePage.MENU;
import static userinterface.LoginPage.BTN_REGISTER;
import static userinterface.MenuOptionsPage.BTN_PROFILE;
import static userinterface.RegisterForm.*;
import static utility.ConvertMapToModel.convertMapToUser;

@AllArgsConstructor
public class RegisterUser implements Task {
    private List<Map<String, String>> users;

    @Override
    public <T extends Actor> void performAs(T actor) {
        User user = convertMapToUser(users.get(0));
        actor.remember("USER",user);
        actor.attemptsTo(Click.on(MENU),
                Click.on(BTN_PROFILE),
                Click.on(BTN_REGISTER),
                Click.on(LST_PERSON_TYPE),
                Click.on(BTN_OPTION_FROM_LIST.of(user.getPersonType())),
                Check.whether(user.getPersonType().equals("Natural"))
                        .andIfSo(
                                FillFormNaturalPerson.toRegister(user)
                        )
                        .otherwise(
                                FillFormJuridicPerson.toRegister(user)
                        ));

        System.out.println("Hola");
    }

    public static RegisterUser inApp(List<Map<String, String>> users) {
        return Tasks.instrumented(RegisterUser.class, users);
    }
}
