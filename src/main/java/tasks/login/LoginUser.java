package tasks.login;

import interactions.GoToProfile;
import lombok.AllArgsConstructor;
import models.User;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import utility.GenericsConstants;

import java.util.List;
import java.util.Map;


import static userinterface.LoginPage.*;
import static utility.ConvertMapToModel.convertMapToUser;
import static utility.GenericsConstants.USER_IN_MEMORY;

@AllArgsConstructor
public class LoginUser implements Task {
    private List<Map<String, String>> users;
    @Override
    public <T extends Actor> void performAs(T actor) {
        User user = convertMapToUser(users.get(0));
        actor.remember(USER_IN_MEMORY.toString(),user);
        actor.attemptsTo(
                Click.on(LBL_USER),
                Enter.theValue(user.getEmail()).into(LBL_USER),
                Click.on(LBL_PASSSWORD),
                Enter.theValue(user.getPassword()).into(LBL_PASSSWORD),
                Click.on(BTN_LOGIN)
        );
    }

    public static LoginUser inApp(List<Map<String, String>> users) {
        return Tasks.instrumented(LoginUser.class, users);
    }
}
