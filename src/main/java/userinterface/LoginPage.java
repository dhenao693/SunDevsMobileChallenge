package userinterface;

import net.serenitybdd.screenplay.targets.Target;

import static io.appium.java_client.AppiumBy.xpath;
import static io.appium.java_client.AppiumBy.accessibilityId;

public class LoginPage {
    public static final Target LBL_USER = Target.the("")
            .located(xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[1]"));
    public static final Target LBL_PASSSWORD = Target.the("")
            .located(xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[2]"));
    public static final Target BTN_LOGIN = Target.the("")
            .located(accessibilityId("INICIAR SESIÓN"));
    public static final Target BTN_REGISTER = Target.the("Login - Register option")
            .located(accessibilityId("Registrarse"));
}
