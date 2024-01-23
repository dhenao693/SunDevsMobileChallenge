package userinterface;

import net.serenitybdd.screenplay.targets.Target;

import static io.appium.java_client.AppiumBy.accessibilityId;

public class MenuOptionsPage {
    public static final Target BTN_PROFILE = Target.the("Menu - Profile option")
            .located(accessibilityId("Perfil"));
}
