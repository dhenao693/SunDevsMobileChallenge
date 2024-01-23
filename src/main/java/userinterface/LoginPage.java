package userinterface;

import net.serenitybdd.screenplay.targets.Target;

import static io.appium.java_client.AppiumBy.accessibilityId;

public class LoginPage {
    public static final Target BTN_REGISTER = Target.the("Login - Register option")
            .located(accessibilityId("Registrarse"));
}
