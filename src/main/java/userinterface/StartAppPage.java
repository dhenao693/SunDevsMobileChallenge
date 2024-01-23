package userinterface;

import net.serenitybdd.screenplay.targets.Target;

import static io.appium.java_client.AppiumBy.accessibilityId;

public class StartAppPage {
    public static final Target BTN_ALLOW_GET_LOCATION = Target.the("Allow get location in app").located(accessibilityId("PERMITIR OBTENER UBICACIÓN"));
}
