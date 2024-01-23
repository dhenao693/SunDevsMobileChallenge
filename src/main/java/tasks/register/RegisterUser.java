package tasks.register;

import lombok.AllArgsConstructor;
import models.User;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

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
        actor.attemptsTo(Click.on(MENU));
        actor.attemptsTo(Click.on(BTN_PROFILE));
        actor.attemptsTo(Click.on(BTN_REGISTER));
        actor.attemptsTo(Enter.theValue(user.getName()).into(LBL_NAME));
        actor.attemptsTo(Enter.theValue(user.getLastName()).into(LBL_LASTNAME));
        actor.attemptsTo(Enter.theValue(user.getEmail()).into(LBL_EMAIL));
        actor.attemptsTo(Enter.theValue(user.getEmail()).into(LBL_RETRY_EMAIL));
        actor.attemptsTo(Enter.theValue(user.getPhone()).into(LBL_PHONE));
        actor.attemptsTo(Enter.theValue(user.getAddress()).into(LBL_ADDRESS));

        System.out.println("Hola");
    }

    public static RegisterUser inApp(List<Map<String, String>> users) {
        return Tasks.instrumented(RegisterUser.class, users);
    }
}
