package userinterface;

import net.serenitybdd.screenplay.targets.Target;

import static io.appium.java_client.AppiumBy.accessibilityId;

public class GeneralPage {
    public static final Target BTN_CONTINUE = Target.the("")
            .located(accessibilityId("CONTINUAR"));

    public static final Target BTN_ACCEPT = Target.the("")
            .located(accessibilityId("ACEPTAR"));

    public static final Target LBL_SELECT_OPTION_BY_ACC_ID = Target.the("")
            .locatedBy("//android.widget.Button[contains(@content-desc,'{0}')]");
}
